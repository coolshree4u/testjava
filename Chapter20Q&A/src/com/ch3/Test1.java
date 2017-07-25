package com.ch3;

public class Test1 {

	public static void main(String[] args) {
		int testvar=10;
		boolean res=false;
		
		if((res==true)&(testvar+=5)==15){
			System.out.println("=");
			System.out.println(+testvar);
		}else {
			System.out.print("not=");
			System.out.println(+testvar);
		}
	}

}
