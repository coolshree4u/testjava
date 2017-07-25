package com.test;

public class OverloadingArgs {
	public void loglt(String ... msgs){
		for (String string : msgs) {
			System.out.println(string);
		}
	}
}
