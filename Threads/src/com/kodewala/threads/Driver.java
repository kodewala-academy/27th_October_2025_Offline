package com.kodewala.threads;

class PrintNumbers extends Thread {

	@Override
	public void run() // perform the task - TAsk
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(" Printing " + i + " and its executed by " + Thread.currentThread().getName());
		}
	}
	
	
	
}

public class Driver {

	public static void main(String[] args) { //

		System.out.println(" STARTED main() and its executed by " + Thread.currentThread().getName());

		// Created the new thread.
		PrintNumbers t1 = new PrintNumbers();
		t1.setName("PN-T1");
		t1.start(); // Starting the newly created thread...

		// Created the new thread.
		PrintNumbers t2 = new PrintNumbers(); // thread
		t2.setName("PN-T2");
		t2.start(); // Starting the newly created thread...

		System.out.println(" ENDED main() and its executed by " + Thread.currentThread().getName());
	}
}
