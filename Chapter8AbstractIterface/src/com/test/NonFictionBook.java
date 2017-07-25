package com.test;

public class NonFictionBook extends Book {
	
	/*public void read(int a){
		
	}
	THIS WILL BE CONSIDERED AS DIFFERENT METHOD
	AND ASKS FOR OVERRIDING THE READ METHOD
	*/
	
	
	@Override
	public void read() {
		System.out.println("Reading a NonFictionBook");
	}

}
