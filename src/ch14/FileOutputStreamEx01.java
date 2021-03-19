package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream
public class FileOutputStreamEx01 {

	public static void main(String[] args)  {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("D:\\study\\webst\\img\\dnl6.jpg");
			fos = new FileOutputStream("C:\\temp\\dnl6.jpg");
			
			byte[] b = new byte[100];
			int readBytes;
			while( (readBytes = fis.read(b))!=-1) {
				
				fos.write(b, 0, readBytes);
			}
				
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.flush();
				fos.close();
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("finished");
		
		
	}

}
