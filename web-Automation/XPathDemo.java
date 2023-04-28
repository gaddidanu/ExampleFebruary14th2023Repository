package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXPathUsingTagName();
	//	relativeXPathUsingTagNamewithIndex();
	//	relativeXPathUsingTagNamewithAttributeNameValue();
	//	relativeXPathUsingTagNamewithMultipleAttributeNameValue();
	//	relativeXPathUsingTagNamewithMultipleAttributeNameValueUsingOROperator();
	//	relativeXPathUsingTagNamewithMultipleAttributeNameValueUsingAndOperator();
	//	relativeXPathUsingAttributeNameValue();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_1();
	//	relativeXPathUsingTagNameWithAttributeName_2();
	//	relativeXPathUsingTagNameWithAttributeName_3();
	//	partialMatchingOfAttributeValue();
	//	relativeXPathUsingTextContent();
		relativeXPathUsingPartialTextTextContent();
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
			oBrowser.get("file:///E:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify the Element based on tagName
	 * Syntax: //<tagName>
	 */
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 2: Identify the Element based on tagName
	 *         with index
	 * Syntax: //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNamewithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify the Element based on tagName
	 *         with attributeName and value combination
	 * Syntax: //<tagName>[@attributeName='attributeValue']
	 */
	private static void relativeXPathUsingTagNamewithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("NewPasswordDemo");
	}
	
	/**
	 * Case 4: Identify the Element based on tagName
	 *         with Multiple attributeName and value combination
	 * Syntax: //<tagName>[@attributeName='attributeValue'][@attributeName='attributeValue']
	 */
	private static void relativeXPathUsingTagNamewithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1'][@class='pass1word1']")).sendKeys("TestingUser1");
	}
	
	/**
	 * Case 5: Identify the Element based on tagName
	 *         with Multiple attributeName and value combination
	 *         Using or operator
	 * Syntax: //<tagName>[@attributeName='attributeValue' or @attributeName='attributeValue']
	 */
	private static void relativeXPathUsingTagNamewithMultipleAttributeNameValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1' or @class='pass1word1']")).sendKeys("TestingUser1");
	}
	
	/**
	 * Case 6: Identify the Element based on tagName
	 *         with Multiple attributeName and value combination
	 *         Using or operator
	 * Syntax: //<tagName>[@attributeName='attributeValue' or @attributeName='attributeValue']
	 */
	private static void relativeXPathUsingTagNamewithMultipleAttributeNameValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1' and @id='pwd1pass1word1']")).sendKeys("welcomeUser1");
	}
	
	/**
	 * Case 7: Identify the Element based on Irrespective of tagName
	 *         with attributeName and value combination
	 * Syntax: //*[@attributeName='attributeValue']
	 */
	private static void relativeXPathUsingAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@id='btn1submit1button1']")).click();
	}
	
	/**
	 * Case 8: Identify the Element based on Irrespective of tagName
	 *         with Irrespective of attributeName and only value
	 * Syntax: //*[@attributeName='attributeValue']
	 */
	private static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='btn1submit1button1']")).click();
	}
	
	/**
	 * Case 9: Identify the Element based on tagName
	 *         with attributeName alone
	 * Syntax: //<tagName>[@attributeName]
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		try
		{
			//Find out numbers of Link Available
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			System.out.println("# of Links :"+linkscount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_1()
	{
		try
		{
			//Display Link Names
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String linkname=link.getText();
				System.out.println(linkname);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_2()
	{
		try
		{
			//Click operation on Link, Its name ends with "Apache"
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String linkname=link.getText();
				if(linkname.endsWith("Apache"))
				{
					link.click();
					break;
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_3()
	{
		try
		{
			//Reproducing the StaleElementReferenceException
			//org.openqa.selenium.StaleElementReferenceException: stale element reference: 
			//element is not attached to the page document
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String linkname=link.getText();
				if(linkname.endsWith("Testing"))
				{
					link.click();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 10: Identify the Element based on partial matching of AttibuteValue
	 * Syntax: 
	 * starts-with(@attributename,attributeValue)
	 * ends-with(@attributename,attributeValue)
	 * contains(@attributename,attributeValue)
	 * //<tagName>[starts-with(@attributename,attributeValue)]
	 * //<tagName>[ends-with(@attributename,attributeValue)]
	 * //<tagName>[contains(@attributename,attributeValue)]
	 * 			 
	 */
	private static void partialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	}
	
	/**
	 * Case 11: Identify the Element based on text Content
	 * Syntax: //<tagName>[text()='content']
	 */
	private static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Eclipse Tool']")).click();
	}
	
	/**
	 * Case 12: Identify the Element based on Partial text Content
	 * Syntax:  
	 *  starts-with(test(),'content')
	 *  ends-with(test(),'content')
	 *  contains(test(),'content')
	 *  //<tagName>[starts-with(test(),'content')]
	 *  //<tagName>[ends-with(test(),'content')]
	 *  //<tagName>[contains(test(),'content')]
	 */
	private static void relativeXPathUsingPartialTextTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
	}
}
