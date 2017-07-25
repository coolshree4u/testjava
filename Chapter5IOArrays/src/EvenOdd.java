import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String s;
		System.out.println("Enter a no.");
		s=br.readLine();
		a=Integer.parseInt(s);
		
		if(a%2==0)
			System.out.println("Even No.");
		else
			System.out.println("Odd No.");
	}

}
