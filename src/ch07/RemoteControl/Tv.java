package ch07.RemoteControl;

//이 클래스는 RemoteControl 인스페이스를 구현하는 구현 클래스이다.
/* 
 * 개발 코드가 인터페이스 메소드를 호출하면 ->인터페이스는 객체의 메소드를 호출.
 * 객체는 인터페이스에서 정의한 추상메소드와 동일한 메소드명,매개타입,리턴유형을 가진 실체 메서드를 가져야한다.
 * ==>이러한 객체를 인터페이스의 구현(implement)객체라 한다.
 * ==>구현 객체를 생성하는 클래스를 구현클래스라고 한다.
 */
public class Tv implements RemoteControl{
	private int volume;

	@Override	//실체메서드
	public void turnOn() {
		System.out.println("Tv의 전원을 켭니다.");
	}	

	@Override	//실체메서드
	public void turnOff() {
		System.out.println("Tv의 전원을 끕니다.");
	}

	@Override	//실체메서드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {	//최고불륨보다 큰 경우 예)100->10으로 만들고
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){	//최저불륨보다 작은경우 예)-10->0으로 만들고
			this.volume=RemoteControl.MIN_VOLUME;
		}else { //정상범주인 경우
			this.volume = volume; // -10->0을 만들고 100->10으로 만들고
		}
		System.out.println("현재 Tv의 volume="+this.volume);
	}

}
