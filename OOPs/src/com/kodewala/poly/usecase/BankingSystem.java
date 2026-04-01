package com.kodewala.poly.usecase;

class CoreBanking {
	public void doFundTransfer() {
		System.out.println("CoreBanking.doFindTransfer()... Core Banking");
	}
}

class UPI extends CoreBanking {
	@Override
	public void doFundTransfer() {
		System.out.println("UPI.doFundTransfer() .... UPI Payment");
	}
	
	public void test()
	{
		System.out.println("UPI.test()");
	}

}

class CreditCard extends CoreBanking {
	@Override
	public void doFundTransfer() {
		System.out.println("CreditCard.doFundTransfer().... CC payment");
	}
}

class WireTransfer extends CoreBanking {
	@Override
	public void doFundTransfer() {
		System.out.println("WireTransfer.doFundTransfer().... Wire payment");
	}
}


