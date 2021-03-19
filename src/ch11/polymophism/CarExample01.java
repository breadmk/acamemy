package ch11.polymophism;

// 이 클래스는 실행클래스로서 필드의 다형성을 살펴보고자 한다.
public class CarExample01 {

	public static void main(String[] args) {
		//Car01 클래스 객체 생성
		Car01 car = new Car01();
		
		//Car01 객체의 run()을 반복 실행
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation){
			case 1: System.out.println("왼쪽앞 HankookTire로 교체"); //왼쪽앞 타이어가 펑크났을때.
					car.fltire = new HankookTire("왼쪽앞",15);	//자동타입변환
//					부모클래스 참조변수 = new 자식클래스명();
//					Car01 car = new HankookTire("왼쪽앞",15);
//					Car01의 필드에는 Tire 클래스타입의 필드 flTire가 선언되어 있다.
//					따라서 Car01의 필드인 flTire에 HankookTire()객체가 들어갈 수 있다
					break;
			case 2: System.out.println("오른쪽앞 KumhoTire로 교체");
					car.frtire  = new KumhoTire("오른쪽앞",13);
					break;
			case 3: System.out.println("왼쪽뒤 HankookTire로 교체");
					car.bltire  = new HankookTire("왼쪽뒤",14);
					break;
			case 4: System.out.println("오른쪽뒤 KumhoTire로 교체");
					car.brtire  = new KumhoTire("오른쪽뒤",12);
					break;
			}
			System.out.println("------------------------"); //문제없이 잘 굴러간 경우
		}//for
	}

}
