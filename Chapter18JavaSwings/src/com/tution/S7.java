package com.tution;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class S7 extends JFrame {

	Container c;
	JTextField txt1;
	JButton btn1;
	JLabel lbl1, lbl2;

	public S7() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		lbl1 = new JLabel("Enter a number");
		txt1 = new JTextField(10);
		btn1 = new JButton("Answer");
		lbl2 = new JLabel();

		c.add(lbl1);
		c.add(txt1);
		c.add(btn1);
		c.add(lbl2);
		btn1.addActionListener(new L2());
		btn1.addKeyListener(new L3());
	}

	public static void main(String[] args) {

		S7 frm = new S7();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 200, 250, 150);
		frm.setVisible(true);
		frm.setTitle("Square Finder");
	}

	public class L3 implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
			if (e.getKeyCode() == 1) {
				try {
					int a = Integer.parseInt(txt1.getText());
					float s = a * a;
					lbl2.setText("Square = " + s);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(c, "Please enter integer");
					txt1.setText(" ");
					txt1.requestFocus();
					lbl2.setText("");
				}
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 1) {
				try {
					int a = Integer.parseInt(txt1.getText());
					float s = a * a;
					lbl2.setText("Square = " + s);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(c, "Please enter integer");
					txt1.setText(" ");
					txt1.requestFocus();
					lbl2.setText("");
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == 1) {
				try {
					int a = Integer.parseInt(txt1.getText());
					float s = a * a;
					lbl2.setText("Square = " + s);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(c, "Please enter integer");
					txt1.setText(" ");
					txt1.requestFocus();
					lbl2.setText("");
				}
			}
		}

	}

	public class L2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int a = Integer.parseInt(txt1.getText());
			float s = a * a;
			lbl2.setText("Square = " + s);
		}

	}
}
