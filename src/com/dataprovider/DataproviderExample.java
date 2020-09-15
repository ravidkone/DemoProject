package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {
	
	@Test(dataProvider = "getData")
	public void setData(String username, String pwd) {
		System.out.println("Your username is:"+username);
		System.out.println("Your password is:"+pwd);
	}

	@Test(dataProvider = "ravi")
	public void setData1(String username, String pwd) {
		System.out.println("Your username is:"+username);
		System.out.println("Your password is:"+pwd);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data=new Object[3][2];
		
		//1st row
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		//2nd row
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		//3rd row
		data[2][0]="user3";
		data[2 ][1]="pwd3";

		return data;
		
	}
	
	@DataProvider(name="ravi")
	public Object[][] getData1(){
		
		Object[][] data=new Object[3][2];
		
		//1st row
		data[0][0]="user11";
		data[0][1]="pwd11";
		
		//2nd row
		data[1][0]="user21";
		data[1][1]="pwd12";
		
		//3rd row
		data[2][0]="user31";
		data[2 ][1]="pwd31";

		return data;
		
	}
}
