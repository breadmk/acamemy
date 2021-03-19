package ch04_if_for;

//break (p.175)
//자신이 포함된 하나의 반복문 또는 switch 문을 빠져 나간다.
//주로 if문과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게 한다.
public class Ex07_break {

	public static void main(String[] args) {
		int count = 0;	//횟수를 저장하기 위한 변수 선언.
		while( true ) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("num"+num);
			count++;	//1번 반복할 때 마다 횟수가 1씩 증가.
			if(num==5) {
				break;
			}
		}
		System.out.println("count = "+ count); //여기에서는 프로그램종료.
	}//end of main

}
