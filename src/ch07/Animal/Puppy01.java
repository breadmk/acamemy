package ch07.Animal;

import ch07.Animal01;

public class Puppy01 extends Animal01 {
	
//	추상클래스에서 미구현된 추상메소드를
//	실체에서는 반드시 오버라이딩하여 구현해야 한다.
	
	public Puppy01() {
		this.type="강-포유류";
	}
	
	@Override
	public void move() {
		System.out.println("4발로 뛰어다닌다.");
	}
	

	@Override
	public void sound() {
		System.out.println("멍멍하고 짖어요");
	}
	
}
