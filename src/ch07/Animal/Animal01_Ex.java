package ch07.Animal;

import ch07.Animal01;

//실행클래스
//추상메소드의 오버라이딩 메소드를 실행해보기
public class Animal01_Ex {

	public static void main(String[] args) {

//		Animal01 type = new Animal01();	//컴파일 에러
		
		Puppy01 dog = new Puppy01();
		Cat01 cat = new Cat01();
		dog.sound(); //오버라이딩된 메소드 호출
		cat.sound(); //오버라이딩된 메소드 호출
		System.out.println();
		
		//변수의 다형성 구형
//		강아지 is 동물이다.
//		고양이 is 동물이다.
		Animal01 animal = null; //추상클래스 참조변수 선언 및 초기화
		animal = new Puppy01();	//멍멍하고 짖어요
		animal.sound();			//야옹~
		animal = new Cat01();	//멍멍하고 짖어요
		animal.sound();			//야옹~
		
//		함수호출();
//		매개변수의 다형성
		animalSound(new Puppy01());	//오버라이딩된 메소드 호출
		animalSound(new Cat01());	//오버라이딩된 메소드 호출
	}
//	매개변수의 다형성 : 부모(추상)클래스의 매개변수에 
//	자식객체를 대입할 수 있도록 다형성을 적용.
	public static void animalSound(Animal01 animal) {
		animal.sound();
	}
}
