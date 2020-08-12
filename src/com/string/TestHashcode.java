package com.string;

public class TestHashcode {
	
	public int TestHashcode() {
		return 1;
	}

	public static void main(String[] args) {
		
		TestHashcode h1=new TestHashcode();
		TestHashcode h2=new TestHashcode();
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
//		TestHashcode h3=new TestHashcode();
//		TestHashcode h4=h3;
//		
//		System.out.println(h3.hashCode());
//		System.out.println(h4.hashCode());
		
	}

}
