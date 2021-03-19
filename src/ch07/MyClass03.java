package ch07;
import other.MyClass01;
//other.MyClass01에서 선언된 필드에서 접근허용여부 확인하기.
public class MyClass03 {

	void qsxc() {
		MyClass01 m = new MyClass01();
		m.pub = 100;
//		m.pro = 200;	import other.MyClass01;	
//		m.pack = 300;	import other.MyClass01;
//		m.pri = 400;	import other.MyClass01;
		
//		 메소드 접근 허용 여부 체크해보자
		m.pubMethod();
//		m.proMethod();
//		m.packMethod();
//		m.priMethod();
		
		
	}
}
