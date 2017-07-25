package com.ch7;

public class DeluxThingy extends Thingi{
	public static void main(String args[]){
		DeluxThingy dt=new DeluxThingy();
		dt.m.go();
		Thingi t=new DeluxThingy();
		t.m.go();
	}
}
