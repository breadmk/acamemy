package ch04_if_for;

import java.util.Scanner;

public class Practice_Scanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 영어로 입력해주세요");
		String input = scanner.nextLine();
		System.out.println("이름은 "+input);
		
	}

}
