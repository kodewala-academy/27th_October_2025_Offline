package com.kodewala.exception;

public class Driver {

	public static void main(String[] args) {
		System.out.println(" START of the Main Method");

		String name = null;
		int length = 0;
		try {
			System.out.println(" before claculating the length");
			length = name.length();
			System.out.println(" after claculating the length and length is " + length);
		} catch (Exception e) {
			 e.printStackTrace();
		}

		System.out.println(" END of the Main Method");
	}
}
