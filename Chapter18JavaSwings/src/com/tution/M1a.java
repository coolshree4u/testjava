package com.tution;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class M1a extends JFrame{

	Container c;
	JButton b1, b2;
	
	public M1a() {
		c=getContentPane();
		
		b1=new JButton("Click 1");
		b2=new JButton("Click 2");
		
		c.add(b1);
		c.add(b2);
	}
	public static void main(String[] args) {

		M1a m1a=new M1a();
		m1a.setSize(500, 500);
		m1a.setTitle("Button click");
		m1a.setVisible(true);
		m1a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
