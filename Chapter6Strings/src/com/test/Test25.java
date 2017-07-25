package com.test;

public class Test25 {

	public static void main(String[] args) {
		String name="Abhishek-.-Omkar-.-Bharat-.-Jinal";
		String[] result=name.split("-.-");
	
		for (String string : result) {
			System.out.println(string);
		}
		
		String[] result2=name.split("-..");
		
		for (String string : result2) {
			System.out.println(string);
		}
	}

}
