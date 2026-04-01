package com.kodewala.executor.fw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {
	int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	public String call() throws InterruptedException {
		String name = "Kodewala Academy";
		name = name.toUpperCase();
		System.out.println("Task.run() and task id is " + taskId + " " + Thread.currentThread().getName());
		
		return name;
	}
}

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(50);

		for (int i = 0; i < 100; i++) { // 3 threads will be completing 10 tasks
			Future<String> future = service.submit(new Task(i));
			System.out.println("response(return) from call method() " + future.get()); // Blocking 
		}
		service.shutdown();
	}

}
