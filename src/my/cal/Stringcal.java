package my.cal;

import java.util.Scanner;

public class Stringcal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 값 입력 : ");
		
		String value = sc.nextLine();
		System.out.println("입력 값 : "+value);
		
		String[] values = value.split(" ");
		int first = Integer.parseInt(values[0]);
		
		int result = first;
		
		for(int i = 1; i<values.length; i=i+2) {
			String symbol = values[i];
			System.out.println("symbol: " + symbol);
			
			int second = Integer.parseInt(values[i+1]);
			System.out.println("second : "+ second);
			
			result = Input.calcul(first, symbol, second);
			
		}
		OutPut.print(result);
	}

}
