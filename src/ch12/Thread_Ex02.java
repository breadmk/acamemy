package ch12;

// 방법2. Runnable 인터페이스를 구현해서 정의하기.
public class Thread_Ex02 {    

	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//		이름을 제시하지 않으면 이름 자동생성 Thread01
		
		YourThread your = new YourThread();
//		Thread(Runnable target, String name)
		Thread yourThread = new Thread(your,"너의 쓰레드");
//		YourThread 클래스 자체가 Thread 클래스가 아니므로 Thread 클래스의 생성자를
//		이용해서 Thread 객체를 생성.
		yourThread.start();//myThread 를 시작시키는 부분
		
//		start()메서드를 호출하면 새로운 callback을 할당받고
//		Runnable 상태가 되었다가 쓰레드 스케쥴러에 의해서 선택이 되면
//		해당 쓰레드의 run()가 실행된다.
		
		
		
		
	}
}
//Runnable 인터페이스를 구현해서 정의하기.
//Runnable 인터페이스에는 void run() 메서드만 있다.
//아래의 클래스는 Runnable 인터페이스를 구현하는 클래스일뿐이다.
class YourThread  implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.print(Thread.currentThread().getName());
				try {
					Thread.sleep(300);
					System.out.print("작동중");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println();
			}
			
	}



//	@Override
//	public void run() {
//		for(int i=1; i<=20; i++) {
////			public static Thread currentThread() : 현재 실행중인 스레드 이름 가져오기
//			System.out.print(currentThread().getName());
//			try {
//				sleep(300);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.print("작동중"); //현재 실행중인 쓰레드의 이름 가져오기.
//			System.out.println();
//				
//		}
//	}
//	 
//	
//		//public void run() {}
}