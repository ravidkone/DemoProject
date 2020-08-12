package com.string;

public class TestEquals {
	
	int id;
	String name;
	
	TestEquals(int id,String name){
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) { //java.lang.Object
		
			TestEquals ts=(TestEquals)obj;
			if(this.id==ts.id) {
				return true;
			}else {
				return false;
			}
	}
	public static void main(String[] args) {
		TestEquals e1=new TestEquals(10,"ram");
		TestEquals e2=new TestEquals(10,"ramesh");
		System.out.println(e1.equals(e2)); 
		TestEquals e3=new TestEquals(10,"ram");
		TestEquals e4=new TestEquals(20,"ramesh");
		System.out.println(e3.equals(e4)); 
	}

}
