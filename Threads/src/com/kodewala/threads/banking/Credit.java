package com.kodewala.threads.banking;

public class Credit extends Thread {
	Account account;

	public Credit(Account _account) {

		this.account = _account;
	}

	@Override
	public void run() {

		account.doCredit(100);

	}

}
