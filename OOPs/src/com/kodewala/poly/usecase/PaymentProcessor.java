package com.kodewala.poly.usecase;

public class PaymentProcessor {

	public void processPayment(CoreBanking coreBanking)
	{
		coreBanking.doFundTransfer(); // SOLID 
	}
}