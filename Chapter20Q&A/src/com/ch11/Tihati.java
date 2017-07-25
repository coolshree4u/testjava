package com.ch11;

public class Tihati {

	Tihati tihati1;
	public static void main(String[] args) {
		Tihati t=new Tihati();
		Tihati t2=t.go(t);
		t2=null;
		
	}
	
	Tihati go(Tihati t){
		Tihati t1=new Tihati();
		Tihati t2=new Tihati();
		
		t1.tihati1=t2;
		t2.tihati1=t1;
		t.tihati1=t2;
		
		return t1;
	}

}
