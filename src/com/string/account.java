package com.string;

public class account {
	
	String name;
	int balance;
	int AccNo;
	
	account(String name, int balance, int AccNo) {
		this.name=name;
		this.balance=balance;
		this.AccNo=AccNo;
	}
	
	
	public String toString(){
		return "Name is: "+name+" \nBalance is: "+balance+" \nAccount number: "+AccNo;
	}
	public static void main(String[] args) {
		account a=new account("ravi", 10000, 1234);
		System.out.println(a);
		System.out.println("*******************");
		account a1=new account("kiran", 20000, 5678);
		System.out.println(a1);
	}

}
