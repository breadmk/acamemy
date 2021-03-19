package ch06_Object_op;

// 계산기 클래스
// 메소드 선언
public class Calculator01 {
	
//	Method
//	[접근제어자] [속성] 리턴유형 메소드명(매개변수리스트) {}
//	[access modifier]
	
	
	
	void a() {
		System.out.println("a()");
		b();	//함수내에서 또 다른 함수를호출할 수 있다. //this.b();
	}
	void b() {
		System.out.println("b()");
	}
//	전원 on
	void powerOn(){
		System.out.println("powerOn()호출성공-전원을 켭니다.");
	}
//	전원 off
	void powerOff() {
		System.out.println("powerOff()호출성공-전원을 끕니다.");
	}
//	더하기
//	더하기
	void plus(long x,long y){
//		return x+y;
		int result = 0;
		result = (int)(x+y);
		System.out.println(result);
	}
	int plus(int x, int y){
//		return 100;		//return 값;
//		return x + y;	//return 계산식;
		 	int result = 0;
			result = x+y;
			return result;
//			return은 구현 결과 값을 함수를 호출한 자리에 되돌려준다
//			return 자체가 해당 함수를 종료한다 라는 의미.
//			System.out.println("함수의 끝");	// 위 return에서 종료가 되서 여기서 에러남.
	}
	
//	실수 더하기
	double plus2(double a, double b) {
		return a+b;
//		double result = 0.0;
//		result = a+b;
//		return result;
	}
//	나누기 divide 정수2개를 받아서 첫번째 파라미터값을 2번째 파라미터값을 나눈 몫을 리턴하는 함수
	double divide(int x,int y) {	//divide(10,3) 
		//return x/y;
		double result = 0.0;
		result = x/y;
		return result;
	}
//	method overloading p.283 ppt 6-2 57번째 그냥 외워라.
//	원칙적으로 동일 클래스내 메소드명이 동일할 수 없다.
//	하지만 매개변수의 타입,객수, 순서가 다르면 선언가능하다.
	
	double divide(int x, double y) {
		double result = 0.0;
		result = x/y;
		return result;
	}
//	method overloading
//	앞에서 선언한 divide와는 다르게 매개변수의 순서가 다르다.
	double divide(double x, int y) {
		return 0.0;
	}
}






