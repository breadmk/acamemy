package ch14;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx03 {
	public static void main(String[] args) throws IOException {
		Reader rd = new FileReader("C:\\temp\\test.txt");
		char[] readChars = new char[4];
		int readCharNum;
		readCharNum = rd.read(readChars,1,2);
		for(int i=0; i<readChars.length; i++) {
			System.out.println(readChars[i]); 
		}
		rd.close();
	}

}
