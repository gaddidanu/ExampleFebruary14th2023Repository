package com.sgtesting.User;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class User {
	@Test
	public void CreateUser()
	{
		System.out.println("the Usr demouser1 ha deleted successfully");
	}
	@BeforeClass
	public void setup()
	{
		System.out.println("Launch browser, avigate URL and LOogin into the Application");
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Login from the Application and Close the Application");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	}



}
