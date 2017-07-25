import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Char1 {
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		char ch;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter a character: ");
		ch=(char)br.read();
		
		if(Character.isLetter(ch))
			System.out.println("The character is letter");
		else if(Character.isDigit(ch))
			System.out.println("The character is digit");
		else
			System.out.println("Other character");
	}
}