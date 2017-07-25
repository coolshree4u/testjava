package com.tution;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class M2 extends JFrame{
	Container c;
	JButton b1, b2;

	public M2() {
		c = getContentPane();

		c.setLayout(new FlowLayout());
		b1 = new JButton("Click 1");
		b2 = new JButton("Click 2");

		c.add(b1);
		c.add(b2);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(c,"You have clicked Button 1");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(c,"You have clicked Button 2");
			}
		});
	}

	public static void main(String[] args) {
		M2 m2=new M2();
		m2.setSize(500, 500);
		m2.setTitle("Button click Using Anonymous classes");
		m2.setVisible(true);
		m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
