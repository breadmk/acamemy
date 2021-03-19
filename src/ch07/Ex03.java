package ch07;

// 상송
// 조상클래스의 생성자가 자동으로 호출된다.
// super() : 부모클래스의 생성자를 호출. 
//	         ※주의.반드시 생성자안에서  첫 번째 문장에 작성해야한다.

//참고 this() : (자신의) 또 다른 생성자를 호출.
public class Ex03 {
	public static void main(String[] args) {
		Son03 s = new Son03(123);
		
	}

}

class GrandFather03 extends Object {
	GrandFather03(){
		System.out.println("GrandFather03의 기본생성자");
	}
}

class Father03 extends GrandFather03{
	Father03(){
		System.out.println("Father03의 기본생성자");
	}
	Father03(int a){
		System.out.println("Father03의 int 1개 생성자");
	}
	Father03(double a){
		System.out.println("Father03의 double 1개 생성자");
	}
}

class Son03 extends Father03 {
		Son03(){
//			super();	//묵시적을 명시적으로 소환한거 뿐 현재는 아무런 의미 없음.
			super(1);
			System.out.println("Son03의 기본생성자");
//			super(); 컴파일 에러  생성자안에서 가장 첫 줄에 명시해야한다.
			
		}
		Son03(int x){
			super(x);	//데이터타입을 따라서 출력이 됨. int
			System.out.println("Son03(int x)생성자");
		}
}






