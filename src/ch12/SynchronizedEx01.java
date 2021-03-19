package ch12;

// 동기화 코드
// 여기에서는 열차예매시스템이라고 가정한후
// 여러 매표소에서 쓰레드를 이용해서 좌석을 예매하고 현재 잔여 좌석이 1개 남았을때, 
// 여러 쓰레드에서 동시에 열차를 예매하는 메소드에 접근할 수 있다고 가정하자.
// => 잔여 좌석은 1개인데, 여러 쓰레드에서 동시에 메소드에 접근해서 예매처리가 된다.
//    이런 경우의 작업을 처리할 때는 한 쓰레드가 메서드에 접근해서 예매 작업을 실행할때에는
// 	    다른 쓰레드에서는 해당 메소드에 접근할 수 없게 처리하는 작업이 필요하다.
//		==> 이런 작업을 동기화 작업(Synchronized)라고 한다.

// 동기화를 지정한 경우
public class SynchronizedEx01 {

		public static void main (String[] args) {
			Ticket01 tk = new Ticket01();
			Thread tr1 = new Thread(tk,"A구매자");
			Thread tr2 = new Thread(tk,"B구매자");
			tr1.start();
			tr2.start();
			
		}
}
//예매작업
class Ticket01 implements Runnable{

//	잔여 좌석수 
	int ticketNum=10;
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++ ) {
			//티켓 구매 함수 호출 
			try {
				Thread.sleep(500);
				getTicket();//티켓구매함수호출
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//
	
//	티켓  구매 함수
public synchronized void getTicket() {
//public void getTicket() {
	ticketNum -= 1;
	System.out.print(Thread.currentThread().getName()+" 구매");
	if(ticketNum<=0) {
		System.out.println(" 잔여 좌석티켓이 없습니다.");
		return;
	}
	System.out.println(" 현재 잔여 좌석 수 : "+ticketNum+"입니다");
	}
	
}


























