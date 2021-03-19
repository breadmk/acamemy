package ch12;

/*	손님수가 제한된 식당 프로그램이라고 가정하자
 *  식당에서 자리가 비면 손님을 다시 채우는 작업을 구현
 *  만약에 손님의 수가 가득 찼다면, 손님을 더 들이면 안된다.
 *  식당이 허용할 수 있는 인원이 가득차면, 손님을 채우는 쓰레드를 wait()메서드를 호출해서
 *  waiting pool에 대기시키는 방법을 사용하겠다.
 */

// 이 클래스는 손님이 들어오고 나가는 기능을 정의한 클래스를 구현하는 클래스
public class InOutEx {
//	손님의 수
	public static int MAX_GUEST = 5;	
	public static int MIN_GUEST = 0;	
	int guestNum =0;	//현재 손님의 수
	
	public synchronized void inGuest() {
		System.out.println("Guest 입장!");
		guestNum++;
		System.out.println("현재 Guest 수 : "+ guestNum);
//		식당이 허용할 수 있는 인원이 가득차면, 손님을 채우는 쓰레드를 wait()메서드를 호출해서
		if(guestNum==MAX_GUEST) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void outGuest() {
		guestNum--;
		System.out.println("Guest 퇴장! 현재 매장내 손님의 수: " + guestNum + "입니다.");
		if(guestNum<5) {
			notify();
			return;
		}else if(guestNum<1) {
			guestNum=MIN_GUEST;
			notify();
			return;
			
		}
	}
	
	public static void main(String[] args) {
		InOutEx io = new InOutEx();
		InGuestThread igt = new InGuestThread(io);
		OutGuestThread ogt = new OutGuestThread(io);
			igt.start();
			ogt.start();
		
		
	}

}





















