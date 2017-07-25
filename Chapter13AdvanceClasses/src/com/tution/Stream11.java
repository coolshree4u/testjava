package com.tution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream11 {

	public static void main(String[] args) {
		List<String> n = new ArrayList<>();
		n.add("Amit");
		n.add("Sumit");
		n.add("Anil");
		n.add("Amit");
		n.add("Naomi");
		Stream<String> s1 = n.stream();
		s1.forEach(i -> System.out.print(i + ","));

		// eg1
		Stream<String> s2 = n.stream().filter(x -> x.endsWith("it"));
		List<String> nf = s2.collect(Collectors.toList());
		System.out.println(nf);
		// eg2
		Stream<String> s3 = n.stream().filter(x -> x.endsWith("it"));
		Set<String> ns = s3.collect(Collectors.toSet());
		System.out.println(ns);
		// eg3
		Stream<String> s3a = n.stream().filter(x -> x.endsWith("A"));
		Map<String, Integer> nm = s3a.collect(Collectors.toMap(s -> s, s -> s.length(), (e1, e2) -> e1));
		System.out.println(nm);

		// eg4
		Stream<String> s4 = n.stream().filter(x -> x.endsWith("i"));
		Set<String> ts = s4.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(ts);
	}

}
