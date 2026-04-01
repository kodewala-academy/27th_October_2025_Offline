package com.kodewala.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();

		words.add("Ahmedabad");
		words.add("Anand");
		words.add("Bangalore");
		words.add("Chennai");

		List<String> result = new ArrayList<String>();
		// 1. iterate the list
		// 2. if word starts with 'A' then store it to separate list.
		// 3. Convert the word to upper case
		// 4. print the list.
		for (String word : words) {
			if (word.startsWith("A")) {
				result.add(word.toUpperCase());
			}

		}

		// convert the collection to stream object.
		Stream<String> stream = words.stream();

		// filter(intermediate op) the word starting with 'A'
		Stream<String> filteredStream = stream.filter(w -> w.startsWith("A"));

		// convert the filtered data to upper case.
		
		Stream<String> upperCaseStream = filteredStream.map(w -> w.toUpperCase());
		
		// collect the data(terminal operation)
		
		List<String> result1 = upperCaseStream.collect(Collectors.toList());
		
		
		
		  List<String> result2 = words.stream().filter(word ->
		  word.startsWith("A")).map(n -> n.toUpperCase())
		  .collect(Collectors.toList());
		 
		 

		System.out.println(result1);
		System.out.println(result2);
	}

}
