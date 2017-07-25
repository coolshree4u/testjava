package com.test;

import java.io.File;

public class MakeFile {

	public static void main(String[] args) {
		
		try {
			File direcotry=new File("d");
			File file=new File(direcotry,"f");
			if(!file.exists())
				file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
