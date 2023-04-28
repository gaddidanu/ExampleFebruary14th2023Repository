package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginlogoutfirefox {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		logout();
		closeApplication();
	}
	
	public static void launchBrowser()
	{
		try {
			oBrowser=new FirefoxDriver();
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
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void minimize()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);;
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
