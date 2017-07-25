package com.test;

import java.util.stream.Stream;

public class P196 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Amy", "Suman", "Romy");
		s.map(x -> x.length()).forEach(p->System.out.print(p));
	}

}
