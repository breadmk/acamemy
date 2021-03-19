package ch08;

/*
 * ClassCastException
 * : 타입변환(Casting)은 (상위)클래스와 (하위)클래스간에 발생 
 * 					  (구현)클래스와 인터페이스 간에도 발생한다.
 * 	억지로 타입변환을 시도할 경우 ClassCasetingException 이 발생한다.
 */					   
public class ClassCastException01 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat(); //런타임에러
		changeDog(cat);
//		발생이유: Cat 객체를 매개값으로 changeDog()의 매개값으로 주었기 때문에  
//				=> Dod타입으로 변환할 수 없다.
		
	}//main 
	
	public static void changeDog(Animal animal) {	//Animal animal = cat;
//		매개변수의 타입을 강제로 Dog로 변환하여 해당클래스타입의 dog변수에 저장.
		
//		해결방법:잘못된 매개값이 들어올 수 있기 때문에 타입을 먼저 체크하자.
		if(animal instanceof Dog) {
		Dog dog = (Dog)animal;	//(Dog)cat;
		}
	}
}

class Animal{}

class Dog extends Animal{
	
}
class Cat extends Animal{
	
}


















