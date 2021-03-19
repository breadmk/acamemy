package refactoring.ex02.before;

public class PuppyRobot {
	//field
	
	String _name;

	public PuppyRobot(String name) {
		this._name = name;
	}

	public void order(int order) {
		
		switch(order) {
		case 0: System.out.println(_name + " eats");
			break;
		case 1: System.out.println(_name + " stop");
			break;
		case 2: System.out.println(_name + " jumping");
			break;
		default: System.out.println(_name + " error code");
			break;
		}
	}
	
	
	
}
