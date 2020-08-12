package com.string;

public class testString1 {

	public static void main(String[] args) {
//		String s1="shah";
//		String s2="shah";
//		String s3="shah";
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println("*********");
//
//		s2="rukh";
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println("*********");
//
//		s3="khan";
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println("*********");

		String s="i love india";
		System.out.println("lenghth of the string is: "+s.length());
		System.out.println("Index value of o is: "+s.indexOf('o'));
		System.out.println("Index value of i is: "+s.indexOf('i')); //First occurrence  of I
		System.out.println("Index value of i is: "+s.lastIndexOf('i')); //Last occurrence  of I
		System.out.println("Index value of i after 1st occurence is: "+s.indexOf('i', 1)); // After the given index (1)
		System.out.println("character at 5th index is: "+s.charAt(5));
		System.out.println("Is string value start with i: "+s.startsWith("i"));
		System.out.println("Is string value ends with: "+s.endsWith("i"));
		System.out.println("Convert string to lower case: "+s.toLowerCase());
		System.out.println("Convert string to upeer case: "+s.toUpperCase());
		System.out.println("Print sub string after 3rd index: "+s.substring(3));
		System.out.println("Print sub string inclusing 3rd and exclusing 5th index: "+s.substring(3, 5)); // (inclusive, exclusive)
	}

}
