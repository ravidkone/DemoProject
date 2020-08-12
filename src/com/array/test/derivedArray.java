package com.array.test;

public class derivedArray {

	public static void main(String[] args) {
		
		derivedArray[] ref=new derivedArray[4];
		ref[0]= new derivedArray();
		ref[1]= new derivedArray();
		ref[2]= new derivedArray();
		ref[3]= new derivedArray();
	//	ref[4]= new derivedArray(); //Can't add as the size is 4
		System.out.println(ref[0]);
		System.out.println(ref[3]);
		System.out.println("*************");
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		} 
		System.out.println("*************");
		for (derivedArray derivedArray : ref) {
			System.out.println(derivedArray);
		}
	}
}
