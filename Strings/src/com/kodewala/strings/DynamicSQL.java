package com.kodewala.strings;

class QueryGen

{
	public StringBuilder generateQuery(int empId) {
		StringBuilder query = new StringBuilder("select * from employee_details  ");

		if (empId > 0) {
			query.append(" where empId " + empId); // modifying the string 
		} else {
			query.append(";"); // modifying the string 
		}
		return query;
	}
}

public class DynamicSQL {

	public static void main(String[] args) {
		QueryGen gen = new QueryGen();
		StringBuilder sb = gen.generateQuery(0);
		System.out.println(sb);
	}

}
