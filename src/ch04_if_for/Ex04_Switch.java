package ch04_if_for;
// switch문
// switch문의 매개변수타입은 숫자(byte,short,int,long),char타입,string타입 사용가능
// String 타입은 자바7부터 사용가능.
public class Ex04_Switch {

	
	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) {
		case 'A':
		case 'B':	
			System.out.println("우수 회원 입니다.");
			break; //switch문을 벗어나라
		case 'C':	
		case 'D':	
			System.out.println("일반 회원 입니다.");
			break;
			default: System.out.println("손님");
		}
	}

}
