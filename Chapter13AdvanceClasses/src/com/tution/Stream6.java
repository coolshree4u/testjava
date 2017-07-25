package com.tution;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream6 {

	public static void main(String[] args) {
		String[] myArray = new String[] { "bob", "alice", "paul", "ellie" };

		// eg1
		Stream<String> st1 = Arrays.stream(myArray);
		st1.map(s -> s.toUpperCase()).forEach(e -> System.out.print(e + ""));
		// eg2
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().map(i -> i * i).forEach(s -> System.out.print(s + ""));

		List<Integer> a1 = Arrays.asList(1, 2, 4, 3, 4, 2);
		// eg3
		Predicate<Integer> p1 = num -> num % 2 == 0;
		a1.stream().filter(p1).forEach(e -> System.out.print(e + ""));
		// eg4
		Predicate<Integer> p2 = num -> num % 2 != 0;
		System.out.println(a1.stream().filter(p2).count());

		int a[]={30,50,40,20,70,10,20,50};
		IntStream s1 = Arrays.stream(a);
		s1.forEach(e -> System.out.print(e + ""));
		// eg5
		IntStream s2 = Arrays.stream(a);
		s2.filter(n -> n % 30 == 0).forEach(e -> System.out.print(e + ""));
		// eg6
		IntStream s3 = Arrays.stream(a);
		s3.filter(n -> n % 20 == 0).sorted().forEach(e -> System.out.print(e + ""));
		// eg7
		IntStream s4 = Arrays.stream(a);
		s4.limit(4).forEach(i -> System.out.print(i + ""));

	}

}
