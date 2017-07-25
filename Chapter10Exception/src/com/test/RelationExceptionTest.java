package com.test;

public class RelationExceptionTest {

	public void verifyArrayIndex(int arr[])
	{
		for(int i=0;i<3;i++)
		{
			if(arr[i]>100)
				throw new ArrayIndexOutOfBoundsException();
		}
	}
	public static void main(String[] args) {
		int arr[]={105,22,34};
		try{
			new RelationExceptionTest().verifyArrayIndex(arr);
		}/*catch (ArrayIndexOutOfBoundsException| MarksOutOfBoundsException e) {
			
		}*/
		catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println("Marks out of Bound");
		}
	}

}
