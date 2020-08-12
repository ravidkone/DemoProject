package com.array.test;

public class objArray {

	public static void main(String[] args) {
		System.out.println("Start");
//		test(new int[] { 10, 20, 30, 40 });
		
		System.out.println("**********");
		int[] obj1=newtest();
		for (int i : obj1) {
			System.out.println(i);
		}
	}

	private static int[] newtest() {
		int[] arr= {1,2,3,5};
		return arr;
	}

//	private static void test(int[] obj) {
//		System.out.println("Length of array is: " + obj.length);
//		for (int i : obj) {
//			System.out.println(i);
//
//		}
//	}

}
