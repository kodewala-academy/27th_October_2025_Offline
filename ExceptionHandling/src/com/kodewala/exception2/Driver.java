package com.kodewala.exception2;

import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.doSomething();
	}

	public void doNothing() throws FileAlreadyExistsException {

		try {
			String name = null;
			int length = name.length();
		} catch (NullPointerException e) {

			e.printStackTrace();
			throw new FileAlreadyExistsException("Internal error!!!"); // used to throw new exception.
		}
	}

	public void doSomething() {
		System.out.println("Driver.doSomething()");
		try {
			doNothing();
		} catch (NullPointerException | FileAlreadyExistsException e) { // java 8 

			e.printStackTrace();
		}
	}

}
