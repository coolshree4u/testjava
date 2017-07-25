package com.ch10;

public class StError2 {

	public void counter(int x){
		counter(x++);
	}
	public static void main(String[] args) {
		StError2 stError2=new StError2();
		stError2.counter(10);
	}

}
