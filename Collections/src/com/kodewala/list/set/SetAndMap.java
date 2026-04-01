package com.kodewala.list.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetAndMap {

	public static void main(String[] args) {
		
		// Unordered
		// unique keys. Value can be duplicate
		Map<String, String> statesAndCap = new HashMap<String, String>();

		statesAndCap.put("KA", "BLR");
		statesAndCap.put("TN", "BLR");
		statesAndCap.put("TS", "BLR");
		statesAndCap.put("MH", "BLR");
		statesAndCap.put("MH", "BLR");
		statesAndCap.put(null, "BLR..");
		// System.out.println(statesAndCap );


		Iterator<Entry<String, String>> itr1 = statesAndCap.entrySet().iterator();

		while (itr1.hasNext()) {
			Entry<String, String> entry = itr1.next();
			System.out.println(entry.getKey() + " and " + entry.getValue());
		}

		HashSet<String> set = new HashSet<String>();

		set.add("Ka");
		set.add("TN");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

	}

}
