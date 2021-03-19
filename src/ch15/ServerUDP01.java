package ch15;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//UDP 통신
// TCP 소켓 프
// UDP소켓 프로그래밍에서는 DatagramSocket과 DatagramPacket을 사용.
// 데이터를 주로 받는 쪽 => Server 역할을 담당하는 클래스
//					여기에서는 서버 실행 후 10초가 지나면 수신을 종료
public class ServerUDP01 extends Thread {

	public static void main(String[] args) throws Exception {
			DatagramSocket datagramSocket = new DatagramSocket(7777);
			
			Thread thread = new Thread() {

			@Override
			public void run() {
				System.out.println("[서버 ON : 수신 시작...");
				
//				new DatagramPacket(읽은 패킷 데이터를 저장할 바이트 배열,읽을 수 있는 최대 바이트 수[agrs]);
//				두번째 agrs 는 첫 번째 배열의 크기와 같거나 또는 작아야한다.
//				일반적으로 첫 번째 바이트배열의 크기를 준다.
				try {
					while(true) {//수신자는 항상 데이터를 받을 준비가 되어있어야 하므로 반복문을 사용한다.
						DatagramPacket packet = new DatagramPacket(new byte[100],100);
						
						datagramSocket.receive(packet);
						
	//					읽어들인 bytes들을 문자열로 변환.
	//					byte[] packet.getData()
						String data = new String(packet.getData(),0,packet.getLength(),"UTF-8");
						
	//					콘솔에 출력
						System.out.println("[클라이언트로 부터 받은 내용 : " + data + "]");
					
					} //while
				} catch (Exception e) {
					e.printStackTrace();
				}//catch
					
				}//run
				
			};	//익명 class
			
			thread.start(); //쓰레드 시작.
			Thread.sleep(10000); //10초가 지나면
			datagramSocket.close();
			System.out.println("서버:OFF : 수신 종료.");
	}

}
