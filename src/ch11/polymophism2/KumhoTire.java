package ch11.polymophism2;

public class KumhoTire extends Tire01 {
	//field

	//constructor
	public KumhoTire() {
	}
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

		//method
	@Override
	public boolean roll() {
		++accumulatedRotation; //호출될때마다 1씩 회전수 (누적)증가.
		if(maxRotation>accumulatedRotation) {//누적회전수<최대회전수 : 정상적으로 타이어가 roll 상태
			System.out.println(location+"KumhoTire수명: "+(maxRotation-accumulatedRotation)+"남았습니다");
			return true;
		}else {	//누적회전수 == 최대회전수 : 펑크발생
			System.out.println("**"+location+"KumhoTire펑크");
			return false;
		}
	}
	
}
