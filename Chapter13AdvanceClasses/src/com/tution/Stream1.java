package com.tution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// eg1
		Stream s1 = Stream.of(4, 2, 1, 3);
		s1.forEach(p -> System.out.print(p + ","));
		// eg2
		Stream<String> s2 = Stream.of("amit", "rohit", "sumit");
		s2.forEach(p -> System.out.print(p + "-"));
		// eg3
		Integer a1[] = { 40, 20, 10, 30 };
		Stream<Integer> s12 = Stream.of(a1);
		s12.forEach(p -> System.out.print(p + " "));

		// eg4
		int a2[] = { 1, 3, 2, 4 };
		IntStream s23 = IntStream.of(a2);
		s23.forEach(e -> System.out.print(e + "-"));
		/// eg5s
		List<String> a = new ArrayList<>();
		a.add("java");
		a.add("Andrsoid");
		Stream<String> s123 = a.stream();
		s123.forEach(p -> System.out.print(p + ","));
		// eg6
		List<Integer> b = Arrays.asList(2, 4, 3, 1);
		Stream<Integer> s234 = b.stream();
		s234.forEach(e -> System.out.print(e + "-"));
		// eg7
		Stream<Integer> s3 = b.parallelStream();
		s3.forEach(e -> System.out.print(e + "-"));
		// eg8
		Stream<Integer> s4 = b.parallelStream();
		s4.forEachOrdered(e -> System.out.print(e + "-"));

	}

}
