package com.test;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.tution.Sw12;

public class Test6 extends JFrame {

	Container c;
	JButton b1, b2, b3;

	public Test6() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		b1=new JButton("b3");
		b2=new JButton("b1");
		b3=new JButton("b2");
		c.add(b1);
		c.add(b2);
		c.add(b3);
	}

	public static void main(String[] args) {
		Test6 s = new Test6();
		s.setSize(500, 300);
		s.setLocation(200, 200);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
