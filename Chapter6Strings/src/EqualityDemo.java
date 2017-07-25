
public class EqualityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		
		if(s1 == s2)
			System.out.println("Equal by reference");
		else
			System.out.println("Not Equal By reference");
		
		if(s1.equals(s2))
			System.out.println("Equal by content");
		else
			System.out.println("Not equal by content");
		
		if(s1==s3)
			System.out.println("Equal by reference");
		else
			System.out.println("Not equal by reference");
		
		if(s1.equals(s3))
			System.out.println("Equal by content");
		else
			System.out.println("Not equal by content");
		
	}

}
