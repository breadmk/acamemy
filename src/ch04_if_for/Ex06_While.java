package ch04_if_for;

//while문
public class Ex06_While {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			//조건 만족시 반복실행코드
			i++;
			System.out.println("i="+i);
		}
		System.out.println("while문 밖");
		
		System.out.println("---------------");
		
		int i1=0;
		while(i1<5) {
			//조건 만족시 반복실행코드
			System.out.println("i="+i1);
			i1++;
		}
		System.out.println("while문 밖");
	}

}
