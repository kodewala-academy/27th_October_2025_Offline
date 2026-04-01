package com.kodewala.threads.banking.new1;

class Task {
	public static void doTask() throws InterruptedException { // W1 and W2 --> wait for lock

		for (int i = 0; i < 5; i++) {

			System.out.println(" Doing task!!! " + Thread.currentThread().getName());

			Task.class.wait(2000);

			System.out.println("updating some variables.........." + Thread.currentThread().getName());
		}
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
			task.doTask();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // thread is getting lock of Task Class
	}
}

public class Driver {
	public static void main(String[] args) {
		Task task = new Task();
		Worker worker1 = new Worker(task);
		worker1.setName("Worker-1");
		worker1.start();
	}
}
