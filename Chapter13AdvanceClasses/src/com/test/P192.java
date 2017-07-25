package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P192 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amir", "2", "Salman", "1Amitabh");
		Predicate<String> p = x -> Character.isLetter(x.charAt(0));
		System.out.print(list.stream().anyMatch(p));
		System.out.print(list.stream().allMatch(p));
		System.out.print(list.stream().noneMatch(p));
	}
}
