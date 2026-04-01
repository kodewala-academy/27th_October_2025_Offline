package com.kodewala.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Hello", "I", "am", "from", "Bangalore", "Bombay");

		// 1. Convert all the words to upper case

		List<String> output = words.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());

		System.out.println(" input " + words);
//		System.out.println(" output " + output);

		// find the word starting with 'B'

		List<String> wordStartsWithB = words.stream().filter(word -> word.startsWith("B")).collect(Collectors.toList());
		System.out.println(wordStartsWithB);

		List<List<String>> data = Arrays.asList(Arrays.asList("HELLO", "I"), Arrays.asList("AM", "FROM"),
				Arrays.asList("BANGALORE"));

		List<String> out = data.stream().flatMap(list -> list.stream()).map(w -> w.toLowerCase())
				.collect(Collectors.toList());
		System.out.println("initial structure" + data);
		System.out.println("out " + out);
	}
}
