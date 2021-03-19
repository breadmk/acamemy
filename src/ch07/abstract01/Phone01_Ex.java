package ch07.abstract01;

//실행클래스
//추상클래스의 객체를 생성하지 못 하므로
//추상클래스의 기능을 사용하고 싶다면
//그것을 상속받은 실체클래스의 객체를 생성해서 사용해야 한다.
public class Phone01_Ex {

	public static void main(String[] args) {
//		Phone01 ph = new Phone01("내꺼"); //컴파일 에러.
//		Cannot instantiate the type Phone01
//		Phone01의 생성자를 호출해서 객체를 생성할 수 없다.
		
		SmartPhone01 sp = new SmartPhone01("내꺼 ");
		sp.turnOn();	//(추상)Phone01의 메서드 호출
		sp.turnOff();	//(추상)Phone01의 메서드 호출
		sp.internet();	//SmartPhone01의 메서드 호출
		
		System.out.println(sp.owner);
	}

}
