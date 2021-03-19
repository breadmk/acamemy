package KangMinGyu.cal;

import java.util.Scanner;

public class Cal {
	static Scanner sc = new Scanner(System.in);
	public String input() {
		System.out.println("계산을 시작합니다");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public String[] splitString(String str1) {
		String str[] = str1.split("\\+"); 
		return str;
	}
	
	public int calculate(String[] str) {//if문이나 switch문을 활용해서 add/minus 구분해줘야한다.
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
//		int result = x+y;//str[1]이 "+"이면 
		return x+y ;
		}
	public int add(int x,int y) {
		return (x+y);
	}
}
