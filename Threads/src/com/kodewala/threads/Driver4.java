package com.kodewala.threads;

class Cooking extends Thread {
	public void run() {
		System.out.println(" Cooking the food....");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" cooking done... waiter can start serving food...");
	}
}

public class Driver4 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" Waiting for food to be cooked");

		Cooking t1 = new Cooking();
		t1.start();
		t1.join();// wait till cooking is done
		// current thread(main) will join the t1. main thread will wait at line # 22 and once t1 is completed
		// main will continue 
		System.out.println("Started serving now....");
	}

}
