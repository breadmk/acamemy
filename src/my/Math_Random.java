package my;

public class Math_Random {
	public static void main(String[] args) {
		
		
//		11~20
		for(int i=0; i<20; i++) {
		System.out.print((int)(Math.random()*10)+10+" ");
		}
		System.out.println();
//		1~45
		for(int i=0; i<20; i++) {
			System.out.print((int)(Math.random()*45)+1+" ");
			}
		System.out.println();
//		13~21
		for(int i=0; i<20; i++) {
			System.out.print((int)(Math.random()*9)+13+" ");
			}
	}
}
