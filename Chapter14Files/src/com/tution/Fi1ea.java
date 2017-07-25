package com.tution;

import java.io.File;

public class Fi1ea {
	public static void main(String[] args) {
		try{
			File dir1=new File("K1");
			dir1.mkdir();
			
			File dir2=new File("K2");
			dir2.mkdir();
			
			File file1=new File(dir1,"F1.txt");
			file1.createNewFile();
			
			File file2=new File(dir1,"F2.txt");
			file2.createNewFile();
			
			File file3=new File(dir2,"F3.txt");
			file3.createNewFile();
			
			file3.delete();
			dir2.delete();
			

			File dir3=new File("K3");
			dir1.renameTo(dir3);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}