package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.AccountInfo;

@Configuration // This class is responsible for bean defination
public class SpringConfig {

	// define beans

	@Bean("acc1")
	public AccountInfo createAccount0() {
		AccountInfo accountInfo = new AccountInfo("Kodewala", "Academy");
		return accountInfo;
	}

	@Bean("acc2")
	public AccountInfo createAccount1() {
		AccountInfo accountInfo = new AccountInfo("Kodewala1", "Academy1");
		return accountInfo;
	}

}
