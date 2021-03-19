package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

//-내부적으로 Hashtable을 사용하며, key와 value를 (String,String)로 저장
//	- 주로 어플리케이션의 환경설정에 관련된 속성을 저장하는데 사용되며
//	    파일로부터 편리하게 값을 읽고 쓸 수 있는 메서드를제공한다.

// 외부의 Properties 파일을 읽어오기
// Propertise 파일을 읽어오기 위해서는 Properties 객체를 생성하고
// load() 메소드를 호출
public class Properties01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties Properties= new Properties();
		
//		1)외부의 Properties 파일을 읽어오기
//		Propertise 파일은 일반적으로 클래스파일과 함께 저장된다.
//		클래스파일을 기준으로 상대경로를 이용해서 propertise 파일의 경로를 얻는다. :Class.getResource()
//		클래스명.Class.getResource("database.properties");
//		Properties01.class.getResource("database.propertie");
		
//		getResource()는 주어진 파일의 상대경로는 URL 객체로 리턴.
//		URL 객체로 리턴.getPath() : 파일의 절대경로를 리턴받기
		String path = Properties01.class.getResource("database.properties").getPath();
		
//		주어진 파일의 경로에 한글이 있는 경우 경로
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("path = " +path);
//		System.out.println("path="+path);
//		외부 Propertise 파일경로 = c:\a\b\database.properties
//		Properties.load(new FileReader(외부 Properties 파일 경로));
//		Properties.load(new FileReader(path));
		Properties.load(new FileReader(path));
		String driver = Properties.getProperty("driver");
		String url = Properties.getProperty("url");
		String user = Properties.getProperty("user");
		String password = Properties.getProperty("password");
		
		System.out.println("driver = "+driver);
		System.out.println("url = "+url);
		System.out.println("user = "+user);
		System.out.println("password = "+password);
		
	}
}







