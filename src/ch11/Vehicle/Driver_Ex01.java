package ch11.Vehicle;

// Vehicle를 이용하는 클래스
public class Driver_Ex01 {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Vehicle()); //탈것이 움직여요.
		
		Bus bus = new Bus();
		driver.drive(bus);	//bus가 움직여요
//		drive() 메소드가 호출되면서 들어간 매개변수의 타입이
//		자동타입변환되었다. Vehicle vehicle = new Bus();
//		자손클래스인 Bus에서 부모클래스 Vehicle의 run()를 오버라이딩하였으므로
//		Bus의 오버라이딩된 run()가 실행되었다.
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
//		driver.drive(new Taxi()); 동일하나 지속적으로 객체 생성을 해야되서 메모리 차지 하는 경우가 있음
		
	}
}

