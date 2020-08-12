package com.array.test;

import java.util.Arrays;

public class intArray {

	public static void main(String[] args) {

		int[] intArr = new int[5];

//		for (int j : intArr) {
//			System.out.println("value is:" + j); // As we haven't stored any value, it will stored ZERO by default.
//		}
		intArr[0] = 50;
		intArr[1] = 40;
		intArr[2] = 30;
		intArr[3] = 20;
		intArr[4] = 10;

//		System.out.println("Lengh of array is " + intArr.length);
//		System.out.println("0 index value is: " + intArr[0]);
//
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.println(i + "th value is: " + intArr[i]);
//		}
//		System.out.println("Before SORT");
//		for (int j : intArr) {
//			System.out.println(j);
//		}
		Arrays.sort(intArr);
		System.out.println("After SORT");
		for (int j : intArr) {
			System.out.println(j);
		}
		System.out.println("Binary search");
		System.out.println(Arrays.binarySearch(intArr, 40));
		System.out.println(Arrays.binarySearch(intArr, 1));
		System.out.println(Arrays.binarySearch(intArr, 5));
		System.out.println(Arrays.binarySearch(intArr, 15));
		System.out.println(Arrays.binarySearch(intArr, 25));
		System.out.println(Arrays.binarySearch(intArr, 35));
		System.out.println(Arrays.binarySearch(intArr, 90));
		System.out.println(Arrays.binarySearch(intArr, 190));


	}
}
