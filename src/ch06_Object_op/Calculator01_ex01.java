package ch06_Object_op;

// 계산기 기능을 실행하는 클래스
//	
public class Calculator01_ex01 {

	public static void main(String[] args) {
//		Calculator01 클래스의 객체 생성 및 변수에 할당.
		Calculator01 c1 = new Calculator01();
		c1.a();
		
//		계산기 전원을 켜세요.
		c1.powerOn();
		
//		Calculator01 클래스의 divide() 호출하여
//		메소드의 리턴값을 받아 div에 저장
		double div = c1.divide(10, 3);	//3.0
		System.out.println("div= " + div);	//출력
		
//		임의 숫자를 더하기 기능을 수행하세요.
		byte x = 10;
		byte y = 90;
		int result = 0;
		result = c1.plus(x, y);
		System.out.println("result = " + result);
		
		System.out.println("이거도 됨 "+ c1.plus(x, y));
		
//		임의 실수 더하기 기능을 수행하세요.
		double result1 = c1.plus2(10.9, Math.PI);
		System.out.println("result1 = "+ result1);
		
//		전원을 끄세요.
		c1.powerOff();
	}

}
