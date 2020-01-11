package com.tyss.springcore.beans;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Meaooo..");
	}

	@Override
	public void eatFood() {
		System.out.println("Eating Fish....");
	}

}
