package com.kodewala.app;

public class Testing {

	int amount;

	{
		System.out.println(" pre init");
	}

	Testing(int _amount) {
		System.out.println(" init");
		this.amount = _amount;
	}

	public static void main(String[] args) {

		Testing testing = new Testing(200);

		// Using Object
		testing.sayHello();

		// Destroying(GC)
		testing = null;
	}

	public void sayHello() {
		System.out.println("Testing.sayHello()");
	}

}
