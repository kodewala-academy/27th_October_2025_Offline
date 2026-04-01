package com.kodewala.list.set;

class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return e.name.equals(this.name);
	}

	@Override
	public int hashCode() {
		return  324324132;//this.name.hashCode();
	}
}
