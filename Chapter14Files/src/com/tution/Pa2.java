package com.tution;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pa2 {

	public static void main(String[] args) {
		
		Path path=Paths.get("test/Test.json");
		System.out.println("Get File name: "+path.getFileName());
		System.out.println("get Name (0)"+path.getName(0));
		System.out.println("get Name (1)"+path.getName(1));
		//System.out.println("get Name (2)"+path.getName(2));
		System.out.println("get Name Count"+path.getNameCount());
		System.out.println("getParent "+path.getParent());
		System.out.println("get Root "+path.getRoot());
		//System.out.println("subpath(0,0)"+path.subpath(0, 0));
		System.out.println("subpath(0,1)"+path.subpath(0, 1));
		System.out.println("subpath(0,2)"+path.subpath(0, 2));
		//System.out.println("subpath(0,3)"+path.subpath(0, 3));
		System.out.println("toString : "+path.toString());
	}

}
