package com.tution;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;

public class M1 extends JFrame {
	Container c;
	JButton b1, b2;

	class L1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1)
				JOptionPane.showMessageDialog(c, "You have clicked button1");

			if (e.getSource() == b2)
				JOptionPane.showMessageDialog(c, "You have clicked button2");
		}

	}

	public M1() {
		c = getContentPane();

		c.setLayout(new FlowLayout());
		b1 = new JButton("Click 1");
		b2 = new JButton("Click 2");

		c.add(b1);
		c.add(b2);

		L1 a=new L1();
		b1.addActionListener(a);
		b2.addActionListener(a);
	}

	public static void main(String[] args) {
		M1 m1=new M1();
		m1.setSize(500, 500);
		m1.setTitle("Button click");
		m1.setVisible(true);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
