package com.tyss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;

public class App {
	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("springcore.xml");
		 */

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");

		Hello hello = context.getBean(Hello.class);
		Hello hello2 = context.getBean(Hello.class);
		Animal animal = context.getBean(Animal.class);
		System.out.println();
		System.out.println(hello == hello2);
		System.out.println(hello.toString());
		System.out.println(hello.getMessage());
		System.out.println();
		animal.eatFood();
		animal.makeSound();
		context.close();
	}
}
