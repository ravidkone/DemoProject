package com.string;

public class reverseString {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println("Length of the string is: "+s.length());
		System.out.println("Original string is: "+s);
		System.out.println("Reverse string is: ");
		
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("********");
		String str="&^%$ravu9876GFHJ(*&^*(";		
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);
		
		System.out.println("******");
		String str1="ravi kone";
		str1.replace("ravi","kiran");
		System.out.println(str1);
	}

}
