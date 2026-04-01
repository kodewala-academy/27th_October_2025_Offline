package com.kodewala.exception3;

public class Banking {

	int blanace = 1000;

	public void doFundTransfer(int _amount) throws InsufficientBalanceException {
		if (blanace > _amount) {
			System.out.println("Banking.doFundTransfer()... allow to transfer");
		} else {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}

}
