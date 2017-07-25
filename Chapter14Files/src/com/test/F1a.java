package com.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p=Paths.get("e.ser");
		System.out.println(Files.exists(p));
		
		Path wordpath=Paths.get("/home/MVTECHLABS.COM/shriprasad.patil/CP-31/automation/s.sh");
		System.out.println(wordpath.getFileName());
		System.out.println(wordpath.subpath(0, 4));
		System.out.println(wordpath.subpath(3, 6));
		System.out.println(wordpath.subpath(2, 3));
		
		
		System.out.printf("getName(0): %s",wordpath.getName(0));
		System.out.printf("\nsubpath(0,2): %s",wordpath.subpath(0, 2));
	}
}