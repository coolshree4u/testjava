package com.tution;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.tution.S7.L2;
import com.tution.S7.L3;

public class S8 extends JFrame{
	Container c;
	JTextField txt1;
	JButton btn1;
	JLabel lbl1, lbl2;

	public S8() {
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
		this.addWindowListener(new L4());
	}

	public static void main(String[] args) {

		S8 frm = new S8();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 200, 250, 150);
		frm.setVisible(true);
		frm.setTitle("Square Finder");
	}

	public class L3 implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
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
		}

		@Override
		public void keyReleased(KeyEvent e) {
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
	
	public class L4 implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			JOptionPane.showMessageDialog(c, "Welcome to the square calculator");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			int output= JOptionPane.showConfirmDialog(c, "Do you want to Exit");
			if (output== JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}

		@Override
		public void windowClosed(WindowEvent e) {
		}

		@Override
		public void windowIconified(WindowEvent e) {
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
		}

		@Override
		public void windowActivated(WindowEvent e) {
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
		}
		
	}
	
}
