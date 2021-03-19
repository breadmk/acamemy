package ch09_util;

import java.util.StringTokenizer;

//StringTokenizer 클래스 - 교재 514
/*
 * 문자열이 특정 구분자로 연결되어 있을 경우,
 * 구분자를 기준으로 문자열을 분리할 때 사용된다.
 * 비교) java.lang.String클래스의 split()도 동일기능이지만 리턴유형은 String[]
 * 
 */
public class StringTokenizer01 {

	public static void main(String[] args) {
//		java.lang.String클래스의 split()도 동일기능이지만 리턴유형은 String[]
		String str = "김좌진,이순신 서희-김구~세종대왕&장영실";
//		str.split(String타입의 정규식)
		String[] names = str.split(",| |-|~|&");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("------------------------");
		String test0 = "김좌진,이순신 서희";
//		구분자를 제시하지 않으면 공백을 구분자로 사용
		StringTokenizer st = new StringTokenizer(test0);
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("------------------------");
		String test = "김좌진/이순신,서희";
		
//		방법1: for문이용 || 전체토큰수를 얻어 for문으로 반복작업
		st = new StringTokenizer(test,"/");
		int count = st.countTokens();	//전체토큰수
		System.out.println("st.countTokens()="+count);//3
		for(int i=0; i<count; i++) {
			String token1 = st.nextToken();
			System.out.println(token1);
		}
		
		System.out.println();
		/* 출력결과
		 * 김좌진
		      이순신,서희
		 */
		
//		방법2:	while문 이용 || hasMoreTokens()와 nextToken()을 while문에 적용.
		st = new StringTokenizer(test,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
		System.out.println();
		/* 출력결과
		 * 김좌진
		      이순신
	              서희
		 */
		
//		방법3: hasMoreElements()와 nextElement()을 while문에 적용.
//		여러개의 구분자를 사용할 수 있다. (test,"/,")
		st = new StringTokenizer(test,"/,");
		st.hasMoreElements();
		while(st.hasMoreElements()) {
			//nextElement()의 리턴유형이 Object이므로 String으로 강제클래스 형변환
			String token = (String) st.nextElement();
			System.out.println(token);
		}
	}

}
