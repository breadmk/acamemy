package ch07;

//Calculator01을 상속받는 클래스
// is a 관계 =>상속
// Computer is a Calculator
public class Computer01 extends Calculator01{
	// 이미 부모클래스의 필드와 메소드를 상속받은 상태이다.
	
	//상속 받은 메소드를 재정의
//	@ : Annotation
//	공지의미 +조건충족하는지 검사하는 기능
	@Override
	double areaCricle(double r) {
		System.out.println("Computer01-areaCricle(double r) 실행");
		return Math.PI * r * r;
	}
	
}
