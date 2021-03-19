package refactoring.ex01.after;

public class PuppyRobot {
	
	private String _name;
	
	static final int EAT = 0;
	static final int STOPS = 1;
	static final int JUMPS = 2;

	public PuppyRobot(String name) {
		_name = name;
	}
	
	void order(int order) {
		
		if(order==EAT) {
			System.out.println(_name+"이 먹이를 먹어요");
		}else if(order==STOPS) {
			System.out.println(_name+"이 동작을 멈춥니다");
		}else if(order==JUMPS) {
			System.out.println(_name+"이 점프를 합니다");
		}else {
			System.out.println("올바른 명령이 아닙니다.");
		}
	}
	
}
