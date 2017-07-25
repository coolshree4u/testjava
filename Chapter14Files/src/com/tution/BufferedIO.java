package com.tution;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("demo/oca.pdf");
		FileOutputStream f2=new FileOutputStream("demo/ocacopy.pdf");
		
		
		BufferedInputStream b1=new BufferedInputStream(f1);
		BufferedOutputStream b2=new BufferedOutputStream(f2);
		
		int i=0;
		
		long t1=System.nanoTime();
		while ((i=b1.read())!=-1) {
			f2.write(i);
		}
		long t2=System.nanoTime();
		
		double elapsedTime=t2-t1;
		double seconds=(double) elapsedTime/1000000000.0;
		System.out.println("Time needed to copy "+seconds);
		
		b2.close();
		b1.close();
		f2.close();
		f1.close();
	}

}
