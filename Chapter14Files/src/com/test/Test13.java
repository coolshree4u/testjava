package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test13 {

	public static void process(String source, String destinition) throws FileNotFoundException, IOException {
		try (InputStream fis = new FileInputStream(source); OutputStream os = new FileOutputStream(destinition)) {
			byte[] buff = new byte[10];
			int i;
			while ((i = fis.read(buff)) == -1) {
				os.write(buff, 0, i);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		process("input.txt", "output.txt");
	}

}