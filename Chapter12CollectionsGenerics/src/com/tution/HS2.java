package com.tution;

import java.util.HashSet;

public class HS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student(10, "Anil");
		Student student2=new Student(10, "Raj");
		
		HashSet<Student> hs1=new HashSet<>();
		hs1.add(student1);
		hs1.add(student2);
		
		for (Student student : hs1) {
			System.out.println(student.rno+" "+student.name);
		}
	}

}
