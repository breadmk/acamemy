package ch11.Vehicle;

public class Driver {
	
//			Vehicle v = new Vehicle();
//			Bus b = new Bus();
//			Taxi t = new Taxi();
//			객체를 만들지 않고 매개변수에 넣어서 처리가 가능
//	매개변수의 다형성 => 컬렉션 Collection 인터페이스의 add(Object obj)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
