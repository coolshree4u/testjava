package com.tution;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sw12 extends JFrame {

	Container c;
	JRadioButton rb1, rb2, rb3, rb4;
	JCheckBox cb1, cb2, cb3, cb4, cb5;
	ButtonGroup bg1, bg2;
	JPanel p1, p2, p3, p4;
	JButton b1;

	public Sw12() {
		c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBorder(BorderFactory.createTitledBorder("Bread Type"));
		rb1 = new JRadioButton("Wheat Bread(Rs. 10.00)");
		rb2 = new JRadioButton("Multigren Bread(Rs. 15.00)");
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);

		p1.add(rb1);
		p1.add(rb2);
		c.add(p1);

		p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.setBorder(BorderFactory.createTitledBorder("Butter Type"));
		rb3 = new JRadioButton("Amul Butter(Rs. 10.00)");
		rb4 = new JRadioButton("Peanut Butter(Rs. 15.00)");
		bg2 = new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);

		p2.add(rb3);
		p2.add(rb4);
		c.add(p2);

		p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.setBorder(BorderFactory.createTitledBorder("Ingredients"));
		cb1 = new JCheckBox("Tomatoes (Rs 5.00)");
		cb2 = new JCheckBox("Onions (Rs 5.00)");
		cb3 = new JCheckBox("Cucumber (Rs 5.00)");
		cb4 = new JCheckBox("Potatoes (Rs 5.00)");
		cb5 = new JCheckBox("Bell Peppers (Rs .00)");
		p3.add(cb1);
		p3.add(cb2);
		p3.add(cb3);
		p3.add(cb4);
		p3.add(cb5);
		c.add(p3);

		p4 = new JPanel();
		b1 = new JButton("Submit");
		b1.addActionListener(new L1());
		p4.add(b1);
		c.add(p4);

	}

	public static void main(String[] args) {
		Sw12 s = new Sw12();
		s.setSize(500, 300);
		s.setLocation(200, 200);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setTitle("Sandwitch Order");
	}

	class L1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double total = 0;
			String order = "";
			order += "1)";

			if (rb1.isSelected()) {
				order += rb1.getText() + " ";
				total += 10.00;
			}
			if (rb2.isSelected()) {
				order += rb2.getText() + " ";
				total += 15.00;
			}

			order += "2)";

			if (rb3.isSelected()) {
				order += rb3.getText() + " ";
				total += 10.00;
			}
			if (rb4.isSelected()) {
				order += rb4.getText() + " ";
				total += 15.00;
			}

			order += "3)";

			if (cb1.isSelected()) {
				order += cb1.getText() + " ";
				total += 5.00;
			}
			if (cb2.isSelected()) {
				order += cb2.getText() + " ";
				total += 5.00;
			}

			if (cb3.isSelected()) {
				order += cb3.getText() + " ";
				total += 5.00;
			}
			if (cb4.isSelected()) {
				order += cb4.getText() + " ";
				total += 5.00;
			}
			
			JOptionPane.showMessageDialog(c, order+" Rs. "+total);
		}

	}
}
