package com.kodewala.threads.banking;

class Account {
	int balance = 2000;

	public synchronized void doDebit(int _amount) { // T1

		for (int i = 0; i < 10; i++) {

			balance = balance - _amount;
			System.out.println(
					"100 Debit done and  Balance is " + balance + " Thread " + Thread.currentThread().getName());
		}

	}

	public synchronized void doCredit(int _amount) { // T2

		for (int i = 0; i < 5; i++) {
			balance = balance + _amount;
			System.out.println(
					"100 Credit done and  Balance is " + balance + " Thread " + Thread.currentThread().getName());
		}
	}

	public int getBalance() {
		return balance;
	}
}

public class Driver {

	public static void main(String[] args) {

		Account shared = new Account(); // shared
		

		Credit creditThread = new Credit(shared);
		creditThread.setName("CREDIT Thread ");
		creditThread.start();
		
		Debit debitThread = new Debit(shared);
		debitThread.setName("DEBIT Thread ");
		debitThread.start();

		
	}

}
