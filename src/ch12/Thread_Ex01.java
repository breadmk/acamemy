package ch12;

// 방법1. Thread 클래스를 상속받아서 생성하기
public class Thread_Ex01 {

	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//		이름을 제시하지 않으면 이름 자동생성
		MyThread myThread = new MyThread("나의 스레드");
		myThread.start();	//myThread 를 시작시키는 부분
//		start()메서드를 호출하면 새로운 callback을 할당받고
//		Runnable 상태가 되었다가 쓰레드 스케쥴러에 의해서 선택이 되면
//		해당 쓰레드의 run()가 실행된다.
		
		
		
		
	}
}
//Thread 클래스를 상속받아서 생성하기
class MyThread  extends Thread {
	public MyThread(){ 
		
	}
	public MyThread(String name){
		super(name);
	}

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
//			public static Thread currentThread() : 현재 실행중인 스레드 이름 가져오기
			System.out.print(currentThread().getName());
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("작동중"); //현재 실행중인 쓰레드의 이름 가져오기.
			System.out.println();
				
		}
	}
	 
	
		//public void run() {}
}