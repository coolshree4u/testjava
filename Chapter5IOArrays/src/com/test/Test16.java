package com.test;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] table={"aa","bb","cc"};
		for(String ss:table){
			int ii=0;
			while(ii<table.length){
				System.out.println(ss+","+ii);
				ii++;
			}
		}
	}

}
