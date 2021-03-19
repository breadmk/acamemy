package ch09_util;

import java.util.regex.Pattern;

//정규식(Regular Expression)-정규표현식. 교재 505
//java.util.
public class Regex01 {

	public static void main(String[] args) {
		
		String emailDate= "hong@qqq.com";
		String regExp1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
//		\w  => word. [A-Za-z0-9_]   || hong@
//		\+  => 1번 이상				|| qqq
//		\w+ => 알파벳대소문자 또는 숫자가 1번이상 
//		\@  => @ 문자	 				||@
//		\.  => . 문자				||.
//		\? 	=> 0번 또는 1번			|| 
//		\(\\.\\w+)? => .뒤에 알파벳대소문자숫자 1개이상으로 된 문자가 나오거나 생략
//		|| 없어도 되는데 달아둠 co.kr 이런거도 가능
		boolean result1 = Pattern.matches(regExp1,emailDate);
		if(result1) {
			System.out.println("정규식과 일치한다.");
		}else {
			System.out.println("정규식과 불일치한다.");
		}
		
		System.out.println();
		
		
		String tel = "010-111-1234";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // | <-- 또는 
//		02|010 => 02 또는 010
//		- 	   => - 문자
//		\d 	   => digit을 의미. [0-9] 와 동일하다.
//		{3,4}  => 3자리~4자리
//		\d{3,4}=> 숫자가 최소 3글자~최대 4글자 가능.
//		{4}	   => 4자리
		boolean result = Pattern.matches(regExp,tel);
		if(result) {
			System.out.println("정규식과 일치한다.");
		}else {
			System.out.println("정규식과 불일치한다.");
		}
	}

}
