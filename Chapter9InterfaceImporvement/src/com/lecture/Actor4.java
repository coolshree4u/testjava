package com.lecture;

public interface Actor4 {
	public void act();
	public void speak();
	default public void comedy()
	{
		System.out.println("I am a Comedy person");
	}
}
