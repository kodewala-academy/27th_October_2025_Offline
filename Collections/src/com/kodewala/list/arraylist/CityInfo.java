package com.kodewala.list.arraylist;

import java.util.LinkedList;

public class CityInfo {

	public LinkedList<String> getCities() {
		// creating linked list which will hold / store the cities.
		LinkedList<String> city = new LinkedList<String>();

		city.add("BLR");
		city.add("CHE");
		city.add("HYD");
		city.add("MUM");
		city.add("New Delhi");
		city.add("Mahdurai");
		//System.out.println("LinkedListExp.main() " + city);

		city.add(2, "AHM");

	//	System.out.println("LinkedListExp.main() " + city);

		return city;
	}

}
