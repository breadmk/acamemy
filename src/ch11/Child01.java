package ch11;

//Parent01 클래스를 상속받는 자식클래스.
public class Child01 extends Parent01 {
//	m1() 상속받은 상태 
//	m2() 상속받은 상태
	
	@Override
	public void m2() {
		System.out.println("자식클래스child01에서 오버라이딩한 m2()");
	}
	public void m3() {
		System.out.println("자식클래스의 child01의 m3()");
	}	
}