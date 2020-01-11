package com.tyss.springcore.beans;

public class Pet {
	String name;
	Animal animal;
	
	public Pet() {}
	
	public Pet(String name, Animal animal) {
		this.animal = animal;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
