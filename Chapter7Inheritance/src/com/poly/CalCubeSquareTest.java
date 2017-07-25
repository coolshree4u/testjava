package com.poly;

public class CalCubeSquareTest {

	public static void main(String[] args) {
		CalSquare cs=new CalSquare();
		cs.calculate(10);
		CalCube cc=new CalCube();
		cc.calculate(10);
		cc.calculate(10.5f);
	}
}