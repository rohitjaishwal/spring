package com.tyss.springcore.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Hello implements InitializingBean, DisposableBean {
	
	public Hello() {
		System.out.println("Hello Class Constructor....");
	}
	
	private String message;
	private Map<String, Integer> map;

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Coustom Init method");
	}
	
	@PreDestroy
	public void coustomDestroy() {
		System.out.println("Coustom Destroy method");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method");
	}
}
