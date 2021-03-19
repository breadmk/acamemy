package ch07;

public class Compuer01_Ex01 {
	
	public static void main (String[] args) {
		double r = 10;
		Calculator01 cal = new Calculator01();
		System.out.println("원면적 = " +cal.areaCricle(r));//Calculator01
		System.out.println();
		
		Computer01 com = new Computer01();
		System.out.println("원면적 = " +com.areaCricle(r));//Computer01
//		자식클래스인 Computer01 에서 재 정의한 메소드가 호출
		System.out.println("-----------------------");

		// 다형성
		// 원 is a 도형
		// 삼각형 is a 도형
		// 도형 = 원 
		// 도형 = 삼각형
		// 조상타입의 참조변수로 자손타입의 인스턴스를 참조.
		// Computer is a Calculator
		// Calculator = Computer ~! = ~~~~ 
		// 부모클래스 참조변수 = new 자식클래스();
		Calculator01 obj = new Computer01();
		System.out.println("원면적 = " +obj.areaCricle(r));//Computer01
	}

}
