package ch03_operator;

//논리연산자
//연산자 우선순위 산술 > 비교 > 논리 > 대입
//	T & T => 결과는 T
//	F & T => &앞의 결과가 false 이더라도 뒤의 결과를 살펴본다. 결과는 F
//	T && T => 결과는 T
//	F && T => &&앞의 결과가 false이면 결과는 무조건 false이므로 뒤의 결과를 보지 않는다. => 더 효율적.
// &&는 뒤도 안 돌아보기 때문에 처리 속도가 빠르다.
public class Ex07 {

	public static void main(String[] args) {
		int charcode = 'Q';
		int charcode1 = 'z';
		int charcode2 = '7';
		
		if(charcode>=65 && charcode<=90) {
			System.out.println("대문자입니다.");
		}
		if(charcode1>=97 && charcode1<=122) {
			System.out.println("소문자입니다.");
		}
		if(charcode2>=48 && charcode2<=57) {
			System.out.println("숫자입니다.");
		}
		
		int num = 95;
		if(num%2==0) {
			System.out.println(num + "는 2의 배수이군요.");
		}else {
			System.out.println(num + "는 2의 배수가 아니군요");
		}
		int num1 = 93;
		if(num1%2==0 | num1%3==0) {
			System.out.println(num1 + "는 2 또는 3의 배수이군요.");
		}else {
			System.out.println(num1 + "는 2 또는 3의 배수가 아니군요");
		}
		int num2 = 93;
		if(num2%2==0 || num2%3==0) {
			System.out.println(num2 + "는 2 또는 3의 배수이군요.");
		}else {
			System.out.println(num2 + "는 2 또는 3의 배수가 아니군요");
		}
	}

}
