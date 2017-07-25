package com.tution;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream5 {

	public static void main(String[] args) {
		String[] myArray = new String[] { "bob", "alice", "paul", "ellie" };
		// eg1
		Stream<String> st2 = Arrays.stream(myArray);
		st2.filter(s -> s.length() > 4).forEach(e -> System.out.print(e + ""));
		// eg2
		Stream<String> st3 = Arrays.stream(myArray);
		st3.filter(s -> s.startsWith("a")).forEach(e -> System.out.print(e + ""));

		// max
		int a[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(a);
		s1.forEach(n -> System.out.print(n + ""));

		// eg1
		IntStream s2 = Arrays.stream(a);
		int ma = s2.max().getAsInt();
		System.out.println(ma);
		// eg2
		IntStream s3 = Arrays.stream(a);
		int mi = s3.min().getAsInt();
		System.out.println(mi);
		// eg3
		IntStream s4 = Arrays.stream(a);
		double av = s4.average().getAsDouble();
		System.out.println(av);

	}

}
