package com.tution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C1 {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("demo/oca.pdf");
		FileOutputStream f2=new FileOutputStream("demo/ocacopy.pdf");
		
		byte[] b=new byte[1024];
		int i=0;
		
		long t1=System.nanoTime();
		while ((i=f1.read(b))!=-1) {
			f2.write(b,0,i);
		}
		long t2=System.nanoTime();
		
		double elapsedTime=t2-t1;
		double seconds=(double) elapsedTime/1000000000.0;
		System.out.println("Time needed to copy "+seconds);
		f1.close();
		f2.close();
	}

}
