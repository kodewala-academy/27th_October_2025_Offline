package com.kodewala.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(432, 54, 674, 7567, 76, 76, 476, 5234, 987, 8, 98, 8);

		// distinct
		List<Integer> uniqueNumber = numbers.parallelStream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNumber);

		List<Integer> sortedInt = uniqueNumber.stream().sorted((a, b) -> a - b).collect(Collectors.toList());
		System.out.println(sortedInt.get(0));

		Optional<Integer> highest = sortedInt.stream().skip(2).findFirst();
		System.out.println("3rd highest " + highest.get());

		List<String> words = Arrays.asList("java", "spring", "backend", "microservices", "api", "upi", ".net", "cloud",
				"hello");

		Map<Integer, List<String>> output = words.stream().collect(Collectors.groupingBy(word -> word.length()));

		System.out.println(output);
	}
}
