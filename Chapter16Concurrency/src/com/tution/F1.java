package com.tution;

import java.util.concurrent.Callable;

public class F1 implements Callable<Long>{
	long n;
	
	public F1(long n) {
		this.n=n;
	}
	@Override
	public Long call() throws Exception {
		long f =1;
		if(n<0)
			throw new Exception("Number should be greater than 0");
		else{
			for(long i=1;i<=n;i++){
				f=f*i;
			}
		}
		return f;
	}
}