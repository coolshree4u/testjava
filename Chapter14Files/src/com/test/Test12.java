package com.test;

import java.io.FileInputStream;

public class Test12 {
	public void otherMethod() throws Exception {
		//printFile("");
		printFile(null);
	}

	private void printFile(String string) throws Exception {
		try (FileInputStream fis = new FileInputStream(string)) {
			System.out.println(fis.read());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) throws Exception{
		Test12 test12=new Test12();
		test12.otherMethod();
	}
}
