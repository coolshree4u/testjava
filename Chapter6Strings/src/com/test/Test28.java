package com.test;

import java.util.Scanner;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csvReader="Pankaj,8,true,3";
		Scanner scan=new Scanner(csvReader);
		scan.useDelimiter(",");
		String name=scan.next();
		int exp=scan.nextInt();
		System.out.println(name+"  "+exp);
	}
}