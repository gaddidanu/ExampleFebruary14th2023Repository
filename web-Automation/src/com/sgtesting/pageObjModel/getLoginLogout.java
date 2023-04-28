package com.sgtesting.pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLoginLogout {
public static WebDriver oBrowser=null;
public static ActiTimePage oPage=null;
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
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUsername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
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
			oPage.getLogout().click();
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
