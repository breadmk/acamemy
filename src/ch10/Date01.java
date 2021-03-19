package ch10;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//java.util.Date클래스 -p528
//java.text.
public class Date01 {
	public static void main(String[] args) {
			
		Date now = new Date();
		System.out.println("new Date()="+now);
		System.out.println("new Date()="+now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 a");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		strNow = sdf.format(now);
		System.out.println(strNow);
		
		
		sdf = new SimpleDateFormat("오늘은  올해의 D번째날");
		strNow = sdf.format(now);
		System.out.println(strNow);
		
		sdf = new SimpleDateFormat("오늘은  이달의 d번째날");
		strNow = sdf.format(now);
		System.out.println(strNow);
		
		
		
	}
}




