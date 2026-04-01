package com.kodewala.strings;

public class StringExp {

	public static void main(String[] args) {

		String s1 = "Academy";

		String s2 = new String("Academy"); // GC

		System.out.println(s1 == s2); // false

		s2 = s2.intern(); // interning. copy the object from heap to scp.
							//
		System.out.println(s1 == s2); // true
	}
}
