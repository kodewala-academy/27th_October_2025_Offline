package com.kodewala.banking;

import java.io.Serializable;

public class Account implements Serializable {
	int amount;
	String name;
	String bankCode;

	public Account(int amount, String name, String bankCode) {
		super();
		this.amount = amount;
		this.name = name;
		this.bankCode = bankCode;
	}

}
