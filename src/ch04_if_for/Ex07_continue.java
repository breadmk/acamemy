package ch04_if_for;
//p.176 ppt.22
//자신이 포함된 반복문의 끝으로 이동한다.(다음 반복으로 넘어간다.)
//continue문 이후 문장들은 계속 수행한다.
public class Ex07_continue {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			
			if(i==5) {
				//System.out.println("i==5일 때-continue");
				continue; //지금 진행하던것은 멈추고 다음 반복문을 진행해라.
			}
			System.out.println("i="+i);
			}
		System.out.println("for문 밖");
		
		System.out.println("--------------------");
		//0 1 2 3 4 5 for문 밖
		for(int i=0; i<=10; i++) {
			
			if(i==5) {
				System.out.println("i==5일 때-break");
				break;
			}
			System.out.println("i="+i);
		}
		System.out.println("for문 밖");
	}

}
