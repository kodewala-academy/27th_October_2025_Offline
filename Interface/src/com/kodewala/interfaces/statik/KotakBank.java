package com.kodewala.interfaces.statik;

public class KotakBank implements IBanking {

	@Override
	public void doFundTransfer() {

		System.out.println("KotakBank.doFundTransfer()");
	}
	
	void printPassBook()
	{
		IBanking.printPassbook("Kotak", "logo");
	}
}
