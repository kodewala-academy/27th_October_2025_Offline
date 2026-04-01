package com.kodewala.threads;

class SharedBuffer {
	private int data;
	private boolean hasData = false;

	public synchronized void produce(int value) throws InterruptedException {
		while (hasData) {
			wait();
		}
		data = value;
		hasData = true;
		System.out.println("Produced: " + value);
		notify();
	}

	public synchronized void consume() throws InterruptedException {
		while (!hasData) {
			wait();
		}
		System.out.println("Consumed: " + data);
		hasData = false;
		notify();
	}
}

class Producer implements Runnable {
	private SharedBuffer buffer;

	public Producer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				buffer.produce(i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable {
	private SharedBuffer buffer;

	public Consumer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				buffer.consume();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ProducerConsumerExample {
	public static void main(String[] args) {
		SharedBuffer buffer = new SharedBuffer();

		Thread producerThread = new Thread(new Producer(buffer));
		Thread consumerThread = new Thread(new Consumer(buffer));

		producerThread.start();
		consumerThread.start();
	}
}
