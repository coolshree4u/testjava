package com.tution;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class S2 extends JFrame{

	Container c;
	JTextField txt1;
	JButton btn1;
	JLabel lbl1, lbl2;

	public S2() {
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
		btn1.addActionListener(new L3());

	}

	public static void main(String[] args) {

		S1 frm = new S1();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200, 200, 250, 150);
		frm.setVisible(true);
		frm.setTitle("Square Finder");
	}

	public class L3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try{
				int a =Integer.parseInt(txt1.getText());
				float s=a*a;
				lbl2.setText("Square = "+s);	
			}catch (NumberFormatException ne) {
				JOptionPane.showMessageDialog(c, "Please Enter a number");
				txt1.setText("");
				txt1.requestFocus();
				lbl2.setText("");
			}
		}
	}
}
