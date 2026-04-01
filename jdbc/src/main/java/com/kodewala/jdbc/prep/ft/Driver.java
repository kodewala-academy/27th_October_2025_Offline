package com.kodewala.jdbc.prep.ft;

public class Driver {

	public static void main(String[] args) {

		FundTransfer ft = new FundTransfer();
		try {
			ft.doFundTransfer("user1", "user2", 100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
