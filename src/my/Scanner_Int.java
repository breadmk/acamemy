package my;

import java.util.Scanner;

public class Scanner_Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오");
		String a = sc.next();
		System.out.println(a+1);
		int b = Integer.parseInt(a);
		System.out.println(b+1);
		
		
	}	

}
