package com.kodewala.poly;

class NetBanking {

	public void doNetBanking() 
	{
		System.out.println("I am doing core banking..... 1500 lines of code to perform NB"); // funct 1
	}

}

class HDFCNetBanking extends NetBanking {

	@Override // 
	public void doNetBanking() 
	{
		System.out.println("i am doing net banking for hdfc user... 700 lines of code to perform NB"); // funct 2
	}
}

public class Driver {
	public static void main(String[] args) {
     
		HDFCNetBanking nb = new HDFCNetBanking();
		//nb.doNetBanking(); // Compile time --> it will check the doNetBanking(); 
		                   // is available in HDFCNetBanking or not.
		// Runtime --> it will call the method on actual object(HDFCNetBanking())
		
		NetBanking nb0 = new HDFCNetBanking();
		nb0.doNetBanking(); // Compile time --> it will check the doNetBanking(); 
        // is available in NetBanking or not.
		// Runtime --> it will call the method on actual object(HDFCNetBanking())
	}
}
