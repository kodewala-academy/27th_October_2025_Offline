package com.kodewala.list.arraylist;

import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String[] args) {

		CityInfo cityInfo = new CityInfo();

		LinkedList<String> cities = cityInfo.getCities();

		for (int index = 0; index < cities.size(); index++) {
			String city = cities.get(index);
			if (cities.get(index).startsWith("M")) {
				System.out.println(city);
			}
		}
		
		// java 1.5 / 5 - for each loop
		
		for(String city : cities)
		{
			System.out.println(city);
		}
		
		
		

	}

}
