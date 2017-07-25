package com.lecture;

public class F1Impl {
	public static void main(String srgs[])
	{
		F1 p1=(int d, int e)-> {d=d*10; e=e*20; return d+e;};
		
		int ans1=p1.add(5, 7);
		System.out.println("Op 1 "+ans1);
		
		F1 p2=(d, e)-> {d=d*10; e=e*20; return d+e;};
		
		int ans2=p2.add(8, 8);
		System.out.println("Op 2 "+ans2);
	}
}
