package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URL - URL 주소를 다루기 위해 제공되는 클래스
public class UrlEx {
// openStream() : Opens a connection to this URL and returns an InputStream
	public static void main(String[] args) {
		URL url = null;
		InputStream is  =null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String str = null;
		try {
			url = new URL("https://google.co.kr");
			is = url.openStream(); //해당 URL의 자원을 얻어오는 InputStream을 리턴받기 위한 객체.
			isr = new InputStreamReader(is,"UTF-8"); //기계어를 인간이 읽을 수 있는 언어로 변환
			br = new BufferedReader(isr);	//그걸 붙임.
			
			//콘솔에 출려
			while( (str = br.readLine())!=null ) { //한줄 단위로 읽어들임.
				
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {	//자원해제
				br.close();
				is.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		
	}

}
