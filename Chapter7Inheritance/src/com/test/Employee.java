package com.test;

public class Employee extends Person {
	public String id="PCG0088";
	
	public String name;
	public String salary;
	public Employee(String id){
		this.id=id;
	}
	
	public Employee(String name, String Salary){
		this.name=name;
		this.salary=salary;
	}
	public static void main(String args[])
	{
		Employee emp=new Employee("PCG0079");
		System.out.println(emp.id);
	}
}
