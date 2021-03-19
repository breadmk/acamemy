package ch07;

/* final - 최종적. 
 * final 필드 - > 초기값이 저장되면 최종적인 값이 된다 => 프로그램 실행 도중에 변경 할 수 없다.
 * 문법)[접근제어자] final 데이터타입  변수명 = 초기값;
 */
// 사람
public class Person01 {
	
//	Filed [접근제어자][속성] 데이터타입 변수명 = 초기값;
	final String nation = "대한민국";	//국적. 여기에서는 객체마다 공통적인 값을 가지므로 초기값을 부여;
	String ssn;	//주민번호. 여기에서는 객체생성할 때마다 다른 다른 값을 가질 수 있으므로 초기값을 부여 하지 않음;
	String name;					//이름
	
//	Constructor [접근제어자] 클래스명(매개변수리스트){}
	
//	Person01(){}	//컴파일 에러. 생성자는 final 필드의 최종 초기화를 마쳐야 하는데 그렇지 않아서 에러발생.
	public Person01(String ssn,String name){
		this.ssn=ssn;
		this.name=name;
	}
	
//	Method	[접근제어자][속성] 리턴유형 메소드명(매개변수리스트){}

}
