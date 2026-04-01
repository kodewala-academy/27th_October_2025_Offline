package com.kodewala.exception1;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Driver.main() START");
		int amount = 100;
		int input = 10;
		String name = null;
		try {
			System.out.println(" Inside try - 1 ");

			int result = amount / input; // --> risky code
			name.length();
			System.out.println(" Inside try - 2 ");

		} catch (NullPointerException e) {
			System.out.println(" Name is " + input);
		} catch (Exception e) {
			System.out.println(" input is invalid..." + input);
		}

		System.out.println("Driver.main() END");
	}
}
