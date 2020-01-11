package com.tyss.springcore.beans;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Bow-Wow...");
		
	}

	@Override
	public void eatFood() {
		System.out.println("Eating Chicken....");
	}

}
