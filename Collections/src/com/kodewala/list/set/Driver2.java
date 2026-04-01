package com.kodewala.list.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Driver2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // not thread safe....

		list.add("BLR");
		list.add("CH");
		list.add("HYD");

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) { // processing 5 and 5
			String element = (String) itr.next();
			System.out.println(element);
			itr.add("DL"); // Changing the structure --> throw CME

		}

		System.out.println(list);
		List<String> syncList = Collections.synchronizedList(list); // thread safe....
		
		
		ConcurrentHashMap<String , String> map = new ConcurrentHashMap<String, String>();
		
		map.put("KA", "BLR");
		map.put("TS", "HYD");

		 Map<String , String> syncMap = Collections.synchronizedMap(map);
		
		
	}

}
