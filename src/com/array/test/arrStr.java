package com.array.test;

public class arrStr {

	public static void main(String[] args) {
		String s="I love india and it is great country";
		System.out.println(s.length());
		String[] rv=s.split(" ");
		for (int j = 0; j < rv.length; j++) {
			System.out.println(rv[j]);
		}
		System.out.println("**************");
		String s1="I+love+you+and+your+family";
		String[] rv1=s1.split("\\+");
		for (int j = 0; j < rv1.length; j++) {
			System.out.println(rv1[j]);
		}
	}
}
