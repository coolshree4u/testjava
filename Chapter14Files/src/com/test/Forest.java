package com.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Forest implements Serializable{
	private Tree tree=new Tree();
	
	public static void main(String args[]){
		Forest f=new Forest();
		try{
			FileOutputStream fos=new FileOutputStream("f.ser");
			new ObjectOutputStream(fos).writeObject(f);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}