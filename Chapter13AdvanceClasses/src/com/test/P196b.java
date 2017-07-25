package com.test;

import java.util.stream.Stream;

public class P196b {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Dangal", "Dabang", "Bodyguard", "raees");
		s.filter(x -> x.startsWith("D")).forEach(System.out::print);
	}

}
