package com.tution;

public class StudentHash {
	public int rno;
	public String name;
	public StudentHash(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	
	public boolean equals(Object o){
		StudentHash s=(StudentHash)o;
		return rno==s.rno;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rno;
	}
}
