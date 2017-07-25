package com.tution;

import java.util.Comparator;

public class Employee6 {
	String name;
	String location;
	double salary;

	Employee6(String s, String l, double sal) {
		name = s;
		location = l;
		salary = sal;
	}

}

class An implements Comparator<Employee6> {
	public int compare(Employee6 e1, Employee6 e2) {
		return e1.name.compareTo(e2.name);

	}
}

class Dn implements Comparator<Employee6> {
	public int compare(Employee6 e1, Employee6 e2) {
		return e2.name.compareTo(e1.name);

	}
}