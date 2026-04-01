package com.kodewala.threads.ipc;

class Tasks {
	// producer
	int data;
	boolean hasData = false;

	public synchronized void producer(int value) throws InterruptedException { // T1(executing --> 10 sec) // T2 --> waiting for lock
		while (hasData) {
			System.out.println(" Producer is waiting!!");
			wait();
		}
		data = value; // produced data
		System.out.println(" Data Produced : " + data);
		hasData = true;
		notify(); // notify consumer
	}

	public synchronized void consumer() throws InterruptedException {
		while (!hasData) {
			System.out.println(" Consumer is waiting!!");
			wait();
		}
		System.out.println(" Consumed data : " + data);
		hasData = false;
		notify(); // notify producer
	}
}

class ProducerThread extends Thread {
	Tasks tasks;

	public ProducerThread(Tasks tasks) {

		this.tasks = tasks;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				tasks.producer(i);
				Thread.sleep(2000);
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}

class ConsumerThread extends Thread {
	Tasks tasks;

	public ConsumerThread(Tasks tasks) {

		this.tasks = tasks;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				tasks.consumer();
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}

public class Driver {

	public static void main(String[] args) {
		// producer and consumer code
		// producer thread and consumer thread
		// starting the threads.
		Tasks task = new Tasks();

		
		ConsumerThread consumerThread = new ConsumerThread(task);
		consumerThread.start();
		
		ProducerThread producerThread = new ProducerThread(task);
		producerThread.start();

	}

}
