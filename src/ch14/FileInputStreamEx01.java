package ch14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//FileInputStream 882
//텍스트 파일을 읽고 그 내용을 콘솔에 출력
public class FileInputStreamEx01 {

	public static void main(String[] args)  {

		try {
			FileInputStream fis = new FileInputStream("D:\\WK\\java\\pro\\src\\my\\aaa.java");
				
			Reader read = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(read);
			StringBuilder build = new StringBuilder();
			
			
		int data;
//		while( (data = fis.read())!=-1 ) {
			while( (data = in.read())!=-1 ) {
			build.append((char)data);
			
//			System.out.print((char)data);
			
		}
			System.out.println(build.toString());
			fis.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
