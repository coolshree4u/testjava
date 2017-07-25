package com.tution;
import java.util.*;

public class L2a {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(3);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);

		list.removeIf(a -> a % 2 == 0);
		System.out.println(list);

		list.replaceAll(b -> b * 2);
		System.out.println(list);

		list.forEach(c -> System.out.println(c));
		list.forEach(System.out::println);
	}

}
