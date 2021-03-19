package ch07;
// 이클래스는 CellPhone 클래스를 상송받는 자식 클래스이다.
// class 자식클래스명 extends 부모클래스명{}
public class DmbCellPhone01 extends CellPhone01{
//	이 클래스에는 CellPhone01클래스로 상속받은 field, method가 이미 존재
	
//	field
	int channel;
//	constructor
		
public DmbCellPhone01(String model, String color, int channel) {
	this.model=model;
	this.color=color;
	this.channel=channel;
	}


	//	method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 dmb 방송 수신을 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바뀝니다.");
	}
	void turnOffDmb() {
		System.out.println("dmb 방송 수신 종료.");
	}

}
