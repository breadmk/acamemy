package ch14;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//OutputStreamWriterEx01 : 바이트 출력스트림을  -> 문자 출력스트림으로 변환
public class OutputStreamWriterEx01 {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:\\temp\\file.txt");
		
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write("바이트 출력스트림을  -> 문자 출력스트림으로 변환\n ");
		writer.write("가나다라 ");
		
		writer.flush();
		writer.close();
		fos.close();
		
		System.out.println("done");
		
	}

}
