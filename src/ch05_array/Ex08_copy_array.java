package ch05_array;

import java.util.Arrays;

//System.arraycopy()를 이용해서 배열을 복사
public class Ex08_copy_array {

	public static void main(String[] args) {
		int[] oldArr1 = {11,12,13,14,15};
		int[] newArr1 = new int[10];
		System.out.println("배열복사 전의 oldArr1=");
		for(int i=0; i<oldArr1.length; i++) {
			System.out.print(oldArr1[i]+" ");
		}
		System.out.println();
		System.out.println("배열복사 전의 newArr1=");
		
		for(int i=0; i<newArr1.length; i++) {
			System.out.print(newArr1[i]+" ");
		}
		System.out.println();
		System.out.println("배열 복사 후의 newArr1 =");
//		System.arraycopy()를 이용해서 배열을 복사
//		System.arraycopy()를 이용하면 원본배열의 일부데이터를 원하는 새배열위치부터 넣을 수 있다.
		
//		11 12 13 14 15
//		출력 결과 0 0 0 0 0 13 14 15 0 0
		System.arraycopy(oldArr1,2,newArr1,5,3);
//		Arrays.클래스 java.util 패키지안에 존재하면서 배열과 관련된 여러 기능을 제공하는 클래스이다.
//		Arrays.toString(배열명) : 파라미터로 던진 배열안의 데이터를 문자열 형태로 가져온다.
//		Arrays 클래스에 대한 자세한 내용은 교재 p.624 참고.
		System.out.println(Arrays.toString(newArr1));	//배열 좀 더 편하게 출력
//		arraycopy(원복배열명,원본 복사시작 인덱스번호,새배열명,새배열의 시작 인덱스번호,원본배열에서 가져올 데이터 갯수)
		for(int temp : newArr1) {
			System.out.print(temp+ " ");
		}

//		System.arraycopy(oldArr1,0,newArr1,0,oldArr1.length);
//		for(int temp : newArr1) {
//			System.out.print(temp+" ");
//
//		}
		
	}

}
