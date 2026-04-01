package com.kodewala.list.set;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>(64);

		Employee e1 = new Employee("anish1");
		Employee e2 = new Employee("anish2");
		Employee e3 = new Employee("anish3");
		Employee e4 = new Employee("anish4");
		Employee e5 = new Employee("anish5");
		Employee e6 = new Employee("anish6");
		Employee e7 = new Employee("anish7");
		Employee e8 = new Employee("anish8");
		Employee e9 = new Employee("anish9");
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		set.add(e9);
		System.out.println(set);
	}
}
