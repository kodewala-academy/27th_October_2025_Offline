package com.kodewala.app.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Account {

	private String name;
	private String type;

	// 1. Constructor
	public Account(String name, String type) {
		System.out.println("1. Constructor called");
		this.name = name;
		this.type = type;
	}

	// 2. Setter (optional - only if used)
	public void setName(String name) {
		System.out.println("2. Setter called");
		this.name = name;
	}

	// 3. @PostConstruct - Post bean construction
	@PostConstruct
	public void init() {
		System.out.println("3. @PostConstruct called");
	}

	// 4. Business method
	public void print() {
		System.out.println("4. Bean Ready  " + name + " | " + type);
	}

	// 6. @PreDestroy
	@PreDestroy
	public void preDestroy() {
		System.out.println("6. @PreDestroy called");
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

}