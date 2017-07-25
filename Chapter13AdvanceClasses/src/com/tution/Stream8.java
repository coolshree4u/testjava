package com.tution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream8 {

	public static void main(String[] args) {
		int a[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(a);
		s1.forEach(n -> System.out.print(n + ""));
		// eg1
		IntStream s16 = Arrays.stream(a);
		int fa = s16.findAny().getAsInt();
		System.out.println(fa);
		// eg2
		IntStream s16a = Arrays.stream(a);
		int faa = s16a.findFirst().getAsInt();
		System.out.println(faa);
		// eg3
		IntStream s17 = Arrays.stream(a);
		int fa1 = s17.filter(n -> n % 20 == 0).findAny().getAsInt();
		System.out.println(fa1);
		// eg4
		IntStream s18 = Arrays.stream(a);
		int fa2 = s18.filter(n -> n % 20 == 0).findFirst().getAsInt();
		System.out.println(fa2);
		// eg5
		IntStream s17a = Arrays.stream(a).parallel();
		int fa1a = s17a.filter(n -> n % 20 == 0).findAny().getAsInt();
		System.out.println(fa1a);
		// eg6
		IntStream s18a = Arrays.stream(a).parallel();
		int fa2a = s18a.filter(n -> n % 20 == 0).findFirst().getAsInt();
		System.out.println(fa2a);
	}

}
