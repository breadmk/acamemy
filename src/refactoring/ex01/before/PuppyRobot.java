package refactoring.ex01.before;

public class PuppyRobot {
	
	private String _name;

	public PuppyRobot(String name) {
		_name = name;
	}
	
	void order(int order) {
		
		if(order==0) {
			System.out.println(_name+"이 먹이를 먹어요");
		}else if(order==1) {
			System.out.println(_name+"이 동작을 멈춥니다");
		}else if(order==2) {
			System.out.println(_name+"이 점프를 합니다");
		}else {
			System.out.println("올바른 명령이 아닙니다.");
		}
	}
	
}
