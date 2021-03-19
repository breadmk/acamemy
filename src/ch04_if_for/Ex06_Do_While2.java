package ch04_if_for;

/* if(i==5){
 * 반복문을 종료하고 빠져나와라
 * }
 */
//i 가 5가 되면 빠져 나와라
// 1 2 3 4  do while문 밖
public class Ex06_Do_While2 {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("i="+i);//반복실행코드
			if(i==5) {
				break;
			}
			i++;
		}while(i<11);
		System.out.println("do while문 밖");
	}

}
