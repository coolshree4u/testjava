package com.tution;

import java.util.ArrayList;
import java.util.Collections;

public class MySort6 {

	public static void main(String[] args) {
		Employee6 e1 = new Employee6("Priya", "Mumbai", 4000.0);
		Employee6 e2 = new Employee6("Anil", "Pune", 3000.0);
		Employee6 e3 = new Employee6("Sam", "Delhi", 7000.0);
		Employee6 e4 = new Employee6("Vijay", "Patna", 5000.0);
		ArrayList<Employee6> e = new ArrayList<Employee6>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		Collections.sort(e, new An());
		System.out.println("Sorted List as per Names-Alphabetical:");
		for (Employee6 e10 : e) {
			System.out.println(e10.name + "  " + e10.location + "  " + e10.salary);

		}
		Collections.sort(e, new Dn());
		System.out.println("Sorted List as per Names-Reverse Alphabetical:");
		for (Employee6 e10 : e) {
			System.out.println(e10.name + "  " + e10.location + "  " + e10.salary);

		}
	}

}
