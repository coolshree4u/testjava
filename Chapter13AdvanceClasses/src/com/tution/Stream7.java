package com.tution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Stream7 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3);
		a.add(4);
		a.add(2);

		// eg1
		Predicate<Integer> p1 = num -> num % 2 == 0;
		System.out.println(a.stream().allMatch(p1));
		System.out.println(a.stream().anyMatch(p1));
		System.out.println(a.stream().noneMatch(p1));

		// eg2
		Predicate<Integer> p2 = num -> num % 2 == 0;
		System.out.println(a.stream().allMatch(p2));
		System.out.println(a.stream().anyMatch(p2));
		System.out.println(a.stream().noneMatch(p2));

		int arr[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(arr);
		s1.forEach(n -> System.out.print(n + ""));

		// eg3
		IntStream s2 = Arrays.stream(arr);
		boolean b2 = s2.allMatch(n -> n % 10 == 0);
		System.out.println(b2);
		// eg4
		IntStream s3 = Arrays.stream(arr);
		boolean b3 = s3.allMatch(n -> n % 20 == 0);
		System.out.println(b3);
		// eg5
		IntStream s4 = Arrays.stream(arr);
		boolean b4 = s4.anyMatch(n -> n % 20 == 0);
		System.out.println(b3);
	}

}
