package com.tution;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream4 {

	public static void main(String[] args) {

		String[] myArray = new String[] { "bob", "alice", "paul", "ellie" };
		// eg1
		Stream<String> st1 = Arrays.stream(myArray);
		st1.sorted().forEach(e -> System.out.print(e + ""));
		// eg2
		List<Integer> list = Arrays.asList(2, 3, 1, 4);
		((Collection<Integer>) list).stream().sorted().forEach(s -> System.out.print(s + ""));

		int a[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(a);
		s1.forEach(n -> System.out.print(n + ""));
		// eg3
		IntStream s2 = Arrays.stream(a);
		s2.sorted().forEach(e -> System.out.print(e + "\t"));
		// eg4
		IntStream s3 = Arrays.stream(a);
		s3.distinct().sorted().forEach(e -> System.out.print(e + "-"));
	}

}
