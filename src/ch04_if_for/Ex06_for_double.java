package ch04_if_for;

//중첩 for문 - ppt.17
// for문 안에 또 다른 for문을 포함시킬 수 있다.
// for문의 중첩횟수에는 거의 제한이 없다.

//가변인자 p.287
public class Ex06_for_double {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) { 
			System.out.println("i==>"+i+"단");
			
			for(int j=1; j<10; j++) {
				System.out.println("\t"+i+" * "+j+" = "+i*j);
			} //내부 for 문
		} //외부 for문
		System.out.println("-----");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				//printf() : 가변인자를 가진 메소드
				//System.out.printf(String타입의 format,object타입의 args);
				System.out.printf("\t[%d,%d]",i,j);
				//System.out.print("["+i+","+j+"]");
			}//내부 for문
			System.out.println();
		}//외부 for문
		
	}

}
