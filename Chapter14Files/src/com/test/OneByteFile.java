package com.test;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OneByteFile {

	public static void main(String[] args) throws IOException {
		OutputStream fos=new FileOutputStream("input.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeByte(0);
		dos.close();
		
		OutputStream fos2=new FileOutputStream(new File("input.txt"));
		DataOutputStream dos2=new DataOutputStream(fos2);
		dos2.writeByte(0);
		dos2.close();
	}
}