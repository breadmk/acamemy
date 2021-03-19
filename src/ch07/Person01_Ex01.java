package ch07;

//Person01 클래스로 부터 객체를 생성하여 실행하는 클래스
public class Person01_Ex01 {

	public static void main(String[] args) {
//		객체생성
		Person01 p = new Person01("123-456","홍길동");
//		Person01 p = new Person01();
//		person01 클래스에는 String 타입 2개를 파라미터로 가진 생성자가 존재하므로
//		기본생성자를 사용할 수 없다.
		
//		필드3개의 값 출력
		System.out.println("국적은 "+p.nation);
		System.out.println("주민번호는 "+p.ssn);
		System.out.println("이름은 "+p.name);
		
//		필드3개의 값 변경
//		여기에서 nation은 변수를 선언하면서 초기값이 저장되었고,
//		여기에서 ssn는 객체를 생성하면서 생성자의 argument 값으로 초기값이 저장 되었으므로
//		프로그램을 실행하는 도중에는 변경할 수 없다.
//		p.nation = "미국";
//		p.ssn = "111-111";//The final field Person01.ssn cannot be assigned
		p.name = "홍길똥";
		System.out.println("개명한 이름은 "+p.name);
		
	}

}
