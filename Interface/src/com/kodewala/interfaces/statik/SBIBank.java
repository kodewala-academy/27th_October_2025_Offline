package com.kodewala.interfaces.statik;

public class SBIBank implements IBanking {

	@Override
	public void doFundTransfer() {

		System.out.println("SBIBank.doFundTransfer()");
	}
	
	void printPassBook()
	{
		IBanking.printPassbook("SBI", "logo");
	}
}
