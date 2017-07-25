package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JarDemo {

	public static void f1(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter a no");
			double num=Double.parseDouble(br.readLine());
			double result=num*num;
			System.out.println("Result = "+result);
		} catch (IOException e) {
			System.out.println("IO error");
		}
		catch (NumberFormatException e) {
		System.out.println("Wrong Data");
		}
	}
}
