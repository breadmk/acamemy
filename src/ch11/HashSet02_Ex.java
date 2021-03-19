package ch11;

import java.util.HashSet;
import java.util.Set;

import ch07.Person01;

// MemberDTO_02 객체를  중복없이 set에 저장하는 클래스.
public class HashSet02_Ex {

	public static void main(String[] args) {
//		MemberDTO_02 m1 = new MemberDTO_02("홍길동","801234-5678900");
//		MemberDTO_02 m2 = new MemberDTO_02("홍길동","801234-5678900");
//		Person01 p2 = new Person01("823456-7890012","김길동");
		
//		System.out.println("m1.equals(p2)의 결과= "+m1.equals(p2));
		
//		기준이 되는 m1이 매개변수 m2와 동일하니???!! 기준 = m1 비교대상 = m2
//		System.out.println("m1.equals(m2)의 결과= "+m1.equals(m2));
		
		
//		 다형성을 구현하면 -> 조상 클래명 참조변수명 = new 자손클래스명();
		Set<MemberDTO_02> set = new HashSet<MemberDTO_02>();
	
		set.add(new MemberDTO_02("김길동","823456-7890012"));
		set.add(new MemberDTO_02("홍길동","801234-5678900"));
		set.add(new MemberDTO_02("홍길동","801234-5678900"));
		set.add(new MemberDTO_02("홍길동","801234-5678900"));
		set.add(new MemberDTO_02("홍길동","801234-5678900"));
		//인스턴스는 다르지만 내부 데이터가 동일하므로 동일객체로 판단한다.
		//총 객체수는 2
		
		System.out.println("총 객체수는 = "+set.size());	//2
		
	}

}
