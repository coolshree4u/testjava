package com.ch10;

public class StError {

	void do1(int x){
		do2(x);
	}
	
	void do2(int y){
		do3(y);
	}
	
	void do3(int z){
		do1(z);
	}
	public static void main(String[] args) {
		StError stError=new StError();
		stError.do1(10);
		
	}

}
