package ch05_array;

// 가변배열 -[Java의정석]ch5_배열 - 슬라이드12, 교재 p219 참고

public class Ex05_multi_array {

	public static void main(String[] args) {
//		5개반 학생들의 몸무게를 저장하세요.
//		데이터타입[][] 변수명 = {{}};
		double[][] weight= {
						{20.5, 21.9, 22.3},
						{17.8, 19.5},
						{26.7},
						{20.9, 22.2, 29.6, 30.4},
						{13.4, 15.2}
						};
		
		System.out.println("weight[0].length="+weight[0].length);
		
		System.out.println("weight[0].length="+weight[1].length);
		System.out.println("weight[0].length="+weight[2].length);
		System.out.println("weight[0].length="+weight[3].length);
		System.out.println("weight[0].length="+weight[4].length);
		System.out.println();
//		위에 내용은 배열 가로의 갯수를 카운팅 || 그래서 아래 코드에서 weight[i].length 를 사용함.
		
		for(int i=0; i<weight.length; i++) {
//			배열의 크기가 다르므로 조건 weight[i].length 로 이용.
			for(int j=0; j<weight[i].length; j++) {
				System.out.print(weight[i][j]+" ");
				}
			System.out.println();
			}
		}
	}


