package com.tution;

import java.util.Comparator;

public class Employee7 {

	String name;
	String location;
	double salary;

	Employee7(String s, String l, double sal) {
		name = s;
		location = l;
		salary = sal;
	}
}

class As implements Comparator<Employee7> {
	public int compare(Employee7 e1, Employee7 e2) {
		return (int) (e1.salary - e2.salary);

	}
}

class Ds implements Comparator<Employee7> {
	public int compare(Employee7 e1, Employee7 e2) {
		return (int) (e2.salary - e1.salary);
	}

}