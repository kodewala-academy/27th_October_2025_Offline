package com.kodewala.list.arraylist;

import java.util.ArrayList;

public class ArrayListTimeComp {

	public static void main(String[] args) {

		ArrayList<String> city = new ArrayList<String>();
		city.add("BLR");
		city.add("CH");
		city.add("HYD");
		city.add("DELHI");
		city.add("AHM");
		
		System.out.println(city);
		
		city.add(1, "CBE");
		
		System.out.println(city);
		
		

	}

}
