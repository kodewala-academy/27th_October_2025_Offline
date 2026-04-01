package com.kodewala.array;

public class ArrayExp {

	int balance;

	public static void main(String[] args) {

		int productArray[] = new int[5]; // Creating an array of size 5 (index : 0 to 4)

		// add an element to array.

		productArray[0] = -1001;
		productArray[1] = 1002;
		productArray[2] = -1003;
		productArray[3] = 1004;
		productArray[4] = 1005; // IndexOutOfBoundException

	//	System.out.println(productArray[4]); //
		// System.out.println(productArray[5]); // // IndexOutOfBoundException

		// iterate / loop your array.

		for (int index = 0; index < productArray.length; index++) {
			// read the elements by index...
			int prodId = productArray[index];
			if (prodId < 0) {
				System.out.println(" Invalid product id " + prodId);
			}
		}

	}

}
