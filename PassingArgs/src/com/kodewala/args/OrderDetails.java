package com.kodewala.args;

import java.util.Scanner;

public class OrderDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creating connection with console.

		System.out.println(" Pls enter the item name : ");
		String itemName = sc.next(); // read the string

		int price;

		while (true) {
			System.out.println(" Pls enter the price : ");

			if (sc.hasNextInt()) { // check if it is int or not
				price = sc.nextInt();
				break;
			} else { // one(invalid)
				System.out.println(" invalid input.. ply try again");
				sc.next(); // consume the unwanted input which is not int.
			}
		}

		System.out.println(" Item Name :" + itemName);
		System.out.println(" price is " + price);

		sc.close(); // close the connection
	}

}
