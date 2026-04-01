package com.kodewala.threads2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Task {
	ReentrantLock reentrantLock = new ReentrantLock();

	public void printNumber() throws InterruptedException {
		System.out.println(" this line is not sync....");
		reentrantLock.tryLock(500, TimeUnit.MILLISECONDS); // lock not
		for (int i = 0; i < 10; i++) {
			System.out.println(" Number is " + i + " executed by " + Thread.currentThread().getName());
		}
		reentrantLock.unlock();
	}
}

class Worker extends Thread {
	Task task;

	public Worker(Task task) {

		this.task = task;
	}

	@Override
	public void run() {
		try {
			task.printNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ManualLock {

	public static void main(String[] args) {
		Task task = new Task();

		Worker worker1 = new Worker(task);
		worker1.start();

		Worker worker2 = new Worker(task);
		worker2.start();
	}
}
