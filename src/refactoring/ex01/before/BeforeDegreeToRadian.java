package refactoring.ex01.before;

public class BeforeDegreeToRadian {

	public static void main(String[] args) {
		
		
		BeforeDegreeToRadian01 db = new BeforeDegreeToRadian01();
		
		double radian = db.degreeToRadian(180);
		System.out.println(radian);
	}

}

class BeforeDegreeToRadian01{
	public static double degreeToRadian(double degree) {
		return degree / 180 * 3.141592653589898989846;
	}
	
}