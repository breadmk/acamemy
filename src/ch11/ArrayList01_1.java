package ch11;

import java.util.ArrayList;

public class ArrayList01_1 {
	public static void main(String[] agers) {
		ArrayList list = new ArrayList();
		
//		객체를 추가
		list.add("홍길동");
		list.add(3);
		list.add("김구");
		list.add(true);
		list.add("강호동");
		list.add("강호동"); //중복된 데이터 추가할 수 있다. => 중복허용
		
		
		//저장된 객체의 총 수 조회
		int length = list.size();
		System.out.println("저장된 객체의 총 수 = " + length);
	
//		객체 꺼내기(조회) get(int)
		Object obj = list.get(4);
		System.out.println("list.get(4)"+(String)obj);
		//문자열은 워낙 많이 사용되서 자동형변환이 됨. 원래는 (String) 붙여줘야함
		System.out.println("list.get(4)"+obj);	
//		클래스(강제)형변환 : (sub클래스명)
//		참조 변수의 형변환 - 교재.p.357 참고
		System.out.println();
//		모든 데이터 꺼내기 => 입력한 순서가 유지되어 출력된다.
		for(int i=0; i<list.size(); i++) {
			System.out.println("list.get["+i+"]= "+list.get(i));
		}
		System.out.println();
//		향상된 for문 이용 - 모든 데이터 꺼내기
//		for( 데이터타입 변수명 : 배열명 또는 컬렉션명)
		for(Object temp : list) {
			System.out.println("list.get["+temp+"] = "+ temp);
		}
	}
	
}







