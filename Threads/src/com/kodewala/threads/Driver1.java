package com.kodewala.threads;

class MyThread implements Runnable {
	@Override
	public void run() { // Task
		System.out.println(" Inside run");
	}
}

public class Driver1 {



	public static void main(String[] args) {

		System.out.println(" START main()");

		MyThread myThread = new MyThread();
		
		Thread t1 = new Thread(myThread); // Creating New thread. State = "NEW"
		t1.start(); // Starting the thread. Status : RUNNABLE --> once thread(t1) gets cup cycle,
		            // it will be moved to RUNNING state.--> (WAITING / BLOCKED) --> RUNNABLE --> got CPU time
		            // --> RUNNING -->once run method completed --> TERMINATED(DEAD)
		
		t1.start(); // 
		System.out.println(" END main()");
	}

}
