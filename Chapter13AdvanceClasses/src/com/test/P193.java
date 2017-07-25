package com.test;

import java.util.stream.Stream;

public class P193 {
	public static void main(String[] args) {
		// TODO code application logic here
		Stream<String> s = Stream.of("d", "a", "n", "g", "al");
		String m = s.reduce("-", (s1, c1) -> s1 + c1);
		System.out.println(m);

	}
}
