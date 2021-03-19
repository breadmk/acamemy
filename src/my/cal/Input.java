package my.cal;

import java.util.Scanner;

public class Input {
	
		int result=0;
		
		public Input() {
			
		}
		public Input(int result) {
			this.result=result;
		}
	
	static void clear(Scanner sc) {
		System.out.println("계산이 초기화 되었습니다.");
		int first=Input.getFirstValue(sc);
		int result = first;
		while(true) {
			
			String buho = Input.getSymbol(sc);
						
			if(buho.equals("quit")) {
				Input.print(result);
				break;
			}
			int second = Input.getSecondValue(sc);
			
			result = Input.calcul(result,buho,second);
	}
	}
	
	static int getFirstValue(Scanner sc) {
		
		System.out.println("첫 번째 입력 값: ");
		int first = sc.nextInt();
		return first;
	}
	
	static String getSymbol(Scanner sc) {
		
		System.out.println("사칙연산 기호 : "+"종료하려면 quit를 입력하세요");
		String buho = sc.next();
		return buho;
	}
	
	static int getSecondValue(Scanner sc) {
		System.out.println("두 번째 입력 값: ");
		int second = sc.nextInt();
		return second;
		
	}
	static void print(int result) {
		System.out.println("최종결과값 : "+result);
}
	
	static int calcul(int first,String symbol, int second) {
		int result = first;
		if(symbol.equals("+")) {
			result = first+second;
			System.out.println("덧셈 : "+result);
		}else if(symbol.equals("-")) {
			result = first-second;
			System.out.println("뺏셈 : "+result);
		}else if(symbol.equals("*")) {
			result = first*second;
			System.out.println("곱셈 : "+result);
		}else if(symbol.equals("/")){
			result = first/second;
			System.out.println("나눗셈 : "+result);
		}else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
		return result;

	}
}
