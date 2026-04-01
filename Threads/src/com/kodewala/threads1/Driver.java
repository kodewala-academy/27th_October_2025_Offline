package com.kodewala.threads1;

class PrintNumbers {

	public synchronized void print() { // T1 and T2 are executing this block of code at the same time.
		for (int i = 0; i < 10; i++) {
			System.out.println(" Number is " + i + ". Printed by thread " + Thread.currentThread().getName());
		}
	}

}

class Worker extends Thread {
	PrintNumbers printNumbers;

	Worker(PrintNumbers _printNumbers) {
		this.printNumbers = _printNumbers;
	}

	@Override
	public void run() {
		printNumbers.print(); // calling 
	}

}

public class Driver {

	public static void main(String[] args) {
		PrintNumbers printNumbers1 = new PrintNumbers();// this object's lock
		PrintNumbers printNumbers2 = new PrintNumbers();// this object's lock
	
		Worker t1 = new Worker(printNumbers1);
		t1.setName("T1");
		t1.start();

		Worker t2 = new Worker(printNumbers1);
		t2.setName("T2");
		t2.start();
	}

}
