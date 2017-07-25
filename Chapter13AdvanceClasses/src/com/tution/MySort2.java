package com.tution;

import java.util.ArrayList;
import java.util.Collections;

public class MySort2 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2("Priya", "Mumbai", 4000.0);
		Employee2 e2 = new Employee2("Arjit", "Pune", 3000.0);
		Employee2 e3 = new Employee2("Sam", "Delhi", 7000.0);
		Employee2 e4 = new Employee2("Vijay", "Patna", 5000.0);

		ArrayList<Employee2> e = new ArrayList<Employee2>();

		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);

		Collections.sort(e);

		System.out.println("Sorted List:");
		for (Employee2 e10 : e) {
			System.out.println(e10.name + " " + e10.location + "" + e10.salary);

		}
	}

}
