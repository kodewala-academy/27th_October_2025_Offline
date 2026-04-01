package com.kodewala.interfaces;

public interface ICustomer { // Java 7 or before --> 100% contract based 

	public abstract void addCustomer(String name); // Abstract method. Just say "WHAT TO DO"

	public abstract void updateCustomer(String name);

	public abstract	void deleteCustomer(String name);
	
	void suspendCustomer(String name); // adding new feature  . All the methods are public and abstract by default.
	
	public static final int MAX = 1000; // Constant.
}
