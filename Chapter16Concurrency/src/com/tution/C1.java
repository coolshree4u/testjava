package com.tution;

import java.util.concurrent.Callable;

public class C1 implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		for(int i=1;i<=5;i++){
			System.out.println(" c = "+i*i*i);
		}
		return 10;
	}
}
