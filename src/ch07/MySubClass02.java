package ch07;

import other.MyClass01;
//	MySubClass02는 MyClass01 클래스를 상속받고 있으므로
//	이 클래스에는 부모 클래스로 부터 상속받은 pub,pro,pack,pri 가 이미 존재.
//	따라서 객체를 생성할 필요 없이 사용 가능하다.
public class MySubClass02 extends MyClass01{
	void qqq() {
		//MyClass01 m = new MyClass01();
		
		pub = 100;
		pro = 200;	// 서로 다른 패키지이지만 상속관계의 자식클래스에서는 접근가능.
//		pack = 300; //상속관계에서는 불가능하지만, 동일 패키지안이기 때문에 가능.
//		pri = 400;
		//pri 필드는 동일 클래스에서만 접근 가능. 외부클래스에서는 접근불가.
		//컴파일 에러. 
		//The field MyClass01.pri is not visible
//		 메소드 접근 허용 여부 체크해보자
			pubMethod();
			proMethod();
//			packMethod();
//			priMethod();
//			컴파일에러
//			The method priMethod() from the type MyClass01 is not visible
	}
}