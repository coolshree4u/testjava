package com.tution;

public class Student2 {
	private String year;
	private double grade;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		if(!year.equals("First") && !year.equals("Second") && !year.equals("Third") && !year.equals("Fourth"))
			throw new IllegalArgumentException(year+" not valid year");
		else
			this.year=year;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if(grade <0.0 || grade>100.0)
			throw new IllegalArgumentException(grade+" out of range");
		else
			this.grade=grade;
	}

	
	public static void main(String args[]){
		Student2 s2=new Student2();
		s2.setYear("First");
		s2.setYear("Junior");
		s2.setGrade(-24.5);
	}
}
