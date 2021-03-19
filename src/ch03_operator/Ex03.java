package ch03_operator;

public class Ex03 {

	public static void main(String[] args) {
		double pi = 3.14;
		pi = 1.123;
		pi = 1.456;
		System.out.println("Math.PI="+Math.PI);
		// Math.PI = 1.1234;  The final field Math.PI cannot be assigned
		long r1 = Math.round(Math.PI);	//반올림의 기준은 소수점 첫 번째 자리. <<쪽은 -1,-2 0 >>쪽은 1,2
		System.out.println("r1 = "+ r1);
	}

}
