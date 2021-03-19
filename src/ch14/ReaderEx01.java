package ch14;

import java.io.FileReader;
import java.io.Reader;

//Reader의 read()연습

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		
		Reader rd = new FileReader("C:\\temp\\test.txt");
		int readData;
		while(true) {
			readData = rd.read();
		if(readData==-1) {
			break;
		}
		System.out.println((char)readData);
		}
		rd.close(); //자원해제
	}

}

















