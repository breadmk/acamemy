package refactoring.ex01.before;

// 매직넘버를 (기호) 상수로 치환
// 매직넘버란? 소스코드에 특정한 값을 가지고 있는 숫자

//리팩토링 기준 : 매직넘버 를 기호 치환.
//개선방법 : 매직넘버를 기호상수 치환


// 이 클래스는 크루즈를 제어하는 기능을 가진 클래스이다. 가정.
class CruiseControl{
	//field _name 과 동일
	private double targetSpeedkmh;
	
	//constructor
	
	//method
	void setPreset(int speedPreset) {
		if(speedPreset==2) { //리팩토링의 대상
			setTargetSpeedKmh(10213);
		}else if(speedPreset==1) {
			setTargetSpeedKmh(9800);
		}else if(speedPreset==0) {
			setTargetSpeedKmh(25000);
		}
		
	}
	
	void setTargetSpeedKmh(double speed) {
		targetSpeedkmh = speed;
		System.out.println(speed+"으로 선 설정 완료.");
	}
}


public class BeforeCruiseControl {

	public static void main(String[] args) {
		CruiseControl cruise = new CruiseControl();
		cruise.setPreset(2);	//10213.0으로 선 설정 완료
		cruise.setPreset(1);	//23123.0으로 선 설정 완료
		cruise.setPreset(0);	//43521.0으로 선 설정 완료
	}

}





















