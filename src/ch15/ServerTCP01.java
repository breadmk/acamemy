package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//TCP통신
//서버쪽 역할을 하는 클래스	
/* 1) 서버는 소버소켓을 사용해서 서버의 특정포토에서 클라이언트의 연결요청을 처리할 준비를 한다.
 * 2) 클라이언트는 접속할 서버의 IP주소와 포트정보를 소켓을 생성해서 서버에 연결을 요청한다.
 * 3) 서버소켓은 클라이언트의 연결요청을 받으면 서버에 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다.
 * 4) 이제 클라이언트의 소케과 새로 생성된 서버의 소켓은 서버소켓과 관계없이 1:1 통신을 한다.
 * 
 */
public class ServerTCP01 {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			// 1) 서버는 소버소켓을 사용해서 서버의 특정포토
			server = new ServerSocket(); //ServerSocket 생성
			//포트바인딩을 위해 bind() 메소드를 호출
			server.bind(new InetSocketAddress("localhost",5002)); //127.0.0.1같음.
			
			while(true) {
				
			System.out.println("[Client의 연결을 기다리는중...]");
			// 1)클라이언트의 연결요청을 처리할 준비를 한다.
			Socket socket = server.accept(); 	//Client 의 연결을 수락
			System.out.println("[클라이언트의 연결을 수락하였음.]");
			
			byte[] bytes = new byte[1000];
			InputStream is=null;
			is = socket.getInputStream();	//scoket을 이용해 InputStream 생성
			int readBytesCount = is.read(bytes);// 생성된 InputStream 통해 bytes[] 읽기
			String receivedMsg = new String(bytes,0,readBytesCount);	//문자열로 변환
			
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();	//연결된 시스템에 대한 주소를 받기.
			System.out.println(isa.getHostName()+"클라이언트로 부터 받은 메세지 :" +receivedMsg);
			
			
			String message = null;
			OutputStream os = socket.getOutputStream();	//클라이언트에게 보내기위한 OutputStream 객체 생성
			
			message = "Client > 메세지 수신 양호 ";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[서버에  message를 보냈어요]");
			
			
			
			is.close();
			os.close();
			socket.close();
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!server.isClosed()) {	//연결이 되고 있을 경우라면
		try {
			server.close();	//연결끊기
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}//main

}
