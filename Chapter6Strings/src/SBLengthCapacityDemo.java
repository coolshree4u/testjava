
public class SBLengthCapacityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer(10);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("How are you?");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		StringBuffer sb1=new StringBuffer("Shree");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
