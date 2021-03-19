package ch11;

//Child01을 상속받는 클래스
public class GrandChild01 extends Child01 {
	//m1()
	//m2()
	//m3()
	
	@Override
	public void m2() {
		System.out.println("Child01을 물려받은 GrandChild01이 오버라이딩한 m2()이다.");
	}
	
}
