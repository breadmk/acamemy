package ch07.RemoteControl;

//이 클래스는 RemoteControl인터페이스의 구현클래스들의 객체를 생성하여 실행하는 클래스이다.
/*
 * 인터페이스 구현객체 사용법
 * 인터페이스 변수;
 * 변수 = 구현객체; 
 * 또는
 * 인터페이스 변수 = 구현객체; 
 */
public class RemoteControl_Ex01 {

	public static void main(String[] args) {
		RemoteControl rc = null;	//인터페이스 변수;
		rc = new Tv();				//변수 = 구현객체; =>Tv객체를 인터페이스타입에 대입. 
		
//		인터페이스의 turnOn()과 turnOff() 호출 =>실제 구현은 Tv의 실체메서드 동작실행
		rc.turnOn();	//Tv의 전원을 켭니다.
		rc.turnOff();	//Tv의 전원을 끕니다.
		rc.setMute(false);
		
		
		rc = new Audio();
//		인터페이스의 turnOn()과 turnOff() 호출 =>실제 구현은 Audio의 실체메서드 동작실행	
		rc.turnOn();	//Audio 전원을 켭니다.
		rc.setVolume(-10);	//현재 Audio volume=0;	
		rc.setVolume(5);	//현재 Audio volume=5;
		rc.setVolume(100);	//현재 Audio volume=10;
		rc.turnOff();	//Audio 전원을 끕니다.
		System.out.println();
		
//		인터페이스에서 정의된 정적메소드 사용.
//		인터페이스명.메서드명
		RemoteControl.changeBattery();
		
//		디폴트 메서드 사용
//		인터페이스타입변수.메서드명
//		디폴트 메서드가 실체클래스에서 오버라이딩 되었다면
//		실체객체의 오버라이딩된 메서드가 호출된다
		rc.setMute(true);
	}

}















