package com.tution;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class O1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.eid=10;
		e.ename="Raj";
		
		FileOutputStream fout=new FileOutputStream("Employee.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream oout=new ObjectOutputStream(bout);
		oout.writeObject(e);
		oout.close();
		
		FileInputStream fin=new FileInputStream("Employee.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		Employee b=(Employee)oin.readObject();
		System.out.println(b.eid+"  "+b.ename);
		oin.close();
	}

}
