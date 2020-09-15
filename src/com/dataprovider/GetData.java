package com.dataprovider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetData {

	@BeforeMethod
	public void login() {
		System.out.println("Logged in to Web");
	}
	
	@DataProvider 
	public Object[][] retriveData() {
		
	Object data[][]=GetExcelData.provideExceldata("userdata");
	return data;
	}
	
	@Test(dataProvider = "retriveData")
	public void fillForm(String username, String password, String domain, String dept) {
		System.out.println("Username is: "+username);
		System.out.println("Password is: "+password);
		System.out.println("Domain is: "+domain);
		System.out.println("Dept is: "+dept);

	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logged out from web");
	}
}
