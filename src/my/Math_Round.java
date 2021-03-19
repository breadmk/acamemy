package my;

public class Math_Round {

	public static void main(String[] args) {
		double pi= 3.141592;
//		3.14
		System.out.println(Math.round(pi*100)/100.0);
		
//		3.142
		System.out.println(Math.round(pi*1000)/1000.0);
//		3.1416
		System.out.println(Math.round(pi*10000)/10000.0);
	}

}
