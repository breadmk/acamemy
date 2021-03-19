package ch14;

import java.io.IOException;
import java.io.InputStream;

public class SystemEX01 {

	public static void main(String[] args) throws IOException {
		
		//System클래스의 in필드는 static InputStream 로 선언되어있다.
		//public static final InputStream in
			InputStream is = System.in;
			byte[] datas = new byte[100];
			
			System.out.print("이름: ");
			int nameBytes = is.read(datas);
			String name =new String(datas,0,nameBytes-2);	
			//-2를 한 이유는 캐리지리턴(13),라인피드(10)을 문자열에서 제외.
			
			
			System.out.println("입력한 이름 : "+name);
			
	}

}
