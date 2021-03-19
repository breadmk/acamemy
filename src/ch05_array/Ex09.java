package ch05_array;


//배열의 활용
//5명 학생의 총점수와 평균점수를 또 다른 배열에 저장한 후 출력하세요. (배열에 저장)
/* 출력결과
* 총점 : 
* 평균 :
*/
public class Ex09 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
//		double[] result = new double[2];
		int sum =0;
		int avg =0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
			System.out.println("총점 = " +sum);
			avg= sum/5;
			System.out.println("평균 = " +avg);
				
				int[] score1 = new int[2];
				score1[0]=sum;
				score1[1]=avg;
				
				for(int i=0; i<score1.length; i++) {
					System.out.print(score1[i]+" ");
				}
				//System.out.println("총점= "+sum+" 평균점수= "+avg);

		
	}
}


