package com.lecture;

public class Hero implements Actor4{

	@Override
	public void act() {
		System.out.println("I can act");
	}

	@Override
	public void speak() {
		System.out.println("I can speak Hindi and English");
	}
	
	public void comedy()
	{
		System.out.println("I can do comedy");
	}
}