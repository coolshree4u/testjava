package com.tution;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class L1 extends JFrame{
	Container c;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	String s1,s2;
	
	public L1() {
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField(20);
		p1= new JPasswordField(20);
		p1.setEchoChar('*');
		b1=new JButton("Submit");
		b2=new JButton("Exit");
		
		l1.setBounds(100,100,80,30);
		t1.setBounds(200,100,80,30);
		l2.setBounds(100, 150, 80, 30);
		p1.setBounds(200, 150, 80, 30);
		b1.setBounds(100, 200, 80, 30);
		b2.setBounds(200, 200, 80, 30);
		
		c.add(l1);
		c.add(l2);
		c.add(t1);
		c.add(p1);
		c.add(b1);
		c.add(b2);
		
		b1.addActionListener(new A1());
		b2.addActionListener(new A1());
		
	}

	public static void main(String args[]){
		L1 l1=new L1();
		l1.setSize(400,400);
		l1.setLocation(200, 200);
		l1.setTitle("Login Form");
		l1.setVisible(true);
		l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class A1 implements ActionListener{
		String s1,s2;
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()== b1){
				s1=t1.getText();
				s2=p1.getText();
				
				if(s1.equals("abhishek") && s2.equals("123")){
					JOptionPane.showMessageDialog(c, "Successful Login");
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(c, "UnSuccessful Login");
					t1.setText("");
					p1.setText("");
					t1.requestFocus();
				}
			}
			else {
				System.exit(1);
			}
		}
		
	}
}
