package com.kodewala.threads;

class MyThread1 implements Runnable {

	@Override
	public void run() { // Task
		System.out.println(" Inside run...");
		try {
			System.out.println(" Thread is going to sleep..");
			Thread.sleep(10000); // TIME WAITING
			System.out.println(" Sleep time over.... ");
		} catch (InterruptedException e) {

			System.out.println(" thread intrrupted");
		}
		System.out.println(" Completed....");
	}
}

public class Driver3 {

	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();

		Thread t1 = new Thread(myThread);
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t1.interrupt(); // main thread is interrupting thread t1

	}

}
