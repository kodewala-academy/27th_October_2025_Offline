package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.account.Account;

public class Application {

	public static void main(String[] args) {

		String config = "applicationContext.xml";

		// Create IOC container(BeanFactory / ApplicationContext)

		ApplicationContext context = new ClassPathXmlApplicationContext(config);

		// Requesting / getting bean from container.
		Account account = (Account) context.getBean("acc1");

		// Using the account bean
		System.out.println(account.getFirstName() + " and " + account.getLastName());
		
		 account = (Account) context.getBean("acc2");

		// Using the account bean
		System.out.println(account.getFirstName() + " and " + account.getLastName());

	}

}
