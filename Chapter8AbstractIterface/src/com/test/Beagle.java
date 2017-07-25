package com.test;

public class Beagle extends Dog {
	//visibility will not be strong in child
	//private String bark(){}
	protected String bark(){
		return "arf";
	}
	public static void main(String[] args) {
		Dog[] dogs={new Dog(),new Beagle()};
		for (Dog dog : dogs) {
			System.out.println(dog.bark());
		}
	}
}
