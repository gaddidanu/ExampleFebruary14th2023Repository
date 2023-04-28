package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifyUser {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser();
		modifyuser();
		delete();
		logout();
		closeApp();
	}
	private static void launchBrowser()
	{
		try
		{
			
			//System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createUser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("shrek1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("kiragi");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("shrek1@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("shrek1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("shrek1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("shrek1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		public static void modifyuser()
		{
			try {
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[3]/span")).click();
				Thread.sleep(3000);	
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void delete()
		{
			try {

				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.className("userNameContainer")).click();
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Alert alrt=oBrowser.switchTo().alert();
				String content=alrt.getText();
				System.out.println(content);
				alrt.accept();
				Thread.sleep(3000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void closeApp()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
