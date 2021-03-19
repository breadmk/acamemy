package ch05_array;


//	배열변수 생성과 값 할당.
//	방법1. 생성 후 값을 할당.
//	방법2. 생성하면서 값을 할당.
public class Ex03_array {

	public static void main(String[] args) {

//		방법1. 생성 후 값을 할당.
		int[] nums = new int[3];
		nums[0] = 10;	// 인덱스번호 0에 10을 할당.
		nums[1] = 20;	// 인덱스번호 1에 20을 할당.
		nums[2] = 30;	// 인덱스번호 2에 30을 할당.
		System.out.println();
		for(int num : nums) {
			System.out.println(num);
		}
//		방법2. 생성하면서 값을 할당.
//	문법	데이터타입[] 배열변수명 = {초기값,...,초기값}
//		char[] c = new char[] {'a','b','c'}; 또는
		char[] c = {'a','b','c'};
//		char[] c = new char[3] {'a','b','c'};
//		Cannot define dimension expressions 
//		when an array initializer is provided	 => 초기값을 제공하면서 배열크기를 명시하면 안된다. 
		for( char temp : c) {
			System.out.println(temp);
		}
	}

}
