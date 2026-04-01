package com.kodewala.threads.banking;

public class Debit extends Thread {
	Account account;

	public Debit(Account _account) {

		this.account = _account;
	}

	@Override
	public void run() {

		account.doDebit(100);

	}

}
