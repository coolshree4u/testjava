package com.test;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.tution.Sw12;

public class Test5 extends JFrame{

	Container c;
	JButton  b1,b2,b3;
	
	public Test5() {
		c= getContentPane();
		b1=new JButton("RED");
		b2=new JButton("GREEN");
		b3=new JButton("BLUE");
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
	}
	
	public static void main(String[] args) {
		Test5 s = new Test5();
		s.setSize(500, 300);
		s.setLocation(200, 200);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setTitle("Sandwitch Order");
	}

}
