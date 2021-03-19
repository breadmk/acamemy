package ch05_array;

//배열(Array) 
/* - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
 * - 많은 양의 값(데이터)을 다룰 때 유용 
 * - 배열의 각 요소는 서로 연속적
 */

/*	"향상된 for문을 이용하여 출력~p.166"
 *	for(int index=0; index<배열의길이; index++ ){ } 의미를 가지고 있으므로
 *	배열의 첫 번째 요소부터  배열의 마지막 요소까지 접근한다.
 *
 * 	for( 데이터타입 변수명 : 배열명 또는 컬렉션명 ){
 * 			//반복실행코드
 * 		}
 */
public class Ex01_array {

	public static void main(String[] args) {
		// 데이터타입[] 변수명 		--배열변수선언 방법1.
		// 데이터타입 변수명[];		--배열변수선언 방법2.
		// 변수명: new 데이터타입[크기];	//배열변수타입에 따라 자동 초기화.
		int[] score;
		score = new int[3];		// heap영역에 int타입의 데이터가 들어갈 공간을 확보해줘.
								// 데이타타입에 따라 자동으로 초기화.
								// heap 영역의 생긴 주소지를 score 변수에 할당.
		
		//값 출력 :	배열변수명[인덱스번호] =>index 번호는 0부터 1씩 증가
		System.out.println("score = " +score);	//score = [I@15db9742
			System.out.println("score[0]="+score[0]);
			System.out.println("score[1]="+score[1]);
			System.out.println("score[2]="+score[2]);
			System.out.println();
			
			System.out.println("배열의 길이 = " + score.length);	
			//배열명.length => 배열의 길이.
			System.out.println();
		System.out.println("for문을 이용하여 값을 출력---");
	
		for(int i=0; i<3; i++) { //0 1 2
			System.out.println("score["+i+"]="+score[i]);
			}
		System.out.println();
		System.out.println("위 코드 아래 코드 동일");
		System.out.println();
		for(int i=0; i<score.length; i++) { //0 1 2
			System.out.println("score["+i+"]="+score[i]);
		}
		
		System.out.println();
		
		System.out.println("향상된 for문을 이용하여 출력~p.166");
		// for( 데이터타입 변수명 : 배열명 ){ 반복 실행 코드 }
		for( int num : score ){	// score 배열의 길이만큼 반복면서 
								// score[0]의 값을 가져와서 num 변수에 할당.
								// scroe[1]의 값을 가져와서 num 변수에 할당.
								// scroe[2]의 값을 가져와서 num 변수에 할당.
			 System.out.println(num);
		 		}
	}
}


