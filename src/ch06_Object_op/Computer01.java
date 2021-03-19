package ch06_Object_op;

//매개변수의 개수를 모를 때 메소드 선언과 사용법

public class Computer01 {
	
	//Field [접근제어자][속성] 데이터타입 변수명;
	
	//Constructor	[접근제어자] 클래스명(매개변수리스트){};
	
	//Method [접근제어자][속성] 리턴타입 함수명(매개변수리스트){};
//	문법1) [접근제어자][속성] 리턴유형 메소드명(타입[] 매개변수명){}
	int sum(int[] values) {	//1,2,3
		int result = 0;		//결과를 저장하는 변수선언
		//매개변수에 입력된 데이터를 이용 더하기 계산
		for (int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;	//결과 output
	}
//	문법2) [접근제어자][속성] 리턴유형 메소드명(타입··· 매개변수명){}
	int sum1(int ... values) {
		int result = 0;		//결과를 저장하는 변수선언
		//매개변수에 입력된 데이터를 이용 더하기 계산
		for (int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;	//결과 output
	}
}






































