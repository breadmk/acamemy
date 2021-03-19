package ch14;

import java.io.FileReader;
import java.io.Reader;

/* 	is.read(char[] cbuf) : 매개값으로 제시한 char배열의 길이만큼 char를 읽고
 *							배열에 저장한다. 읽은 char 수를 리턴한다.
 * 							char를 더 읽을 수 없다면 -1을 리턴한다.
 */
public class ReaderEx02 {

	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader("C:\\temp\\test.txt");
		char[] cbuf = new char[3]; 
//		읽어들인 바이트수를 저장할 변수가 필요.
		int readCharNum;
		String str = "";	//콘솔에 출력할 때 사용할 변수 
		while(true) {
			
			readCharNum =rd.read(cbuf); //매개값으로 제시한 char 배열의 길이(3) 만큼 바이트를 읽고 
				if(readCharNum==-1) break;
	//String(char[] cbuf, int offset char배열에서 읽어들일 시작인덱스 값,int length 읽을 글자수)
				 str += new String(cbuf,0,readCharNum); //문자열로 만들어서 누적
				 System.out.println(str);
			}
			System.out.println(str);
			rd.close();	//자원을 반납
		}
	
}

