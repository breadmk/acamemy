package ch06_Object_op;

// 자동차클래스로 부터 객체를 생성하여 실행하는 클래스
public class Car02_ex01 {
	public static void main(String[] args) {
//		자동차클래스로 부터 객체를 생성
//		클래스명 변수명 = new 클래스명(); heap 타입.
		
		Car02 car1 = new Car02();
//		field값 가져오기 = > 참조변수명.필드명;
//		company 변수는 인스턴스 변수이므로 인스턴스 생성후 '참조변수명.인스턴스변수명' 으로 접근.
		System.out.println("car1.company= " +car1.company);
		System.out.println("car1.model= " +car1.model);
		System.out.println("car1.color= " +car1.color);
		System.out.println("car1.maxSpeed= " +car1.maxSpeed);
		
//		field 값 변경하기 =>참조변수명.필드명 = 값;
		car1.color = 'R';
		System.out.println("변경후 car1.color= "+ car1.color);
		
//		Math.PI()는 Math 클래스안의 클래스변수(==static변수) 이다.
//		static 으로 선언된 필드와 메소드는 객체를 생성하지 않고도 '클래스명.클래스변수명' 으로 사용이 가능하다.
//		참고 Math 클래스의 모든 field와 method는 static
		System.out.println(Math.PI);
//		Math.random()은 Math클래스의 static 메소드이다.
		System.out.println(Math.random());
//		(실행클래스에서 선언된) 메소드 호출 => 메소드명();
//		인스턴스 메소드호출 => 참조변수명.메소드명();
		car1.abc();
		car1.qwe();
//		static 변수 호출 : 클래스명.변수명
		System.out.println("Car02.wheel = "+Car02.wheel);
		Car02 car2 = new Car02();
		Car02 car3 = new Car02();
		System.out.println("car1.wheel = "+car1.wheel);
		System.out.println("car2.wheel = "+car2.wheel);
		
		
		System.out.println("car3.wheel = "+car3.wheel);
	}	
}


