package com.kodewala.interfaces.statik;

public interface IBanking {

	public static final int MAX = 100; // constant

	public abstract void doFundTransfer(); // public abstract

	// this method will be used by all the classes...
	public static void printPassbook(String bankName, String logo) {
		// 500 lines of code to print the passbook
		System.out.println(" printing passbook for " + bankName);
		connectToPrinter();
	}

	public static void printCkBook(String bankName, String logo) {
		System.out.println(" printing " + bankName);
		connectToPrinter();
	}

	// java 9 --> we will allow to write private method.

	private static void connectToPrinter() {
		// 100 lines
	}

}
