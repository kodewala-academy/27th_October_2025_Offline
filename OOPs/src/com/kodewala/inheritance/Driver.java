package com.kodewala.inheritance;

class Banking {
	public int balance = 100;
	String ifscCode = "IN001";
	private String branchCode = "CD001";

	public void doFundTransfer() {
		System.out.println("Banking.doFundTransfer()// 500 lines"); // 2 month to dev and move to prod.
	}
}

class HDFCBank extends Banking {
	// no dec here..
	public void hdfcFundTransfer() {

		System.out.println(balance); // accessing the parent class attributes...
		System.out.println(ifscCode);
		//System.out.println(branchCode);
		doFundTransfer(); // this is coming from super class
	}
}

public class Driver {

	public static void main(String[] args) {
		HDFCBank bank = new HDFCBank();
		bank.hdfcFundTransfer();
	}

}
