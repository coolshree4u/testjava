package com.tution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream9 {

	public static void main(String[] args) {
		// MAP//
		String[] myArray = new String[] { "bob", "alice", "paul", "ellie" };

		// eg1
		Stream<String> st1 = Arrays.stream(myArray);
		st1.map(s -> s.toUpperCase()).forEach(e -> System.out.print(e + ""));
		// eg2
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().map(i -> i * i).forEach(s -> System.out.print(s + ""));

		int a[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(a);
		s1.forEach(n -> System.out.print(n + ""));

		// eg3
		IntStream s19 = Arrays.stream(a);
		IntStream s20 = s19.map(n -> -n);
		s20.forEach(i -> System.out.print(i + ""));

		// eg4

		IntStream s21 = Arrays.stream(a);
		IntStream s22 = s21.map(n -> -n);
		s22.forEach(i -> System.out.print(i + ""));

	}

}
