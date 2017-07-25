
public class Fmt1 {

	public static void main(String[] args) {
		int i=10;
		System.out.printf("|%d|%n",i);
		System.out.printf("|%5d|%n",i);
		System.out.printf("|%-5d|%n",i);
		System.out.printf("|%05d|%n",i);

		double d=10.3456;
		System.out.printf("#%.1f#%n",d);
		System.out.printf("#%.2f#%n",d);
		System.out.printf("#%.3f#%n",d);
		System.out.printf("#%8.2f#%n",d);
		System.out.printf("#%8.4f#%n",d);
		System.out.printf("#%2.3f#%n",d);
		System.out.printf("#%4.2f#%n",d);
		
		String s="Hello";
		System.out.printf("^%s^%n",s);
		System.out.printf("^%10s^%n",s);
		System.out.printf("^%-10s^%n",s);
	}
}