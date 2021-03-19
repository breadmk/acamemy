package ch04_if_for;

/* 가위,바위,보 게임을 구현하세요.
 * 컴퓨터 : 임의 값.
 * 유저 : 임의 값.
 * 예) 컴퓨터는 보를 내었습니다.
 * 당신은 가위를 내었습니다.
 * 귀하께서 이겼어요.
 */

public class Practice_Math_random {

	public static void main(String[] args) {
		int user = (int)(Math.random()*3)+1;
		int com = (int)(Math.random()*3)+1;
		System.out.println(user);
		System.out.println(com);
		//1=가위 2=바위 3=보
		if(user==com) {
			System.out.println("당신과 컴퓨터가 같은 것을 내어 비겼습니다.");
		}else if(user==1 && com==2) {
			System.out.println("당신은 가위를 내었습니다.");
			System.out.println("컴퓨터는 바위를 내었습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		}else if(user==2 && com==3) {
			System.out.println("당신은 바위를 내었습니다.");
			System.out.println("컴퓨터는 보를 내었습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		}else if(user==3 && com==1) {
			System.out.println("당신은 보를 내었습니다.");
			System.out.println("컴퓨터는 가위를 내었습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		}else if(user==3 && com==2) {
			System.out.println("당신은 보를 내었습니다.");
			System.out.println("컴퓨터는 바위를 내었습니다.");
			System.out.println("당신이 이겼습니다.");
		}else if(user==2 && com==1) {
			System.out.println("당신은 바위를 내었습니다.");
			System.out.println("컴퓨터는 가위를 내었습니다.");
			System.out.println("당신이 이겼습니다.");
		}else if(user==1 && com==3) {
			System.out.println("당신은 가위를 내었습니다.");
			System.out.println("컴퓨터는 보를 내었습니다.");
			System.out.println("당신이 이겼습니다.");
		}
		 
		
	}

}
