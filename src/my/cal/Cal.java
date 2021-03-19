package my.cal;

import java.util.Scanner;

public class Cal {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first=Input.getFirstValue(sc);
		int result = first;
		while(true) {
			
			String buho = Input.getSymbol(sc);
						
			if(buho.equals("quit")) {
				Input.print(result);
				break;
			}else if(buho.equals("clear")) {
				Input.clear(sc);
			}
			int second = Input.getSecondValue(sc);
			
			result = Input.calcul(result,buho,second);
			
		}
		
	}
	
}
