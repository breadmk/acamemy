package ch06_Object_op;

/* 정적메소드와 블럭
* 정적필드와 정적메소드는 클래스에 고정된 멤버이므로 클래스를 로딩해서
* 메모리 영역에 적재할 때 클래스별로 관리된다.
* 따라서 클래스의 로딩이 끝나면 바로 사용 할 수 있다.
* 
* 정적 메소드와 정적 블럭을 선언할 때 주의할 점은 객체가 없어도 실행된다는 특징 때문에
* 이들 내부에 인스턴스 필드나   인스턴스 메소드를 사용할 수 없다

*/
public class Car06 {
	//Field	[접근제어자][속성]데이터타입 변수명=초기값;
	int speed;	//전역변수, 인스턴스 변수
	static String company = "튼튼자동차";
	//constructor [접근제어자] 클래스명(매개변수리스트){}
	
	//method [접근제어자][속성]리턴유형 메소드명(매개변수리스트){}
	
	void run() { System.out.println("run()호출성공"); 
	}	//인스턴스 메소드

	public static void main(String[] args) {
//		인스턴스 멤버를 사용하기 위해서는 먼저 인스턴스를 생성해야한다.
		Car06 car = new Car06();	
		car.speed = 100;
		System.out.println(car.speed);
		car.run();
//		static 멤버는 클래스명.변수명, 클래스명.메소드명(); 
		System.out.println(company);
//		run(); 사용불가. non-static 메소드. 
//		static 메소드 안에서는  static 메소드만을 사용
		
	 }
}
 
class Car061{
	//인스턴스 필드 & 인스턴스 메소드.
	int field1;
	void method1() {}
	
	//정적 필드 & 메소드로 선언하세요.
	static int field2;
	static void method2() {}
	
	//정적블럭
	
//	 정적 메소드와 정적 블럭을 선언할 때 주의할 점은 객체가 없어도 실행된다는 특징 때문에
//	 이들 내부에 인스턴스 필드나   인스턴스 메소드를 사용할 수 없다
	static {
		int field3 = 10;
		int field4 = 11;
		int field5 = 12;
		String field6 = "편할라고 만드는 정적블럭";
		
		field2 = 100;
		method2();
		
//		field1 = 100;		//컴파일 에러.	위에서 얘네는 static 이 아니라 인스턴스임.
//		this.field1 = 100; 	//컴파일 에러. 위에서 얘네는 static 이 아니라 인스턴스임.
//		method1();			//컴파일 에러. 위에서 얘네는 static 이 아니라 인스턴스임.
		}
	
		//정적메소드 선언
	
		static void test() {
			field2 = 100;		//o
			method2();			//o
//			field1 = 100;		//x
//			this.field1 = 100; 	//x
//			method1();			//x
			
			//but 가능하게 코드를 작성하세요.
			Car061 car = new Car061();
			car.field1 = 100;		
			car.method1();			
		}
}







