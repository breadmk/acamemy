package ch06_Object_op;
/* 다른 생성자 호출 : this() 	this
	생성자 오버로딩이 많아 질 경우
	생성자 간의 중복된 코드가 발생할 수 있다.
	매개변수의 수만 달리하고, 필드초기화 내용이 비슷한 생성자에서 
	이런 현상을 많이 볼 수 있다.
	이런 경우에는 필드초기화 내용은 한 생성자에서만 집중적으로 작성하고
	나머지 생성자는 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로
	개선할 수 있다.
      ※주의
         반드시 생성자안에서 작성해야 한다.
         반드시 첫 번 째 문장으로 작성되어야 한다.
*/

public class Car03 {
	
//	Field [접근제어자][속성] 데이터타입 변수명;
	String company = "잘달려자동차";
	String model;	//null
	String color;	//null
	int maxSpeed;	//0
	
//	Constructor [접근제어자]클래스명(매개변수리스트){}
//	default constructor
	Car03(){
		System.out.println("default constructor");
	}
	
//	model 초기화 생성자
	Car03(String kmodel){
//		model = kmodel; //model = "suv";
//		Car03(kmodel,"노랑");	// 컴파일 에러발생. 생성자명을 그대로 쓰면 안된다.
								//	this를 사용해야한다.
		this(kmodel,"노랑");	//생성자에서 또 다른 생성자를 호출 this()
		
	}
//	model,color 초기화 생성자
//				"스포츠카",	"화이트"
	Car03(String kmodel, String kcolor){
//		model = kmodel; 
//		color = kcolor;
		this(kmodel,kcolor, 500);
//		반드시 생성자의 첫 번째 문장에서 호출해야 한다.
	}
//	model,color,maxSpeed 초기화 생성자
//			"스포츠카",	"화이트"			,500
	Car03(String kmodel, String kcolor, int kmaxSpeed){
		model = kmodel; 
		color = kcolor; 
		maxSpeed=kmaxSpeed;
	}
	
	
//	Method [접근제어자][속성] 리턴유형 메소드명(매개변수리스트){}
	

}








