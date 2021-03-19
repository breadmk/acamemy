package ch06_Object_op;

//기본형 매개변수와 참조형 매개변수(교재.263)
//p.264 예제

public class PrimitiveParamEx {

	public static void main(String[] args) {
//		객체생성	// d 에는 heap 영역에 생성된 객체의 주소가 저장.
		Data d = new Data();
		System.out.println("d.x = "+d.x); //d.x = 0
		
		d.x=10;
		System.out.println("변경후 d.x = " + d.x);
		

//		함수호출
		 change(d.x);	//static 함수는 static 함수를 호출할 수 있다.
//		Cannot make a static reference to the non-static method change(int) from the type PrimitiveParamEx
		System.out.println("change()호출성공 후 매개변수d.x="+d.x);	//1000
	}
						//d.x 들어왔는데 무시해버림;
	static void change(int x){	//x=d.x
		x=1000;
		System.out.println("change()호출성공 매개변수x="+x);		//1000
		
	}

}

class Data {
	int x; 	// x=0;으로 자동초기화. //인스턴스 변수
}











