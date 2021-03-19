package ch15;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

//UDP통신
//client 역할을 하는 클래스
public class ClientUDP01 {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(); //클라이언트는 포트번호 명시X
		
		System.out.println("[(client)발신 ON : 송신 시작...");
		
		for(int i=1; i<6; i++) {
			String data = "Server("+i+")";
			byte[] bateArr = data.getBytes("UTF-8"); //매번 다른내용을 하겠다 하면 안에다가 선언 []
													// 매번 덮어쓰겠다 하면 for문 밖에다가 선언 []
//			DatagramPacket packet )생성
//					new DatagramPacket
//byte[] 보낼데이터 , byte[]에서 보내고자하는 항목 수 , 만약 전체 항목을 보내고 싶다면 byte[].length를 쓴다.
//					(bateArr,bateArr.length,
//					 ↑ 보낼 내용 ↓ 받을 주소 ,수신자 IP와 port정보를 가지고 있는 SocketAddress
//		SocketAddress는 추상클래스이므로 하위클래스인 InetSocketAddress 객체를  생성해서 대입한다.
//					new InetSocketAddress("localhost",7777));
					
			DatagramPacket packet = 
					new DatagramPacket
					(bateArr,bateArr.length,new InetSocketAddress("localhost",7777));
			
//			생성한 DatagramPacket 송신.
			datagramSocket.send(packet);
			
			System.out.println("[보낸 byte 수 : "+bateArr.length+"(byte)");
		}//for
		System.out.println("[송신종료-]");
		datagramSocket.close();		//datagramSocket 닫기.
	}
	

}
