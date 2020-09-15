package com.dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	
	@Test
	@Parameters({"username","password"})
	 public static void loginTest(String username, String password) {
		 System.out.println("username is:"+username);
		 System.out.println("username is:"+password);
		 
	 }
	
//	@Test(priority = 1)
//	public void test() {
//		ParameterExample.loginTest("ravi", "pwd");
//	}

}
