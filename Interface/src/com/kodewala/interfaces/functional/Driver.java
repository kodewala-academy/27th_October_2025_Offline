package com.kodewala.interfaces.functional;

@FunctionalInterface // --> Java 8 features
interface IAddNumbers
{
	public abstract int doCalc(int a, int b); // Single Abstract Method / SAM Interface
}

public class Driver {

	
	public static void main(String[] args) {
		
		IAddNumbers addNumbers = (a,b) -> {
			int k =a+b;
			return k;
		};
		
		int result = addNumbers.doCalc(4, 10);
		System.out.println(result);
	}

}
