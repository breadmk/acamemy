package ch06_Object_op;
//car05 클래스로부터 객체를 생성하여 실행하는 클래스.
public class Car05_ex01 {
	
	public static void main(String[] args) {
//		자동차주문
		Car05 myCar = new Car05();
//		가스충전기능 실행
		myCar.setGas(10);
//		가스충전여부를 확인기능 실행
		boolean gasState=myCar.isLeftGas();
		if(!gasState) {
			myCar.run();	//달려라기능 실행
		}
		if(!myCar.isLeftGas()) {
			System.out.println("gas가 충분합니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
