package com.LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestSorting {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
/*		for (int number : numbers) {
			System.out.println(number);
		}

		numbers.forEach((Integer value) -> System.out.println(value));

		numbers.forEach(System.out::println);*/
		
		System.out.println(sumAll(numbers, n -> true));
		System.out.println(sumAll(numbers, n -> n % 2 == 0));
		System.out.println(sumAll(numbers, n -> n > 3));
	}

	public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
		int total = 0;
		for (int number : numbers) {
			if (p.test(number)) {
				total += number;
			}
		}
		return total;
	}
}