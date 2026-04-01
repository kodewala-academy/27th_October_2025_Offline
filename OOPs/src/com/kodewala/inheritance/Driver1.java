package com.kodewala.inheritance;

class Employee extends Object {
	// code you are writing in Employee class,
	// using inheritance child classes can re-use it.
	 String location;
	String band; // + Object class functionalities 
	
}

class Manager extends Employee // IS-A
{
	// 
	public void doSomething() {
		System.out.println(location);
		System.out.println(band);
	} // + Employee functionalities + Object functionalities
	
	
}

public class Driver1 {

}
