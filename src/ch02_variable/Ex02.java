package ch02_variable;
//	변수의 사용범위
//	변수는 중괄호{}	블록 내에서 선언되고 사용된다.
public class Ex02 {    // Class(클래스)블록

		public static void main(String[] args) {    //Method (메서드)블록
			// 변수 v1에 정수 15할당.
			int v1 = 15;
			
			if(1>0) {
				int v2 = v1-10;
			}
			
			//System.out.println(v1+v2); //15+5
			//14라인에서 컴파일 에러발생.
			//그 이유는 v2가 선언된 곳은 if블럭 내부인 11라인이므로
			//if블럭 밖인 14라인에서는 사용할 수 없다.
			//특정 블럭안에서만 변수를 사용할 수 있다 -> 지역변수 
			
			//변수 v1은 main 메서드안에서는 사용 할 수 있다.
	}//main 메서드 끝

}
