package com.kodewala.marker;

public class Account implements Cloneable {

	int amount;
	String name;

	public Account(int amount, String name) {

		this.amount = amount;
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
