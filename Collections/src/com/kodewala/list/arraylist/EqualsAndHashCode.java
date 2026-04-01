package com.kodewala.list.arraylist;

import java.util.HashSet;

class Product extends Object {

	String searchString;

	public Product(String searchString) {
		this.searchString = searchString;
	}

	@Override
	public boolean equals(Object obj) {
		Product product2 = (Product) obj;
		return this.searchString.equals(product2.searchString);
	}

	@Override
	public int hashCode() {
		return this.searchString.hashCode();
	}
}

public class EqualsAndHashCode {

	public static void main(String[] args) {
		Product product1 = new Product("apple");
		Product product2 = new Product("apple");

		System.out.println(product1.equals(product2)); // false --> two diff object

		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());

		HashSet<Product> products = new HashSet<Product>();
		products.add(product1);
		products.add(product2);

		System.out.println(" cities " + products);

	}

}
