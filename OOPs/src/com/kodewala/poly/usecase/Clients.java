package com.kodewala.poly.usecase;

public class Clients {

	public static void main(String[] args) {
		
		PaymentProcessor pp = new PaymentProcessor();
		
		CreditCard cc = new CreditCard();
		pp.processPayment(cc);
        
	}

}
