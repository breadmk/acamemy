package ch11.Vehicle;

// 이 클래스의 superClass는 Vehicle 이다.
public class Bus extends Vehicle{
	@Override
	public void run(){
		System.out.println("Bus가 움직여요");
	}
}
