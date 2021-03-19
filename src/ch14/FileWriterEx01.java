package ch14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\temp\\file.txt");
		
//		FileWriter fw = new FileWriter("C:\\temp\\file.txt");
//		FileWriter fw = new FileWriter(file,true);
//		파일이 이미 존재하는 경우, 그 파일을 덮여쓰게 한다.
		FileWriter fw = new FileWriter(file,true);
//		true를 주면 파일 끝에 추가한다.
		fw.write("처음으로 파일에 작성 연습 t e s t \r \n");
		fw.write("파일 작성 테스트123 "+ "\r\n");
		fw.flush();
		fw.close();
		
		System.out.println("saved");
	}

}
