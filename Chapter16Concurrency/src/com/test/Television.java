package com.test;

public class Television {
	private int channel;
	private boolean on;
	private int volume;
	
	public void changeChannel(int newChannel){
		this.channel=channel;
	}
	public int getChannel(){
		return channel;
	}
	
	public void turnOn(){
		on=true;
	}
	
	public void turnOff(){
		on=false;
	}
	
	public void turnUp(){
		this.volume+=1;
	}
	public void turnDown(int volume){
		this.volume-=1;
	}
}
