package ch04_if_for;

import java.util.Scanner;	//java.util 패키지안의 Scanner 클래스를 import 하겠다. p.40,510

/* 가위(1),바위(2),보(3) 게임을 구현하세요  [[ 교재 p.150 ]]
 * 컴퓨터 : 임의값 -> Math.random()이용
 * 유저 : 값을 입력 -> Scanner 클래스 이용
 * 
 * 비교연산자, 조건문 이용
 * 
 * 예) 컴퓨터는 보를 내었습니다.
 * 당신은 가위를 내었습니다.
 * 귀하께서 이겼어요.
 */
public class Ex05_p_150 {

	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중에 하나를 입력하세요.");
		Scanner scanner  = new Scanner(System.in);
		int user = scanner.nextInt();	//콘솔을 통해 입력받은 데이터를 숫자형태로 받겠다. ( user의 입력 내용 )
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("당신은"+user+"를 내였습니다.");
		System.out.println("컴퓨터는"+com+"를 내였습니다.");
		
		//가위(1),바위(2),보(3)  가위(1)<바위(2) , 바위(2)<보(3) , 보(3)<가위(1) 
		switch(user-com) {
		case 2: System.out.println("귀하가 졌습니다."); 	// user = 보 com = 가위 
		case -1: System.out.println("귀하가 졌습니다.");	//user = 보 com =가위
				break;
		case 1: System.out.println("귀하가 이겼습니다");		//user = 바위 com = 가위
		case -2: System.out.println("귀하가 이겼습니다");	// user = 가위 com = 보
				break;
		case 0: System.out.println("비겼습니다.");
			System.out.println();
		}
		
	}

}
