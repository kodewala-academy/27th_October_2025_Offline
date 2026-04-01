package com.kodewala.threads3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExp {

	public static void main(String[] args) {

		ExecutorService exeService = Executors.newFixedThreadPool(5);

		long start = System.currentTimeMillis();
		CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(" Executed by " + Thread.currentThread().getName());
			// biz logic ...+ in the end you return some result
			sleep(1500); //
			return 20;
		}, exeService);

		CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> {
			// biz logic ...+ in the end you return some result
			System.out.println(" Executed by " + Thread.currentThread().getName());
			sleep(1000); //
			return 40;
		});

		CompletableFuture<Integer> combinedTasks = task1.thenCombineAsync(task2, (a, b) -> {
			return a + b;
		});

		CompletableFuture<Integer> appliedTask = task1.thenApplyAsync(a -> {

			return a * 4;
		});

		System.out.println("Result is ::: " + combinedTasks.join());
		System.out.println(" appliedTask " + appliedTask.join());
		long end = System.currentTimeMillis();
		System.out.println(" total time taken " + (end - start));
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
