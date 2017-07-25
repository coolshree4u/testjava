package com.test;

public class Student {
	public String name="";
	public int age=0;
	public String major="Undeclared";
	public boolean fulltime=true;
	public void display(){
		System.out.println("Name :  "+name+" Major: "+major);
	}
	public boolean isFullTime(){
		return fulltime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.display();
	}

}
