package ch11;

// 강제형변환하기 전에 instanceof 연산자로 변환시킬 타입의 객체인지 확인해야한다.
public class Instanceof_Ex01 {

	public static void main(String[] args) {
			
		Parent03 parentA = new Parent03();
		
//		m1(parentA);
		m2(parentA);
	}
	
	static void m1(Parent03 parent){
		Child03 child = (Child03)parent;
		System.out.println("m1() : Child03으로 강제 형 변환 성공");
	}
	static void m2(Parent03 parent){
		if(parent instanceof Child03) {	//강제형변환하기 전에 instanceof 연산자로 변환시킬 타입의 객체인지 확인해야한다.
		Child03 child = (Child03)parent;
		System.out.println("m2() : Child03으로 강제 형 변환 성공");
	}else {
		System.out.println("m2() : Child03으로 강제 형 변환 실패");
	}
	}
}

class Parent03{
	
}

class Child03 extends Parent03{
	
}