package com.sgtesting.tests.ObjectMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageObjModel.ActiTimePage;

public class loginLogoutExcel {
	public static WebDriver oBrowser=null;
	public static UsingExcelObjMap objmap=null;
	public static void main(String[] args) {
		openbrowser();
		navigate();
		login();
		logout();
		getclose();
	}
	
	public static void openbrowser()
	{
		try 
		{
			oBrowser= new ChromeDriver();
			String filename="E:\\ExampleAutomation\\Automation\\web-Automation\\Lirary\\objectmap.xlsx";
			objmap=new UsingExcelObjMap(filename);
		} catch (Exception e) 
		{
		e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(5000);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login()
	{
		try
		{
			oBrowser.findElement(objmap.GetLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.GetLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.GetLocator("loginpageloginbtn")).click();
		Thread.sleep(5000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

	public static void logout()
	{
		try
		{
			oBrowser.findElement(objmap.GetLocator("homepagelogoutlnk")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void getclose()
	{
		try
		{
			oBrowser.close();
			
		} catch (Exception e) 
		{
	e.printStackTrace();
		}
	}

	

}
