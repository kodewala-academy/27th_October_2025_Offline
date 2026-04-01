package com.kodewala.marker;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc1 = new Account(100, "santanu");
		Account acc2 = (Account) acc1.clone(); // copy the acc1 and assign to acc2 (Xerox)

		System.out.println(acc2.amount + " and " + acc2.name);
	}

}
