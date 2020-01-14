package com.tyss.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.BeanConfig;

public class AnnotationApp {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(BeanConfig.class);
		 */		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Hello hello = context.getBean(Hello.class);
		Hello hello1 = context.getBean(Hello.class);
		System.out.println();
		
		System.out.println(hello);
		System.out.println(hello1);
		System.out.println();
		
		System.out.println(hello == hello1);
		System.out.println();
		
		System.out.println(hello.getMessage());
		System.out.println();
		
		System.out.println(hello.getMap());
		System.out.println();
		
		Animal animal = context.getBean(Animal.class);
		animal.eatFood();
		animal.makeSound();
		System.out.println();
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getAnimal());
		System.out.println(pet.getName());
		System.out.println();
		
		/*
		 * Pet pet1 = context.getBean(Pet.class); System.out.println(pet1.getAnimal());
		 * System.out.println(pet1.getName()); System.out.println();
		 * 
		 * System.out.println(pet == pet1); System.out.println(pet.getAnimal() ==
		 * pet1.getAnimal());
		 */
		context.close();
		
	}
}
