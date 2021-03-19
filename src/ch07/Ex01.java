package ch07;

//import java.util.Date;	//import 패키지명.클래스명
//import java.util.Random;	//util 패키지안의 Random 클래스만을 import 한다.
	import java.util.*;		//util 패키지안에 속한 모든 클래스를 import 한다.
							//util 패키지안의 하위 패키지의 클래스는 제외한다.
//import : crtl + shift + o	//java.util.ReentrantLock 패키지안의 클래스는 제외.
//	상위클래스 == 부모클래스 == 조상클래스 == super클래스
//	하위클래스 == 자식클래스 == 자손클래스 
//	상속문법 > 하위클래스명 extends 상위클래스
//public class Ex01 extends Object { // 묵시적으로 Object 클래스를 상속받고 있다.
//package와 import
public class Ex01 extends Object{

	public static void main(String[] args) {
//	  java.util.Date today = new java.util.Date();	
//	   클래스의 실제 이름(full name)은 패키지명이 포함된것이다.
		Date today = new Date();
		System.out.println("today = "+today);
		System.out.println("ransu = "+new Random().nextInt());
		
//		ReentrantLock reen = new ReentrantLock();
		
		Ex01 e1 = new Ex01();
		Ex01 e2 = new Ex01();
//		모든 클래스의 최고조상클래스는 Object 클래스 이다.
//		따라서 모든 클래스는 Object 클래스가 가진 Method 를 사용 할 수 있다.
//		equals.()메소드의 문법 > 참조변수.equals(Object obj)	// 주소지 비교.
//		Ex01 클래스를 각각 객체 생성(new)하여서 참조변수 e1과 e2에 주소를 할당 하였다.
//		객체는 new (생성)할때 마다 서로 다른 주소지가 생성됨으로 참조변수 e1과 e2에 생성된
//		주소는 다르므로 두 개의 참조변수의 주소가 같은지 (equal)비교 하니 false가 나왔다.
//		이때 주소지를 비교하는 equals()는 Object 클래스로부터 상속받은 메소드를 사용.
		System.out.println(e1.equals(e2));
		
	
	}

}

















