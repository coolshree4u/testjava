package com.test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test10 extends JFrame{
	Container c;
	JButton b1, b2, b3;

	public Test10() {
		c = getContentPane();
		c.setLayout(new BorderLayout());
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		c.add(BorderLayout.SOUTH, b1);
		c.add(BorderLayout.NORTH, b1);
		c.add("west", b1);
	}

	public static void main(String[] args) {
		Test10 s = new Test10();
		s.setSize(400, 400);
		s.setLocation(200, 200);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
