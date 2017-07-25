package com.test;

public class Browser {
	public static void addToFavorites(int id,String ... urls){
		for (String string : urls) {
			System.out.println(string);
		}
	}
	
	public static void main(String args[])
	{
		addToFavorites(10, "https://www.google.co.in", "https://www.facebook.com");
	}
}
