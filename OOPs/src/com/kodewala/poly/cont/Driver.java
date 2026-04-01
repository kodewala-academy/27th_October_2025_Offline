package com.kodewala.poly.cont;

class Bill {

	public Banking generateBill(String name, String gstNo, int amount) {
		System.out.println(" Generating the default bill.... DC");// func 1
		return new Banking();
	}

}

class Invoice extends Bill // invoice IS-A bill

{
	@Override
	public SBI generateBill(String name, String gstNo, int amount) {
		System.out.println(" Generating the invoice with GST...");
		return new SBI();
		

	}
}

public class Driver {
	public static void main(String[] args) {
		Bill bill = new Invoice(); // super class can refer child class object.
		bill.generateBill("Kodewala", "KA32454", 1000); // 
		
	}
}
