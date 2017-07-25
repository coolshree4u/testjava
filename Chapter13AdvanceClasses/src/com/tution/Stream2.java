package com.tution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream2 {

	public static void main(String[] args) {

		int a[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(a);
		s1.forEach(n -> System.out.println(n));
		// eg2
		IntStream s2 = Arrays.stream(a);
		s2.forEach(System.out::println);
		// eg3
		IntStream s3 = Arrays.stream(a);
		s3.forEach(n -> System.out.print(n + ","));
		// eg4
		IntStream s4 = Arrays.stream(a).parallel();
		s4.forEach(n -> System.out.print(n + ""));
		// eg5
		IntStream s5 = Arrays.stream(a).parallel();
		s5.forEachOrdered(n -> System.out.print(n + ""));
	}

}
