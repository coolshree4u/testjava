package com.ch18;

public class Task {

	String title;
	
	static class Counter{
		int counter=0;
		int increament(){
			counter++;
			return counter;
		}
	}
	public static void main(String[] args) {
		System.out.println(new Task.Counter().counter);
		Task task=new Task();
		
		System.out.println(new Task.Counter().increament());
	}

}
