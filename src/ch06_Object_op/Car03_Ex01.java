package ch06_Object_op;


// car03 클래스로부터 객체를 생성하여 실행하는 클래스.
public class Car03_Ex01 {
	
	 public static void main (String[] args){
		Car03 myCar = new Car03();
		System.out.println(myCar.company);
		System.out.println("--------------------");
		
		Car03 c1 = new Car03("suv");
		System.out.println(c1.model);	//suv
		System.out.println(c1.color);	//노랑
		System.out.println(c1.maxSpeed);	//500
		System.out.println("--------------------");
		Car03 c2 = new Car03("스포츠카","화이트");
		System.out.println(c2.model);	//스포츠카
		System.out.println(c2.color);	//화이트
		System.out.println(c2.maxSpeed);	//
		System.out.println("-----------------------");
		Car03 c3 = new Car03("세단","블랙",350);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println("-------------------------");
	}
}

