package ch11.Vehicle;

//이 클래스의 superClass는 Vehicle 이다.
public class Taxi extends Vehicle{

	@Override
	public void run() {
		System.out.println("Taxi가 달립니다.");
	}

}
