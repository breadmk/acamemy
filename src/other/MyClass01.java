package other;
/* 접근 제어자(access modifier) - 교재
- 멤버 또는 클래스에 사용되어, 외부로부터의 접근을 제한한다.

- public		-	누구나 접근가능.
- protected	-	동일 클래스 + 동일패키지 + (다른패키지이더라도)상속받은 하위클래스 접근 가능.
- default		-	동일 클래스 + 동일 패키지 접근 가능. (상속받은 하위클래스 접근 불가.)
- private		-	동일 클래스에서만 접근 가능.
*/

public class MyClass01 {
//	Field	[접근제어자][속성]데이터타입 변수명 [=초기값];
	public    int pub = 10;
	protected int pro = 20;
			  int pack = 30;//[default] 
	private   int pri = 40;
	
//	Constructor	[접근제어자]클래스명([매개변수리스트]){}
		
//	Method	[접근제어자][속성] 리턴유형 함수명([매개변수리스트]){}
	
	void test() {
		// 아래 4개의 접근제어자는 동일 클래스내에서 접근 허용가능.
		pub = 100;
		pro = 200;
		pack = 300;
		pri = 400;
//	 메소드 접근 허용 여부 체크해보자
		pubMethod();
		proMethod();
		packMethod();
		priMethod();
	}
	public void pubMethod() {
		System.out.println("MyClass01의 pubMethod()이다.");
	}
	protected void proMethod() {
		System.out.println("MyClass01의 proMethod()이다.");
	}
	void packMethod() {
		System.out.println("MyClass01의 packMethod()이다.");
	}
	private void priMethod() {
		System.out.println("MyClass01의 priMethod()이다.");
	}
	
}
