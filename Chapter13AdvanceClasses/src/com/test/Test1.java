package com.test;

public class Test1 {
	public enum Dogs {
		collie, harrier, shepherd
	};

	public static void main(String[] args) {
		        // TODO code application logic here
		        Dogs myDog=Dogs.shepherd;
		switch(myDog)
		{
		    case collie:
		        System.out.print("collie");
		    
		    case harrier:
		        System.out.println("harrier");
		    default:
		    	System.out.println("retriever");
		        
		        //case default:
		      //  System.out.print("retriever");  
		}
		    }

}
