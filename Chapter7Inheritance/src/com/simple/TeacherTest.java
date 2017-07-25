package com.simple;

public class TeacherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		t.setId(101);
		t.setName("Akhil");
		t.setAddress("Mumbai");
		t.setSalary(400000);
		
		System.out.println("Id = "+t.getId());
		System.out.println("Name = "+t.getName());
		System.out.println("Address = "+t.getAddress());
		System.out.println("Salary = "+t.getSalary());
	}
}