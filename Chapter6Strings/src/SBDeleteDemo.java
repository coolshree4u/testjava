
public class SBDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Java is Super-Kool");
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.delete(2, 8);
		System.out.println(sb);
		
	}

}
