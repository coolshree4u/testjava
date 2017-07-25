package com.tution;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream10 {

	public static void main(String[] args) {
		int[] array = { 3, 5, 10, 15 };
		int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
		System.out.println("Sum:" + sum);
		// eg2
		Stream<Integer> stream = Stream.of(3, 5, 6);
		System.out.println(stream.reduce(1, (a, b) -> a * b));
		// eg3
		Stream<String> name = Stream.of("bob", "alice", "paul", "ellie");
		String word = name.reduce("", (s, c) ->s +"#" + c);
		System.out.println(word);

		int a[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(a);
		s1.forEach(n -> System.out.print(n + ""));
		// eg4
		IntStream s23 = Arrays.stream(a);
		int sum1 = s23.reduce(0, (x, y) -> x + y);
		System.out.println(sum1);

		// eg5
		IntStream s24 = Arrays.stream(a);
		int sum2 = s24.reduce(1, (x, y) -> x - y);
		System.out.println(sum2);
	}

}
