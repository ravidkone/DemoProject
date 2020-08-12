package com.array.test;

public class sampleArray {

	public static void main(String[] args) {
		
		int[] arr= {20,30,30,40,50};
		System.out.println("Length is: "+arr.length);
		for (int i : arr) {
			System.out.println(i);
		}
		
		int[] a=new int[] {1,2,5,4,7};
		System.out.println("Length is: "+a.length);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
