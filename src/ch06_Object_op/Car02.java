package ch06_Object_op;

/* 	클래스 구성 멤버
1.Field : 객체의 데이터가 저장되는 곳.
		[접근제어자][속성] 데이터타입 변수명;
		
2.Constructor : 객체 생성시 초기화 역할 담당.

3.Method : 객체의 동작에 해당되는 실행볼록
*/

public class Car02 {


//	 Field
	String company = "조은자동차";	// 제조사	 //전역변수 : 클래스영역에서 사용할 수 있다.
//	인스턴스 변수 : 인스턴스 생성 후 '참조변수명.인스턴스명 으로 접근.
	char color;		// 색상
	String model;	// 모델
	int maxSpeed;	// 최고속도
	static int wheel=4;	//클래스 변수. static 변수
//	인스턴스 생성없이 '클래스명.메스도명'으로 접근
//	모든 인스턴스에서 공유되어지는 값이다.
//	 생성자 Constructor 

//	 Method
	void abc() {
		System.out.println("abc()안에서 접근한 company= "+ company);}
//		company는 전역변수로 선언했으므로 abc()안에서 접근할 수 있다.
	void qwe() {
		System.out.println("qwe()안에서 접근한 company= " +company);}
//		company는 전역변수로 선언했으므로 qwe()안에서 접근할 수 있다.
}
