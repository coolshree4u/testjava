package com.test;

public class Score implements Comparable<Score> {
	
	private int wins,losses;
	public Score(int w, int l) {
		wins=w;
		losses=l;
	}
	
	public int getWins(){
		return wins;
	}
	public int getLoses(){
		return losses;
	}
	
	public String toString(){
		return "<"+wins+" "+losses+">";
	}
	@Override
	public int compareTo(Score o) {
		
		return 0;
	}
	
}
