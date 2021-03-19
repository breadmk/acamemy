package ch07.Animal;

import ch07.Animal01;

public class Cat01 extends Animal01 {
	
	public Cat01() {
		this.type="고-포유류";
	}
	@Override
	public void move() {
			System.out.println("네 발로 점프해요");
	}

	@Override
	public void sound() {
		System.out.println("야옹~");
	}

		
}
