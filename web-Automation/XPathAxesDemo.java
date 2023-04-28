package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryBasedOnPersonSachinTendulkar();
	//	enterSalaryfor2ndPersonBasedOnRahulDravid();
	//	makeStatusAsActiveForIndianFreedomFighter();
		makeStatusAsActiveForPersonWhoIsPreviousToRahul();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///E:/HTML/WebTableHTML.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 1: following-sibling
	 * Description: Based On Person Sachin Tendulkar,Enter the Salary
	 */
	private static void enterSalaryBasedOnPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}

	/**
	 * Case 2: following
	 * Description: Based On Person Rahul Dravid,Enter the Salary for 2nd Person
	 */
	private static void enterSalaryfor2ndPersonBasedOnRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("25000");
	}
	
	/**
	 * Case 3: preceding-sibling
	 * Description: Make the status as Active for Indian Freedom Fighter
	 */
	private static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding::td[1]/input")).click();
	}
	
	/**
	 * Case 4: preceding
	 * Description: Make the status as Active for Person Who is Previous to Rahul Dravid
	 */
	private static void makeStatusAsActiveForPersonWhoIsPreviousToRahul()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
}
