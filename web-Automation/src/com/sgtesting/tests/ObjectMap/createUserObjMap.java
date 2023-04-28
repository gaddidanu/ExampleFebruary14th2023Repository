package com.sgtesting.tests.ObjectMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageObjModel.ObjectMapDemo;

public class createUserObjMap {
	private static WebDriver oBrowser=null;
	private static ObjectMapDemo om=null;
	public static void main(String[] args) {
		openbrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		DeleteUser();
		logout();
		closeApplication();
		
	}
	public static void openbrowser()
	{
		try {

			 System.setProperty("webdriver.chrome.driver",
			 "E:\\ExampleAutomation\\Automation\\web-Automation\\Lirary\\drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
			om=new ObjectMapDemo(".\\ObjectMap\\objectmap.properties");
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
			
			oBrowser.findElement(om.getLocator("logicusername")).sendKeys("admin");
			oBrowser.findElement(om.getLocator("logicpassword")).sendKeys("manager");
			oBrowser.findElement(om.getLocator("logicloginBtn")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	public static void minimizewindow()
	{
		try {
			oBrowser.findElement(om.getLocator("logicflywindow")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void createUser()
	{
		try {
			oBrowser.findElement(om.getLocator("clickUser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(om.getLocator("addnew")).click();
			Thread.sleep(3000);
			oBrowser.findElement(om.getLocator("addUFname")).sendKeys("reema1");
			oBrowser.findElement(om.getLocator("addULname")).sendKeys("kiragi");
			oBrowser.findElement(om.getLocator("addMail")).sendKeys("user1@gmail.com");
			oBrowser.findElement(om.getLocator("addUserName")).sendKeys("reema");
			oBrowser.findElement(om.getLocator("addPassword")).sendKeys("user1");
			oBrowser.findElement(om.getLocator("addPassCopy")).sendKeys("user1");
			Thread.sleep(3000);
			oBrowser.findElement(om.getLocator("clickCreate")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void modifyUser()
	{
		try {
			oBrowser.findElement(om.getLocator("modifyclicUser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(om.getLocator("modifypass")).sendKeys("deep");
			oBrowser.findElement(om.getLocator("modifypassConf")).sendKeys("deep");
			Thread.sleep(3000);
			oBrowser.findElement(om.getLocator("modifyclicOk")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void DeleteUser()
	{
		try
		{
			oBrowser.findElement(om.getLocator("modifyclicUser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(om.getLocator("ClickDel")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void logout()
	{
		try {
			oBrowser.findElement(om.getLocator("logiclogout")).click();
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
