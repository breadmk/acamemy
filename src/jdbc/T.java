package jdbc;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println("pi =" + pi);
		
		System.out.println((Math.round(pi*100)));
		System.out.println((Math.round(pi*100)/100.0));
		System.out.println((Math.round(pi*1000)));
		System.out.println((Math.round(pi*1000)/1000.0));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String s1 = sc.nextLine(); //String으로 입력값을 받는다.
		int n = Integer.parseInt(s1); //String 타입을 int로 변환
		System.out.println(n+1);
//		System.out.println(s1+1);
		System.out.println("----------------------");
		System.out.println("입력: ");
		int s = sc.nextInt(); //입력받은 String을 Int로 변환
		System.out.print(s+1);
		
	}

}






