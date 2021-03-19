package ch04_if_for;
//break (p.175)
//자신이 포함된 하나의 반복문 또는 switch 문을 빠져 나간다.
//주로 if문과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게 한다.
public class Ex07_break2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum<110) {
			while(true) {
				if(sum>100) {
				break; //break속한 해당 반복문 종료 ---- 반복문 !! 종료.
				}
				i++;
				sum += i; // sum = sum+i;
				System.out.println("i값이 "+i+" 일때의 sum="+sum);
			}	//true의 while 문을 break로 빠져나옴.
			System.out.println("내부 while문 밖");
			System.out.println("i="+i);
			System.out.println("누적총합 sum="+sum);
			sum++;
		}
		System.out.println("외부 while문 밖");
	}
}
