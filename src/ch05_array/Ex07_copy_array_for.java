package ch05_array;

//배열의 복사
//[Java의정석]ch5_배열 - 슬라이드13, 교재 p192 참고
public class Ex07_copy_array_for {

	public static void main(String[] args) {
//		oldArr1
		int[] oldArr1 = {1,2,3};
		int[] newArr1 = new int[10];
		
//		oldArr1[0]의 값을 newArr1[0]에 넣겠다
//		newArr1[0]= 9;	// newArr1[0] = 1; == oldArr1[0]
//		newArr1[1]= 8;	// newArr1[1] = 2; == oldArr1[1]
//		newArr1[2]= 7;	// newArr1[2] = 3; == oldArr1[2]
//		newArr1[3]= 6;
		
//		배열복사 전의 oldArr1
		for(int i=0; i<oldArr1.length; i++) {
			System.out.println("배열복사 전의 oldArr1="+oldArr1[i]);
		}
		System.out.println();
//		배열복사 전의 newArr1
		for(int i=0; i<newArr1.length; i++) {
			System.out.println("배열복사 전의 newArr1="+newArr1[i]);
		}
		System.out.println();
//		배열 복사 후의 newArr1------
//		for문을 이용한 배열의 복사
		for(int i=0; i<oldArr1.length; i++) {
			newArr1[i]=oldArr1[i]; // oldArr1[0]의 값을 newArr1[0]에 넣겠다
		}
		System.out.println();
		for(int temp:newArr1) {
			System.out.println("배열복사 후의 newArr1= "+temp+" ");
		}
		
	}

}
