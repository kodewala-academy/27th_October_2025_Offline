package com.kodewala.poly.override;

class Employee extends Object
{
	private String firstName;
	private String lastName;

	public Employee(String _firstName, String _lastName) {
		this.firstName = _firstName;
		this.lastName = _lastName;
	}

	@Override
	public boolean equals(Object obj)
	{
		Employee e2 = (Employee) obj;
		return this.firstName.equals(e2.firstName) && this.lastName.equals(e2.lastName);
	}
}

public class Driver
{

	public static void main(String[] args)
	{

		Employee e1 = new Employee("Kodewala", "Academy"); // add 1
		Employee e2 = new Employee("Kodewala", "Academy"); // add 2

		System.out.println(e1.equals(e2)); // false

	}

}
