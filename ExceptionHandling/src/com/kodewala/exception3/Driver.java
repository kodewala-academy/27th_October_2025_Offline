package com.kodewala.exception3;

class InsufficientBalanceException extends RuntimeException { // Un-checked Exception

	public InsufficientBalanceException(String _message) {
		super(_message);
	}

}

public class Driver {

	public static void main(String[] args) {
		Banking banking = new Banking();
		try {
			banking.doFundTransfer(1200);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.out.println(" Please load you account... ");
		}

	}

}
