package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//문자변환 보조스트림
public class InputStreamReaderEx01 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader read = new InputStreamReader(is); //문자변환 보조스트림
		
		char[] cubf = new char[100];
		int readCharNum;
		 while((readCharNum = read.read(cubf)) !=-1) {	//전부읽는동안  
			 String data = new String(cubf,0,readCharNum);	//문자열로 변환
			 System.out.println(data);//콘솔에 출력
		 }
		 
		 read.close();
	}

}
