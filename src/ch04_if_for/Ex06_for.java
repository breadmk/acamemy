package ch04_if_for;

// 반복문 for
public class Ex06_for {

	public static void main(String[] args) {
		//1 2 3 4 ... 8 9 10 // 1~10까지 출력
		
		for(int i=1; i<=10; i++) {
			System.out.println("i="+i);
		}
		System.out.println();
		//5 4 3 2 1 // 출력
		for(int i=5; i>=1; i--) {
			System.out.println("i="+i);
			
		}
		System.out.println();
		//구구단 2단 출력 2*1 =2 .... 2*10=20
		for(int i=1; i<=10; i++) {
			int dan = 2;
			int result = 2*i;
			System.out.println(dan+" * "+i+" = "+result);
		}
		System.out.println();
		//0+1+2+3+4+5+6....+100
		int sum = 0;	//누적된 합을 저장하기위해 선언한 변수.
		for(int i=0; i<=100; i++) {
			sum += i;// sum = sum+i; | += -= *=  //대입연산자.  
			//System.out.println("sum+i="+sum);
			//System.out.println("i="+i);
		}
		System.out.println("총합="+sum);
		System.out.println();
		int j=0;
		for( ; ; ) {		//ppt 16번째
			if(j<5) {
				System.out.println(j);
				j++;
			}else { 
				System.out.println("조건X");
				break; //반복문 종료.
			}
		}
		System.out.println("for문 밖");
	}
}
