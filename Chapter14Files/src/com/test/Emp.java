package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Emp implements Serializable{
	private String name;
	private float salary;
	private int id;
	public Emp(String name, float salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	
	public static void main(String args[]) throws IOException{
		Emp emp=new Emp("Abcd", 123456.78f, 88);
		FileOutputStream fos=new FileOutputStream("e.ser");
		new ObjectOutputStream(fos).writeObject(emp);
	}
}
