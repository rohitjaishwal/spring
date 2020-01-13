package com.tyss.springcore.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.beans.BeanFactoryPostProcessorClass;
import com.tyss.springcore.beans.BeanPostProcessorClass;
import com.tyss.springcore.beans.Cat;
import com.tyss.springcore.beans.Dog;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

@Configuration
public class BeanConfig {
	@Bean(name = "hello", initMethod = "init", destroyMethod = "coustomDestroy")
//	@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMessage("This Configuration is via Annotation");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Three", 3);
		map.put("Four", 4);
		hello.setMap(map);
		return hello;
	}
	
	@Bean("dog" )
	@Primary
//	@Scope("prototype")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean("cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean("pet")
	@Scope("prototype")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Abby");
		pet.setAnimal(getDog());
		return pet;
	}
	
	@Bean("beanFactoryPostProcessor")
	public BeanFactoryPostProcessor getBeanFactoryPostProcessor() {
		return new BeanFactoryPostProcessorClass();
	}
	
	@Bean("beanPostProcessor")
	public BeanPostProcessor getBeanPostProcessor() {
		return new BeanPostProcessorClass();
	}
}
