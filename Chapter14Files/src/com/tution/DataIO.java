package com.tution;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {

	public static void main(String[] args) throws IOException {

		FileOutputStream f1 = new FileOutputStream("demo/pri.txt");
		BufferedOutputStream b1 = new BufferedOutputStream(f1);
		DataOutputStream d1 = new DataOutputStream(b1);

		d1.writeByte(7);
		d1.close();

		FileInputStream f2 = new FileInputStream("demo/pricpy.txt");
		BufferedInputStream b2 = new BufferedInputStream(f2);
		DataInputStream d2 = new DataInputStream(b2);
		byte data = d2.readByte();
		System.out.println("data = " + data);
		d2.close();
	}
}