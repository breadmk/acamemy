package ch03_operator;

// A학점  : 91~100
// B학점  : 81~90
// C학점  : 71~80
// 조건 ? 참값:거짓값 =>if(조건){참값}else{거짓값}
// 조건1? 조건1참값:(조건2)?:조건2참값:조건2거짓값;

public class Ex08 {

	public static void main(String[] args) {
		/*임의 숫자를 score 변수에 저장
		100~91이면 A학점
		81~90이면 B학점 이라고 출력하세요.
		*/
		
		/*(조건1)?조건1참값:거짓값;
		 * (조건1)?참값:(조건2)참값:거짓값;
		 */ 
		int score3 = 99;
		String result=(score3>=91)?"A학점":(score3>=81)?"B학점":"그외등급";
		System.out.println("점수의 등급은 " + result);
		
		int score = 66;
		if(score<=100 && score>= 91 ) {
			System.out.println("A학점 입니다.");
		}else if(score<91 && score>= 81 ) {
			System.out.println("B학점 입니다.");
		}else if(score<81 && score >=71){
			System.out.println("C학점 입니다.");
		}else {
			System.out.println("과락입니다.");
		}
		
		int score1 = 95;
		int score2 = 85;
		String str = score1>score2 ? "A등급" :"B등급";
		System.out.println(str);
		
		int score4 = 88;
		String grade = (score4>91)?"A등급":"B등급";
		System.out.println(grade);
		
		
		
		
	}

}
