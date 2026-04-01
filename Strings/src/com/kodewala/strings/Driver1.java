package com.kodewala.strings;

class Person {
	String name;

	public Person(String _name) {
		this.name = _name;
	}

	// change or override the equals method.

	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return p.name.equals(this.name);
	}
}

public class Driver1 {

	public static void main(String[] args) {
		Person p1 = new Person("sanjay");
		Person p2 = new Person("vijay");

	//	System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2));// this == obj) // false --> true
	}

}
