import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String s;
		s=br.readLine();
		a=Integer.parseInt(s);
		
		System.out.println("Entered Value is "+a);
	}

}
