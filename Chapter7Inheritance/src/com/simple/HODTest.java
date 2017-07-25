package com.simple;

public class HODTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HOD h=new HOD();
		h.setId(102);
		h.setName("Krishna");
		h.setAddress("Mumbai");
		h.setSalary(45000);
		h.setDept("Computer");
		
		System.out.println("Id = "+h.getId());
		System.out.println("Name = "+h.getName());
		System.out.println("Address = "+h.getAddress());
		System.out.println("Salary = "+h.getSalary());
		System.out.println("Department = "+h.getDept());
	}
}