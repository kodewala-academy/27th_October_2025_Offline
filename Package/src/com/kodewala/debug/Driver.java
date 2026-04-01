package com.kodewala.debug;

public class Driver {

	public static void main() {
		System.out.println("Driver.main()..... without args");
	}

	public static void main(String[] args) {
		System.out.println(" Welcome to order mgmt...");
		// Some logic
		Order.placeOrder(); // 2000 lines
		// some more logic

		Order.viewOrder();
		// more code...
		Order.cancelOrder();
	}
}

class Order {
	public static void placeOrder() {
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
		System.out.println("Order.placeOrder()");
	}

	public static void viewOrder() {
		System.out.println("Order.viewOrder()");
	}

	public static void cancelOrder() {
		System.out.println("Order.cancelOrder()");
	}
}
