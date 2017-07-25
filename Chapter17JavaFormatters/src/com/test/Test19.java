package com.test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.SynchronousQueue;

public class Test19 {

	public void loadResourceBundle(){
		ResourceBundle resource=ResourceBundle.getBundle("Greeting",Locale.US);
		//System.out.println(resource.getString("1"));
		System.out.println(resource.getString("HELLO_MSG"));
	}
	public static void main(String[] args) {
		new Test19().loadResourceBundle();
	}

}
