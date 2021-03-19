package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx02 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:\\temp\\result0000.txt");
//												없는 파일명 넣으면 파일만들어서 넣어줌
		
		byte[] data = "WASqweqwDw123123w-123".getBytes();
		os.write(data,1,2); //AS
		
		
		os.flush();//버퍼지우기
  		os.close();//자원해제
		
		
		
		
		
	}

}













