package refactoring.ex01.after;

public class AfterDegreeToRadian {

	public static void main(String[] args) {
		
		AfterDegreeToRadian01 db = new AfterDegreeToRadian01();
		
		double radian = db.degreeToRadian(180);
		System.out.println(radian);
	}

}

class AfterDegreeToRadian01{
	public static double degreeToRadian(double degree) {
		return degree / 180 * Math.PI;
	}
	
}