
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello");
		System.out.println(str);
		str.concat("World");
		System.out.println(str);
		System.out.println(str.length());
		
		
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
