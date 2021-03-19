package ch11.polymophism;


public class Tire01 {
	//field
	public int maxRotation;			//최대회전수(=>타이어의 수명)
	public int accumulatedRotation;	//누적회전수
	public String location;			//타이어의 위치 1:왼쪽앞 2:오른쪽앞 3:왼쪽뒤 4:오른쪽뒤
		
	//constructor
	public Tire01() {}
	public Tire01(String location, int maxRotation) { //new HankookTire("왼쪽앞",15;)
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//method
	
	public boolean roll() {
		++accumulatedRotation; //호출될때마다 1씩 회전수 (누적)증가.
		if(maxRotation>accumulatedRotation) {//누적회전수<최대회전수 : 정상적으로 타이어가 roll 상태
			System.out.println(location+"Tire수명: "+(maxRotation-accumulatedRotation)+"남았습니다");
			return true;
		}else {	//누적회전수 == 최대회전수 : 펑크발생
			System.out.println("**"+location+"Tire펑크");
			return false;
		}
	}
}

