package com.test;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test7 extends JFrame{

	Container c;
	JButton b1, b2, b3;

	public Test7() {
		c = getContentPane();
		FlowLayout f1=new FlowLayout();
		FlowLayout f2=new FlowLayout(FlowLayout.RIGHT);
		FlowLayout f3=new FlowLayout(FlowLayout.LEFT);
		b1=new JButton("b3");
		b2=new JButton("b1");
		b3=new JButton("b2");
		c.setLayout(f1);
		c.add(b1);
		c.setLayout(f2);
		c.add(b2);
		c.setLayout(f3);
		c.add(b3);
	}
	public static void main(String[] args) {
		Test7 s = new Test7();
		s.setSize(500, 300);
		s.setLocation(200, 200);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
