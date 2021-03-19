package ch12;

//이 클래스는 손님이 나가는 기능을 정의
public class OutGuestThread extends Thread {
	InOutEx io;
	public OutGuestThread(InOutEx io) {
		this.io=io;
		
	}
	@Override
	public void run() {
		for(int i=1; i<15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				io.outGuest();
		}
	}//


}





