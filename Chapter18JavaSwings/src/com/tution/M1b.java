package com.tution;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class M1b extends JFrame{

	Container c;
	JButton b1, b2;
	
	public M1b() {
		c=getContentPane();
		
		c.setLayout(new FlowLayout());
		b1=new JButton("Click 1");
		b2=new JButton("Click 2");
		
		c.add(b1);
		c.add(b2);
	}
	public static void main(String[] args) {
		M1b m1b=new M1b();
		m1b.setSize(500, 500);
		m1b.setTitle("Button click");
		m1b.setVisible(true);
		m1b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
