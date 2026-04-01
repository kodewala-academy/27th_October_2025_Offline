package com.kodewala.objects;

public class NetBanking {

	int amount;
	String accNo;
	String ifsc;

	
	
	public NetBanking() // compiler will provide default constructor(NO-ARGS)
	{
		System.out.println(" NetBanking() ..... Calling constructor");
	}

	public NetBanking(int _amount, String _accNo, String _ifsc) {
		this.amount = _amount;
		this.accNo = _accNo;
		this.ifsc = _ifsc;
	}

	public static void main(String[] args) {

		NetBanking netBanking = new NetBanking();
		
		NetBanking nb1 = new NetBanking(100,"1234554321","SBIN001");
		NetBanking nb2 = new NetBanking(1020,"12223421432","SBIN033");
	}

}
