package com.string;

public class testString {

	public static void main(String[] args) {

		String s1=new String("water melon");
		String s2="water melon";
		
		String s3="water";
		String s4="melon";
		
		String s5="water"+" melon";
		String s6=s3+" melon";
		
		System.out.println(s1==s2);
		System.out.println(s2==s5);
		System.out.println(s1==s6);

	}
}
