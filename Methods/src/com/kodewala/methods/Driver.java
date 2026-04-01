package com.kodewala.methods;

public class Driver {

	public static void main(String[] args) {

		// 1 . Create an object of Payment class so that we can access/ use members.
		Payment pay = new Payment();
		// 2. calling the method of Payment class on 'pay' reference
		boolean paymentStatus = pay.doPayment("12345", 100);
		System.out.println(" paymentStatus : " + paymentStatus);

		paymentStatus = pay.doPayment("5234534534", 1200);
		System.out.println(" paymentStatus : " + paymentStatus);
		
		paymentStatus = pay.doPayment("567858568568787", 12100);
		System.out.println(" paymentStatus : " + paymentStatus);
	}

}

class Payment {
	public boolean doPayment(String account, int amount) {
		// logic to complete the payment
		System.out.println(" Transferring fund from account " + account);
		return false;
	}
}
