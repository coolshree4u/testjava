package com.tution;

public class Employee2 implements Comparable<Employee2>{
	String name;
    String location;
    double salary;

    Employee2(String s, String l, double sal) {
        name = s;
        location = l;
        salary = sal;

    }

	@Override
	public int compareTo(Employee2 o) {
		return (name.compareTo(o.name));
	}
	
	//Changing Order of Object will change to the Order of results
	//if name.compareTo(o.name) gives you ascending order then
	//(o.name).compareTo(name) will give you descending order
}