package com.kodewala.objects;

public class Driver {

	public static void main(String[] args) {

		Account account = new Account(); // Created an object off account class
		
		account.showAccountDetails(); // accessing method of account class using account object
        
		System.out.println(account.amount);
		
		Account account1 = new Account();
		Account account2 = new Account();
	}

}

class Account 
{
	 int amount;
	public void showAccountDetails() {  // non static 
		System.out.println(" Showing account details");
	}
}