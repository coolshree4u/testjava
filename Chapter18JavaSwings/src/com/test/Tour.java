package com.test;

public class Tour {

	public static void main(String[] args) {
		Cathedral c=new Cathedral();
		Cathedral.Sanctum s=c.new Sanctum();
		s.go();
	}

}