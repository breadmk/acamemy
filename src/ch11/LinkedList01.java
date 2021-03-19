package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList 교재 586
//결론 : 뭔가 추가할땐 ArrayList 가 아니라 LinkedList 쓰는게 맞다.
//ArrayList와 LinkedList 의 실행 성능 비교.
//ArrayList는 내부 배열에 객체를 저장해서 index로 관리
//	LinkedList에서 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경X
//				   특정 인덱스의 객체를 삽입하면 앞뒤 링크만 변경되고 나머지 링크는 변경X
//  		==> 따라서 빈번한 객체 삭제와 삽입이 일어나는 곳에서는
//				ArrayList보다 LinkedList가 좋은 성능을 발휘.

public class LinkedList01 {
	
	public static void main(String[] args) {
//		실행시간 = 종료시간-시작시간
		long startTime;
		long endTime;

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
//		Returns the current value of the running 
//		Java Virtual Machine's high-resolution time source, in nanoseconds. 
		startTime = System.nanoTime(); // 시작시간 담기
		
		//작업~~~~
//				add(int index,Object value)
//				String클래스의 valueOf(object value) : object 값을 String으로 변환하는 함수
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));	//String.valueOf(1) => "1"
//			list1.add(0,"0") list1.add(0,"1") list1.add(0,"2")
		}
		
		endTime = System.nanoTime(); // 종료시간 담기
		System.out.println("ArrayList 실행시간 = " + (endTime-startTime));
		System.out.println("------------------------");
		
		startTime = System.nanoTime(); // 시작시간
		
		//작업~~~~
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
//		list1.add(0,"0") list1.add(0,"1") list1.add(0,"2")
		endTime = System.nanoTime(); // 종료시간 담기
		System.out.println("LinkedList 실행시간 = " + (endTime-startTime));
	}
}
