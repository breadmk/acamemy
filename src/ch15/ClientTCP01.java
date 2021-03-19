package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;

//TCP 통신
//Client 역할 클래스
/* 1) 서버는 소버소켓을 사용해서 서버의 특정포토에서 클라이언트의 연결요청을 처리할 준비를 한다.
 * 2) 클라이언트는 접속할 서버의 IP주소와 포트정보를 소켓을 생성해서 서버에 연결을 요청한다.
 * 3) 서버소켓은 클라이언트의 연결요청을 받으면 서버에 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다.
 * 4) 이제 클라이언트의 소케과 새로 생성된 서버의 소켓은 서버소켓과 관계없이 1:1 통신을 한다.
 * 
 */
public class ClientTCP01 {

	public static void main(String[] args) {
		
//	2) 클라이언트는 접속할 서버의 IP주소와 포트정보를 소켓을 생성해서 서버에 연결을 요청한다.
		Socket socket = null;
		socket = new Socket();	// 소켓을 생성.
		
//		socket.connect(new InetSocketAddress(ip주소,포트정보));
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("192.168.0.51",5002));//192.168.0.51 선생님꺼 내껀 localhost
			System.out.println("[서버와 연결성공]");
			
			String message = null;
			byte[] bytes = null;
			OutputStream os = socket.getOutputStream();	//서버로 보내기 위한 OutputStream 객체 생성
			
			message = "다들 QR 코드 잊지마세요!";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[서버에  message를 보냈어요]");
			
			String msg = null;
			bytes = new byte[1000];
			InputStream is=null;
			is = socket.getInputStream();	//scoket을 이용해 InputStream 생성
			int readBytesCount = is.read(bytes);// 생성된 InputStream 통해 bytes[] 읽기
			msg = new String(bytes,0,readBytesCount);	//문자열로 변환
			
			System.out.println("클라이언트로 부터 받은 메세지 :" +msg);
			
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!socket.isClosed()) {	//연결이 되고 있을 경우라면
		try {
			socket.close();	//연결끊기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		
		
	}

}





