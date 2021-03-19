package refactoring.ex02.after2;

/* 소스코드에 특정한 숫자. 매직넘버(magic number)를 직접사용하는 코드스타일은 바람직하지 않다.
 * 이유1) 매직넘버의 의미를 파악하기 힘들다.
 * 		 0				매직넘버
 * 		 ORDER_EATS		기호상수
 * 이유2) 매직넘버는 수정하기가 어렵다.
 *  * 		  유지보수시 시간, 비용,                    노력이 많이 든다.
 * 
 * 	 해결벌:매직넘버를 기호상수로 치환.
 * 	upgrade : 기호상수를 enum으로 처리.
 * 	 방법 :
 * 	 1.기호상수 선언
 *		1-1. 기호 상수 선언.	static final
 *		1-2. 매직넘버를 기호 상수로 치환.
 *		1-3. 기호 상수에 의존하는 다른 매직넘버를 찾아서 기호상수를 사용한 표현식으로 변환
 *		1-4. 컴파일
 *   2. 테스트
 *  	2-1. 모든 기호 상수 치환이 끝나면 컴파일해서 테스
 *  	
 */

public class PuppyRobot {
	//field
	
	private String _name;
	
//	enum 선언
	public enum Order{
//		public static final PuppyRobot ODDER_EATS= new PuppyRobot("Max"); //주소값저장 / PuppyRobot
//		public static final PuppyRobot ODDER_STOP= new PuppyRobot("Max");
//		public static final PuppyRobot ODDER_JUMP= new PuppyRobot("Max");
//		위에 작성된 내용을 간단히 명시.
		
		EATS,STOP,JUMP;
	}
	
//	1-1. 기호 상수 선언.
	public static final PuppyRobot ODDER_EATS= new PuppyRobot("Max"); //주소값저장 / PuppyRobot
	public static final PuppyRobot ODDER_STOP= new PuppyRobot("Max");
	public static final PuppyRobot ODDER_JUMP= new PuppyRobot("Max");

	public PuppyRobot() {
		
	}
	public PuppyRobot(String name) {
		this._name = name;
	}

	public void order(PuppyRobot.Order order) {
		switch(order) {
//		변경전
//		case 0: System.out.println(_name + " eats");
//		case 1: System.out.println(_name + " stop");
//		case 2: System.out.println(_name + " jumping");
		case EATS: System.out.println(_name + " eats");
				break;
		case STOP: System.out.println(_name + " stop");
				break;
		case JUMP: System.out.println(_name + " jumping");
				break;
		default: System.out.println(_name + " error code");
			break;
		}
	}
	
	
	
}
