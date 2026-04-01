package com.kodewala.objects;

public class Payment {

	int amount; // specific to object
	String accNumber;

	Payment(int _amount) // constructor. helping us in init state of an object.
	{
		this.amount = _amount;
	}

	Payment(int _amount, String _accNumber) {
		this.amount = _amount;
		this.accNumber = _accNumber;
	}

	Payment() { // no args constructor.

	}

	public static void main(String[] args) {

		Payment kapil = new Payment(200);

		Payment nitish = new Payment(1000);
	}

}
