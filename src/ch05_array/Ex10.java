package ch05_array;
//배열의 활용
//5명 학생의 최고점수와 최저점수를 출력하세요. (비교)
/* 출력결과
* 최고점수 : 100
* 최저점수 : 10
*/
public class Ex10 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
		int max = score[0];
		int min = score[0];
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				
				max = score[i];
			}else if(score[i]<min){
				min = score[i];
			}
			System.out.print(score[i]+" ");
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		
	}

}
