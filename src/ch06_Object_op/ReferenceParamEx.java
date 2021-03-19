package ch06_Object_op;

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data1 d = new Data1();	//d는 heap영역에 생성된 객체의 주소가 저장된 참조변수
		System.out.println("참조변수 d = " +d);
		d.x=10;	//참조변수안에 저장된 주소를 참조(Reference)하여 해당 클래스의 필드, 메소드를 접근할 수 있다.
		System.out.println("d.x = " + d.x);
		
		change(d);//함수호출
		System.out.println("change()함수 호출후의 d.x = " + d.x);
	}
//	주소가 넘어왔다
	static void change(Data1 d) {	//change(참조타입 참조매개변수) {//d=ch06_Object_op.Data1@15db9742}
		System.out.println("change(Data1 d)" + d);
		d.x = 1000;
		System.out.println("change()함수 호출 성공 x = " + d.x);
	}

}

class Data1 {
	int x;	// 인스턴스변수
}