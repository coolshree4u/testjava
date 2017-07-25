package com.practice;

public class MUCollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abstract Class Demo");
		MUC1 muc1obj=new MUC1();
		muc1obj.fiyc();
		muc1obj.syc();
		muc1obj.tyc();
		muc1obj.foyc();
		
		
		MUC2 muc2obj=new MUC2();
		muc2obj.fiyc();
		muc2obj.syc();
		muc2obj.tyc();
		muc2obj.foyc();

		
		System.out.println("Interface Demo");
		MuIc1 interfaceObj=new MuIc1();
		interfaceObj.fiyc();
		interfaceObj.syc();
		interfaceObj.tyc();
		interfaceObj.foyc();
		
		System.out.println("Interface Demo");
		MuIc2 ic2=new MuIc2();
		ic2.fiyc();
		ic2.syc();
		ic2.tyc();
		ic2.foyc();
		
	}
}