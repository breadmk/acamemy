package ch05_array;

// 배열 선언과 생성 => 데이터타입에 따른 자동초기화
public class Ex02_array_for {

	public static void main(String[] args) {
		//String 타입 데이터3개를 저장하기 위한 names 배열선언 후 출력.
		String [] names = new String[3];
		// for( 데이터타입 변수명 : 배열명 ){ 반복 실행 코드 }
		for(String str : names) {
			System.out.println(str); 	// String 과 같은 class의 초기값은 null
		}
		System.out.println("--------------");
		double[] height = new double[5];
		for(int i=0; i<height.length; i++) {
			System.out.println(height[i]);
		}
		System.out.println("----------------");
		//jumsu 5개를 저장하기 위한 배열변수 jumsu를 선언과 생성
		//int[] jumsu;
		//jumsu = new int jumsu[5];
		int[] jumsu = new int[5];
		for(int i=0; i<jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
	}

}
