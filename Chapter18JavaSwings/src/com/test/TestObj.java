package com.test;

public class TestObj {

	public static void main(String[] args) {
		Object o=new Object(){
			public boolean equls(Object obj){
				return true;
			}
		};
		
		System.out.println(o.equals("Fred"));
	}

}
