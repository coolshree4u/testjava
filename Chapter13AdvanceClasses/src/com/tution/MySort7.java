package com.tution;

import java.util.ArrayList;
import java.util.Collections;

public class MySort7 {

	public static void main(String[] args) {
		Employee7 e1 = new Employee7("Priya", "Mumbai", 4000.0);
		Employee7 e2 = new Employee7("Anil", "Pune", 3000.0);
		Employee7 e3 = new Employee7("Sam", "Delhi", 7000.0);
		Employee7 e4 = new Employee7("Vijay", "Patna", 5000.0);
		ArrayList<Employee7> e = new ArrayList<Employee7>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		Collections.sort(e, new As());
		System.out.println("Sorted List as per Salary Ascending:");
		for (Employee7 e10 : e) {
			System.out.println(e10.name + "" + e10.location + "" + e10.salary);

		}
		Collections.sort(e, new Ds());
		System.out.println("Sorted List as per Salary Descending:");
		for (Employee7 e10 : e) {
			System.out.println(e10.name + "" + e10.location + "" + e10.salary);

		}
	}

}
