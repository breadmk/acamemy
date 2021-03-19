package ch07.abstract01;

// SmartPhone01은 Phone01의 실체클래스이므로
// Phone01의 생성자를 호출해야 한다.
public class SmartPhone01 extends Phone01 {
		
	public SmartPhone01(String owner) {
		super(owner);
	}

	//method
	
	public void internet() {
		System.out.println("인터넷 사용");
	}
}
