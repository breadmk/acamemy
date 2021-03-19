package ch03_operator;

//문자열비교 ★★★★★
// == 객체의 주소를 비교한다. 
// 참조변수 =reference
//문자열.equals(비교문자열) 값비교  비밀번호 동일한지 비교 등등 사용 자주함.
//객체지향의 개념
public class Ex06_star {

	public static void main(String[] args) {
		
		Ex06_star obj1 = new Ex06_star(); 
		Ex06_star obj2 = new Ex06_star();
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
	
		if(str1==str2) { 
			System.out.println("str1과 str2는 일치한다."); //조건을 충족하면 실행
		}else {	
			System.out.println("str1과 str2는 일치하지 않는다.");//조건이 참이 아닌 경우 
		}
		System.out.println("--------------------------");
		
		if(str3==str4) { 
		System.out.println("str3과 str4의 주소가 일치한다."); //조건을 충족하면 실행
		}else {	//조건이 참이 아닌 경우 
		System.out.println("str3과 str4의 주소가 일치하지 않는다.");//조건이 참이 아닌 경우 
		}
		//문자열.equals(비교문자열) 값비교  비밀번호 동일한지 비교 등등 사용 자주함.
		if(str3.equals(str4)) { 		//문자열 비교 .equals
			System.out.println("str3과 str4는 일치한다.");
		}else {	
			System.out.println("str3과 str4는 일치하지 않는다.");
		}
	}
}

