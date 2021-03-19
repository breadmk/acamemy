package other;

// 동일패키지안의 부모클래스인 MyClass01 에서 선언된 필드에 접근 할 수 있는지 살펴본다.
// [접근제어자][속성]class 클래스명[extends 부모클래스명] {}
class MySubClass01 extends MyClass01 {
	void qqq() {
		MyClass01 m = new MyClass01();
		
		m.pub = 100;
		m.pro = 200;
		m.pack = 300; //상속관계에서는 불가능하지만, 동일 패키지안이기 때문에 가능.
//		m.pri = 400;
		//pri 필드는 동일 클래스에서만 접근 가능. 외부클래스에서는 접근불가.
		//컴파일 에러. 
		//The field MyClass01.pri is not visible
		
//		 메소드 접근 허용 여부 체크해보자
		pubMethod();
		proMethod();
		packMethod();
//		priMethod();
//	컴파일에러
//	The method priMethod() from the type MyClass01 is not visible
		
	}
}