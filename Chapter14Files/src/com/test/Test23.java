package com.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test23 {
	public static void main(String[] args) {
		String fileName = "actors.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			list = stream.filter(line -> line.startsWith("S")).map(String::toUpperCase).collect(Collectors.toList());
		} catch (Exception e) {
			System.out.println(e);
		}
		list.forEach(System.out::println);

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			list = stream.filter(line -> line.startsWith("S")).map(String::toLowerCase).sorted()
					.collect(Collectors.toList());
		} catch (Exception e) {
			System.out.println(e);
		}
		list.forEach(System.out::println);
	}

}