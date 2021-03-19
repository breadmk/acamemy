package ch07;

//final 클래스
public class Ex02 extends Object{
	public static void main(String[] args) {
		Father02 father = new Father02();
		father.abc();	//Father02의 abc() 함수야
		
		Son02 son = new Son02();
		son.qqq();		//Son02의 qqq() 함수야
		
		//상속받은 Father02 클래스의 메소드 abc()를 호출 할 수 있다.
		son.abc();  	//Father02의 abc() 함수야 	
		
//		Son022 son022 = new Son022();
//		son022.aaa();	//Fathe022의 aaa()함수야
		//The method aaa() is undefined for the type Son022
	}
}

final class Father022{
	void aaa() {
		System.out.println("Fathe022의 aaa()함수야");
	}
}	


//class Son022 extends Father022{ //The type Son022 cannot subclass the final class Father022
		



class Father02{
	int a = 10;
	void abc() {
		System.out.println("Father02의 abc() 함수야");
	}
}

//[접근제어자] [속성] class 클래스명[extends (부모)클래스명]
// Son02 클래스는 부모클래스인 Father02의 필드와 메소드를 상속받았다.
class Son02 extends Father02{
	void qqq() {
		System.out.println("Son02의 qqq() 함수야");;
	}

}

















