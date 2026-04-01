package com.kodewala.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kodewala.app.bean.AccountMgmt;
import com.kodewala.app.config.SpringConfig;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		AccountMgmt accountMgmt = context.getBean(AccountMgmt.class);

		accountMgmt = context.getBean(AccountMgmt.class);
		accountMgmt.printDetails();
		
		context.close(); // close the ioc container
	}

}
