package com.kodewala.objects;

public class Invoice extends Object {

	Invoice() {
		this("iphone"); // calling same class(Invoice) single arg constructor
		
	}

	Invoice(String _name) {
		super();
		System.out.println(_name);
	}

	public static void main(String[] args) {

		Invoice invoice = new Invoice();

	}

}

class Order {

}
