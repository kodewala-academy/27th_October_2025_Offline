package com.kodewala.gc;

class Netbanking {

	private String accountNo;
	private int amount;
	private String name;

	Netbanking(String _acc, int _amount, String _name) {
		this.accountNo = _acc;
		this.amount = _amount;
		this.name = _name;
	}

	public void doFundTransfer() {
		System.out.println(" Doing FT.....");
	}
}

public class Driver {
	
	Netbanking obj1;

	public  void main(String[] args) {

		 obj1 = new Netbanking("124554321", 1000, "Shantanu"); // 100 kb

		obj1.doFundTransfer();

		obj1 = null; // GC can come and remove this object from memory....
		
		System.gc();// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		
		Netbanking obj2 = new Netbanking("45234534", 10020, "nitish");

		obj2.doFundTransfer();
		
		Driver driver = new Driver();
		driver.m1();
	}
	
    static void m1()
    {
    	m2();
    }
    
   static void m2()
    {
    	m1();
    }
}
