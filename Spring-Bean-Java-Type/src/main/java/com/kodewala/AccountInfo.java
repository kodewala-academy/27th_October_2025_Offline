package com.kodewala;

public class AccountInfo {

	private String name;
	private String accountType;

	public AccountInfo(String name, String accountType) {
		super();
		this.name = name;
		this.accountType = accountType;
	}

	public void printDetails() {
		System.out.println(" Name " + name + " and " + accountType);
	}
}
