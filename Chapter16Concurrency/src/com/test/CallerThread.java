package com.test;

import java.util.concurrent.Callable;

public class CallerThread implements Callable<String> {
	String str;

	public CallerThread(String s) {
		this.str = s;
	}

	@Override
	public String call() throws Exception {
		return str.concat("Call");
	}

}
