package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j67db {

	public static void main(String[] args) {
		List<String> alphabets = new ArrayList<>(Arrays.asList("aa", "bbb", "aac", "dog"));
		alphabets.stream().filter(s -> s.length() > 2).forEach(System.out::print);
	}
}