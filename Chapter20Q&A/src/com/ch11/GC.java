package com.ch11;

public class GC {
	private Object o;
	private void doSomeThingElse(Object o){
		this.o=o;
	}
	public void doSomething(){
		Object o=new Object();
		doSomeThingElse(o);
		o=new Object();
		doSomeThingElse(null);
		o=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//doSomeThingElse(null); will make object ready for garbage collection