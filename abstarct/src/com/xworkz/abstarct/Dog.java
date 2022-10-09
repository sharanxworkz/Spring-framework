package com.xworkz.abstarct;

public class Dog extends Animal {
	
	public Dog() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public void play() {
		System.out.println("dog likes to play");
		
	}

}
