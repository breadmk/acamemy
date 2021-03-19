package ch11;

import java.util.Iterator;
import java.util.TreeSet;
//TreeSet 이용

// 실행결과
/*
[name=홍일, age=1]
[name=김이십, age=20]
[name=강삼십, age=30]
[name=김사십, age=40]
[name=홍백, age=100]
*/
// PersonDTO에서 재정의된 CompareTo()메서드를 이용하여
// 나이 순으로 정렬하는 클래스 이다.
// 사용자 정의 객체를 나이순으로 정렬한다.
public class PersonDTO_Ex {

	public static void main(String[] args) {

			TreeSet<PersonDTO> ts = new TreeSet<PersonDTO>();
			
			//PersonDTO 객체 추가.
			//저장될 때 나이순으로 정렬됨.
			ts.add(new PersonDTO("홍백",100));
			ts.add(new PersonDTO("홍일",1));
			ts.add(new PersonDTO("김이십",20));
			ts.add(new PersonDTO("김사십",40));
			ts.add(new PersonDTO("강삼십",30));
			
			// 왼쪽 마지막노드에서 오른쪽 마지막 로드까지 반복해서 가져온다. => 오름차순
			// 참고. 이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값을 오른쪽에 저장.
			Iterator<PersonDTO> iter = ts.iterator();
			while(iter.hasNext()) {
				PersonDTO person = iter.next();
//				System.out.println(person); //위나 아래나 아무거나 써도됌
				System.out.println(person.toString());
			}
	}

}
