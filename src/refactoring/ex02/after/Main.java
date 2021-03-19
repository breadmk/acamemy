package refactoring.ex02.after;

public class Main {

	public static void main(String[] args) {
		
		PuppyRobot puppy = new PuppyRobot("Max");
		puppy.order(PuppyRobot.ODDER_EATS);	//먹이를 먹는다
		puppy.order(PuppyRobot.ODDER_STOP);	//동작을 멈춘다
		puppy.order(PuppyRobot.ODDER_JUMP);	//점핑
		puppy.order(12);
		
		
	}

}
