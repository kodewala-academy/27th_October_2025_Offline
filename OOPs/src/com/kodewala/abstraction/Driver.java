package com.kodewala.abstraction;

abstract class Banking1 extends Object

{
	public abstract void doFundTransfer(); // What ?
	public Banking1() {
		
	}
}

class FundTransfer extends Banking1 { // Banking1 b1 = new FundTransfer();  
	@Override
	public void doFundTransfer() {
		// 1. validate the account
		validateAccount();
		// 2. check balance
		checkBalance();
		// 3. check limit
		checkLimit();
		
		// 6 check Daily txn
		checkDailyTxns();
		// 4. update blanace
		updateBalance();
		// 5. send notification / sms , email etc.
		sendNotification();
	}
    // core method / functionalities (Hidden )
	public void validateAccount() {
		System.out.println("FundTransfer.validateAccount()...");
	}

	private void checkBalance() {
		System.out.println("FundTransfer.checkBalance()....");
	}

	private void checkLimit() {
		System.out.println("FundTransfer.checkLimit()...");
	}

	private void updateBalance() {
		System.out.println("FundTransfer.updateBalance()....");
	}

	private void sendNotification() {
		System.out.println("FundTransfer.sendNotification().....");
	}
	
	public void checkDailyTxns()
	{
		System.out.println("FundTransfer.checkDailyTxns()....");
	}
}

public class Driver {

	public static void main(String[] args) {

	}

}
