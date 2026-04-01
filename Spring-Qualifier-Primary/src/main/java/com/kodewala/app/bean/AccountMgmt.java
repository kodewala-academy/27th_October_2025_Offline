package com.kodewala.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AccountMgmt {

	@Autowired
	@Qualifier("acc1")
	Account account;

	@Autowired
	Payment payment;

	public void printDetails() {
		System.out.println(account.getName() + " and " + account.getType());
		payment.print();
	}

}
