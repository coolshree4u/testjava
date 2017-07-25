package com.tution;

import java.io.File;
import java.io.IOException;

public class Fi1d {

	public static void main(String[] args) {
		File d=new File(args[0]);
		if(!d.exists()){
			d.mkdir();
			System.out.println(d+" created");
		}else{
			System.out.println(d+" already exists");
		}
		
		File f=new File(d,args[1]);
		try {

			if(!f.exists()){
				f.createNewFile();
				System.out.println(f+" created");
			}
			else{
				System.out.println(f+" already exists");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
