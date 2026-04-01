package com.kodewala.objects;

public class Banking {

	 Banking(int amount)
	{
		System.out.println("Banking.Banking(int amount)");
	}
	 Banking()
	{
		System.out.println("Banking.Banking()");
	}
	 Banking(String name, int amount)
	{
		System.out.println("Banking.Banking()");
	}
	public static void main(String[] args) {
		
		// Create an object of Banking class

		Banking banking = new Banking("Kodewala",200); // call to Banking constructor which is expecting
		                                    // single args(int)  
	}

}
