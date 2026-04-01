package com.kodewala.interfaces.statik;

public class Driver {

	

	public static void main(String[] args) throws CloneNotSupportedException {
		Product product1 = new Product("apple 17 pro", "PMAX", "HSN-3124");
		
		Product product2 = (Product) product1.clone(); // Xerox
		System.out.println(product2.productName);
		
		System.out.println(product1 == product2);
	}
}
