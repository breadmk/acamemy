package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수를 출력하세요.
/* 출력결과
 * 총점 : 
 * 평균 :
 */
public class Ex08 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
		int sum =0;	//총점을 저장하기 위한 변수선언.
		double avg =0;	//평균을 저장하기 위한 변수선언.
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
			System.out.println("총점 = " +sum);
			avg= (double)sum/5;
			System.out.println("평균 = " +avg);
	}

}
