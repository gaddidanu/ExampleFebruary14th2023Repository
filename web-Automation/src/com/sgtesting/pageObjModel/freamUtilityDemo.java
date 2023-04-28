package com.sgtesting.pageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class freamUtilityDemo {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lauchBrows();
		navigate();
		handleFrame();
		//NestedhandleFream();
		//handlepopups();

	}
	public static void lauchBrows()
	{
		try
		{
		oBrowser=new ChromeDriver();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void navigate()
	{
		try {
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void handleFrame()
	{
		try {
			boolean v1=freameUtility.isFreamPresent(oBrowser);
			int count=(freameUtility.getFreamCount(oBrowser));
			if(v1)
			{
				System.out.println("frames have found "+count);
				
			}
			else
			{
				System.out.println("frames have not found");
			}
			WebElement oEle=oBrowser.findElement((By.xpath("//iframe[@title='All Packages']")));
			boolean status=freameUtility.FreamControlW(oBrowser, oEle);
			if(status)
			{
				oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void NestedhandleFream()
	{
		try {
			oBrowser.get("file:///E:/ExampleAutomation/Automation/web-Automation/parentFrameDemo.html");
			Thread.sleep(2000);

			WebElement oEle1=oBrowser.findElement(By.name("first"));
			WebElement oEle2=oBrowser.findElement(By.name("second"));
			boolean first1=freameUtility.FreamControlW(oBrowser,oEle1);
			if(first1)
			{
				boolean second1=freameUtility.FreamControlW(oBrowser,oEle2);
				if(second1)
				{
					oBrowser.findElement(By.id("uid1user1name1")).sendKeys("user1");
					oBrowser.findElement(By.id("pwd1pass1word1")).sendKeys("user1");
					oBrowser.findElement(By.id("btn1submit1button1")).click();
					Thread.sleep(3000);
					
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void handlepopups()
	{
		try {
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(3000);
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(4000);
			boolean v1=freameUtility.isPopupPresent(oBrowser);
			int count=freameUtility.Popupscount(oBrowser);
			System.out.println("popup count "+count);
			if(v1)
			{
				System.out.println("popup window is present");
			}
			else
			{
				System.out.println("popup window is not present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
