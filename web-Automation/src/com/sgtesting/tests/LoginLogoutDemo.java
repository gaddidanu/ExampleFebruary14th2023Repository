package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		openbrowser();
		navigate();
		login();
		minimizewindow();
		logout();
		closeApplication();
	}
public static void openbrowser()
{
	try {


		System.setProperty("webdriver.chrome.driver",
		 "E:\\ExampleAutomation\\Automation\\web-Automation\\Lirary\\drivers\\chromedriver.exe");
		oBrowser= new ChromeDriver();
	} catch (Exception e) {
	e.printStackTrace();
	}
}
public static void navigate()
{
	try {
		oBrowser.get("http://localhost:81/user/submit_tt.do");
		Thread.sleep(5000);

	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void login()
{
	try {
		
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(5000);

	} catch (Exception e) {
	e.printStackTrace();
	}
}

public static void minimizewindow()
{
	try {
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(5000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void logout()
{
	try {
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(5000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	private static void closeApplication()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
