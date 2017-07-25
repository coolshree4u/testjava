package com.test;

import java.util.stream.Stream;

public class P194 {
	public static void main(String[] args) {
		// TODO code application logic here
		Stream<Integer> s = Stream.of(4, 3, 5);
		int res = s.reduce(1, (a, b) -> a * b);
		System.out.println(res);

	}
}
