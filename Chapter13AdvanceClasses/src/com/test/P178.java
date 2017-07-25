package com.test;

import java.util.Arrays;
import java.util.List;

public class P178 {

	public static void main(String[] args) {
		List w = Arrays.asList("Apple is Red".split(" "));
		w.stream().distinct().sorted().forEach(System.out::println);

	}

}
