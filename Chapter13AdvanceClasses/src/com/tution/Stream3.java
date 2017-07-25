package com.tution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3);
		a.add(4);
		a.add(2);

		// eg1
		System.out.println(a.stream().count());
		System.out.println(a.stream().distinct().count());

		int arr[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(arr);
		s1.forEach(n -> System.out.print(n + ""));
		// eg2
		IntStream s2 = Arrays.stream(arr);
		long c1 = s2.count();
		System.out.println(c1);
		// eg3
		IntStream s3 = Arrays.stream(arr);
		long c2 = s3.distinct().count();
		System.out.println(c2);

		int a1[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s12 = Arrays.stream(a1);
		s12.forEach(n -> System.out.print(n + ""));

		// eg4
		IntStream s23 = Arrays.stream(a1);
		IntStream s34 = s23.distinct();
		s34.forEach(n -> System.out.print(n + "-"));
		// eg5
		IntStream s4 = Arrays.stream(a1);
		s4.distinct().forEach(n -> System.out.print(n + "-"));

	}

}
