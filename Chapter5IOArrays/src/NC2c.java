import java.io.Console;

public class NC2c {

	public static void main(String[] args) {
		Console c =System.console();
		String un;
		char[] pw;
		
		System.out.println("User Name");
		un=c.readLine();
		
		System.out.println("Pass Word");
		pw=c.readPassword();
	}
}