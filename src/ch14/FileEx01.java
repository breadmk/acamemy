package ch14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//File p907
//File 클래스를 이용한 파일 및 디렉토리 정보 출력
public class FileEx01 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/temp/Dir");
		File file1 = new File("C:/temp/file1.txt");
		File file2 = new File("C:\\temp\\file2.txt");
		
		if(dir.exists()==false) {
			  dir.mkdirs();
			 }
		if(file1.exists()==false) {
			file1.createNewFile();
		}
		if(file2.exists()==false) {
			file2.createNewFile();
		}
		
		File temp = new File("C:/temp");
		File[] contents = temp.listFiles();
		
//		날짜 시간 형식화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd	a HH:mm");
		
		System.out.println("날짜		시간		형태		크기		이름");
		System.out.println("---------------------------------------------------");
		for(File file : contents) {
//			file.lastModified : File 객체의 마지막 수정일을 long으로 리턴받음.
//			new Date(long)    : Date타입데이터를 Date(날짜)객체로 생성.
//			sdf.format(Date)  : Date 타입 데이터를 내가 지정한 형식(format)으로 적용
			System.out.print(sdf.format(new Date(file.lastModified())));	//마지막 수정일.
//			문서의 마지막 수일이 long으로 길게 나와 보기가 어려움으로 
//			내가 보기편한 형식(yyyy-MM-dd a HH:mm)으로 적용하고 싶은데 sdf.format(long)은
//			없기에 sdf.format(Date)는 있으니 long을 new Date(long)을 이용해서 Date 객체로
//			변환한 것 임. 이렇게 변환한 Date객체를 sdf.format()의 파라미터로 제시하였음.
			
				if(file.isDirectory()) {
					System.out.print("\t<DIR>\t\t"+file.getName());
				}else {
					System.out.print("\t\t\t"+file.length()+"\t\t"+file.getName());
				}
				
			System.out.println();
		}
		
	}

}
