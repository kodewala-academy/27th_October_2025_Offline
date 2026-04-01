package com.kodewala.list.set;

import java.util.HashSet;

class Person {

	private String name;

	public Person(String name) {

		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		Person p2 = (Person) obj;
		return this.name.equals(p2.name); // true or false
	}

	public int hashCode() {
		return this.name.hashCode();
	}

}

public class HashSetExp {

	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<Person>();
		Person p1 = new Person("kapil");
		Person p2 = new Person("kapil");
		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		set.add(p1);
		set.add(p2);
		System.out.println(set.contains(p2));

	}

}
