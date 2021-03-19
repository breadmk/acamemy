package ch11.polymophism2;

//이 클래스는 Tire01을 상속받는 클래스이다.
public class HankookTire extends Tire01{
	// 상속받은 field 값
	
//	public int maxRotation;			//최대회전수(=>타이어의 수명)
//	public int accumulatedRotation;	//누적회전수
//	public String location;			//타이어의 위치 1:왼쪽앞 2:오른쪽앞 3:왼쪽뒤 4:오른쪽뒤
	
	//constructor
	
	public HankookTire() {
	}
	public HankookTire(String location, int maxRotation) {
//			super() 조상클래스의 생성자를 호출, 반드시 생성자의 첫번째 라인에서 작성
			super(location,maxRotation);
			/*this.location=location;
			this.maxRotation=maxRotation;*/
	}
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation; //호출될때마다 1씩 회전수 (누적)증가.
		if(maxRotation>accumulatedRotation) {//누적회전수<최대회전수 : 정상적으로 타이어가 roll 상태
			System.out.println(location+"HanKookTire수명: "+(maxRotation-accumulatedRotation)+"남았습니다");
			return true;
		}else {	//누적회전수 == 최대회전수 : 펑크발생
			System.out.println("**"+location+"HankookTire펑크");
			return false;
		}
	}
	
		
}
