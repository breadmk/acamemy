package junitTest.fibo;

//참고 피보나치수열이란? 어떤 수열의 항이 앞의 두 항의 합과 같은 수열을 말한다.
public class Fibo {

	public static void main(String[] args) {
		
		Fibo f1 = new Fibo();
		System.out.println("1,1,2,3,5,8,13,21,34,55,89,144,...");
		System.out.println("0을 제시한 결과는 => "+f1.fibo1(0));
		System.out.println("1을 제시한 결과는 => "+f1.fibo1(1));
		System.out.println("2를 제시한 결과는 => "+f1.fibo1(2));
		System.out.println("3을 제시한 결과는 => "+f1.fibo1(3));
		System.out.println("4를 제시한 결과는 => "+f1.fibo1(4));
		System.out.println("5를 제시한 결과는 => "+f1.fibo1(5));
		System.out.println("6을 제시한 결과는 => "+f1.fibo1(6));
		
		System.out.println();
		System.out.println();
	}

	
	public int fibo1(int n) {
//		1,1,2,3,5,8,13,21,34,55,89,144,...,
//		1.반복문 이용
		if(n==0){ 
			return 0;
		}else if(n==1){
			return 1;
		}else{
			int result = 0;
			int a = 0;
			int b = 1;
			for(int i=2; i<=n; i++) {
				result =(a+b);
				a=b;
				b=result;
			}
			return result;
		}
	}
//		2.재귀함수 이용
	public int fibo2(int n) {
			if(n==0){ 
				return 0;
			}else if(n==1 |n==2){
			return 1;
		}
		return fibo2(n-2)+fibo2(n-1);
	}	
}
