package ch14;

import java.io.FileInputStream;
import java.io.InputStream;

/* 	is.read(byte[] b) : 입력스트림으로부터 매개값으로 제시한 byte배열의 길이만큼 바이트를 읽고
 *	배열에 저장한다. 읽은 바이트 수를 리턴한다.
 * 	바이트를 더 읽을 수 없다면 -1을 리턴한다.
 */
public class ReadEx02 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\temp\\test.txt");
		byte[] readBytes = new byte[2]; 
//		읽어들인 바이트수를 저장할 변수가 필요.
		int readByteNum;
		String str = "";	//콘솔에 출력할 때 사용할 변수 
		while(true) {
			
			readByteNum =is.read(readBytes); //매개값으로 제시한 byte 배열의 길이(3) 만큼 바이트를 읽고 
				if(readByteNum==-1) break;
	//String(byte[] bytes, int offset 바이트배열에서 읽어들일 시작인덱스 값,int length 읽을 글자수)
				 str += new String(readBytes,0,readByteNum); //문자열로 만들어서 누적
				 System.out.println(str);
			}
			System.out.println(str);
			is.close();	//자원을 반납
		}
	
}
