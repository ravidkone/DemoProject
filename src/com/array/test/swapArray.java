package com.array.test;

public class swapArray {

	public static void main(String[] args) {

		int[] arr= {10,20};
		System.out.println("Before SWAP");
		for (int i : arr) {
			System.out.println(i);
		}
		swap(arr);
		System.out.println("After SWAP");
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void swap(int[] obj) {
		int temp=obj[0];
		obj[0]=obj[1];
		obj[1]=temp;
		
	}
}
