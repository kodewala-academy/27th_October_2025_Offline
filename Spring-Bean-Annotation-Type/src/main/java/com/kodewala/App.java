package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Payment;
import com.kodewala.config.SpringConfig;

public class App {

	public static void main(String[] args) {

		// creating IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		// Requesting / getting bean
		Payment payment = context.getBean(Payment.class);
		payment.printInfo();
	}

}
