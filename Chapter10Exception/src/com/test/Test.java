package com.test;

public class Test {

	public void verify(int arr[]) {
		for (int i = 1; i <= 3; i++) {
			if (arr[i] > 100)
				throw new MarksOutOfBoundsException();
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int arr[]={175,23,34,45};
			new Test().verify(arr);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
