package com.kodewala.exception;

public class PrintDetails {

	public static void main(String[] args) {
		String name = null;
		String add = null;
		String city = null;
		try {
			System.out.println(" just entered .. try block");
			name = args[0];
			add = args[1];
			city = args[2];
			System.out.println(" just exit .. try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("something went wrong!!");
		}

		System.out.println(" name " + name + " and address is " + add + " city " + city);

	}

}
