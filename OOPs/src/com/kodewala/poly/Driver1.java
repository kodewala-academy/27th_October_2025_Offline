package com.kodewala.poly;

class Banking 
{
	int amount =100;
	public void fundTransfer(String accNo)
	{
		System.out.println("Banking.fundTransfer().....");
	}
}

class HDFC extends Banking
{
	// 1. Use methods  of super/ parent class as is
	// 2. change the functionality of parent class... - Overriding 
	

	public void fundTransfer(String accNo)
	{
		
		System.out.println("HDFC.fundTransfer()................."+amount);
	}
}

class SBI extends Banking
{
	
	public void fundTransfer(String accNo)
	{
		
		System.out.println("SBI.fundTransfer()...........................");
	}
	
	public void soSomething()
	{
		System.out.println("SBI.soSomething()");
	}
}

public class Driver1 {
	
	public static void main(String[] args) 
	{
		String amount = "hello";
		Banking b = new Banking();
		//b.fundTransfer("1234554321");
		// Compile Time : fundTransfer( method should be available in Banking)
		// Run Time : call the method of banking class 
		
		Banking b1  = new HDFC(); // parent type can refer child object.
		//b1.fundTransfer("3452345345");
		// Compile Time : fundTransfer( method should be available in Banking)
		// Run Time : call the method of HDFC class
		
		
		Banking b2 = new SBI();
		
		b2.fundTransfer("dsfsdagdgtw4t532"); // 
		
		
	}

}
