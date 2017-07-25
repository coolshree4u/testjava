package com.tution;

import java.util.HashSet;

public class Hs2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentHash student1 = new StudentHash(10, "Anil");
		StudentHash student2 = new StudentHash(10, "Raj");

		HashSet<StudentHash> hs1 = new HashSet<>();
		hs1.add(student1);
		hs1.add(student2);

		for (StudentHash student : hs1) {
			System.out.println(student.rno + " " + student.name);
		}
	}

}
