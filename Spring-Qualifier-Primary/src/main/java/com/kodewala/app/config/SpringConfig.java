package com.kodewala.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.kodewala.app.bean.Account;
import com.kodewala.app.bean.Payment;

@Configuration
@ComponentScan(basePackages = "com.kodewala.app")
public class SpringConfig {

	@Bean("acc1")
	public Account createAccount1() {
		return new Account("Kodewala1", "Current Account1");
	}

	@Lazy
	@Bean("acc2")
	public Account createAccount2() {
		return new Account("Kodewala2", "Current Account2");
	}

	@Bean("pay")
	public Payment createPayment() {
		return new Payment();
	}
}
