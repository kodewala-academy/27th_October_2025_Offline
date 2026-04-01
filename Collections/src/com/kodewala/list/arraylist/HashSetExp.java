package com.kodewala.list.arraylist;

import java.util.HashSet;

public class HashSetExp {

	public static void main(String[] args) {

		HashSet<String> cities = new HashSet<String>(); // default 16
		cities.add("Jaipur");
		cities.add("Bangalore");
		cities.add("Jaipur");
		cities.add("Ahmedabad");
		cities.add("Hyd");
		cities.add("Hyd");
		cities.add("Chennai");

		System.out.println(cities);

		System.out.println("Bangalore".hashCode());

		String a = "Hyderabad";
		String b = "Bangalore";

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		int capacity = 16;

		System.out.println(16 & (capacity - 1));
		System.out.println(48 & (capacity - 1));
	}

}
