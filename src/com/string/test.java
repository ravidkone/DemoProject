package com.string;

public class test {
	
	int i;
	test(int i){
		this.i=i;
	}
	public String toString() {
		return "i= "+i; //overriding "toString" method
	}
	public static void main(String[] args) {

		test t=new test(10);
		System.out.println(t); // implicit invocation to "toString" method
		
		test t1=new test(20);
		System.out.println(t1);// implicit invocation to "toString" method
		

	}
}
