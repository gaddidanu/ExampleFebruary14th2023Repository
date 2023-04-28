package com.sgtesting.pageObjModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createuserPagOb {
private static WebDriver oBrowser=null;
private static ActTimeCreatUser actus1=null;
	public static void main(String[] args) {
		openbrows();
		navigate();
		login();
		creatuser();
		//modific();
		deleUser1();
		logout();
		getclose();
	}
	public static void openbrows()
	{
		try {
			
		
		oBrowser=new ChromeDriver();
		actus1=new ActTimeCreatUser(oBrowser);
		}catch(Exception e)
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
			actus1.getUsername().sendKeys("admin");
			actus1.getPassword().sendKeys("manager");
			actus1.getLogin().click();
		Thread.sleep(5000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void creatuser()
	{
		try {
			actus1.getuser().click();
			Thread.sleep(3000);
			
			actus1.seluser().click();
			Thread.sleep(4000);
			actus1.getFname().sendKeys("monu");
			actus1.getLname().sendKeys("b");
			actus1.getemail().sendKeys("monu@gmail.com");
			actus1.getUsername().sendKeys("monu1");
			actus1.getpasswrd().sendKeys("shal1");
			actus1.getpasswrdcopy().sendKeys("shal1");
			actus1.getUsBt().click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void modific()
	{
		try {
			actus1.modify1().click();
			Thread.sleep(2000);
			actus1.getmodify().click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleUser1()
	{
		try {
			
			actus1.delitt().click();
			Thread.sleep(3000);
			actus1.seldel().click();
			Thread.sleep(3000);
			actus1.getdelbt().click();
			Thread.sleep(4000);
			Alert altrs=oBrowser.switchTo().alert();
			String s=altrs.getText();
			System.out.println(s);
			altrs.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logout()
	{
		try
		{
			actus1.getLogout().click();
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
