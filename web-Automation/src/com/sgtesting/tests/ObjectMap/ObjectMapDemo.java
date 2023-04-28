package com.sgtesting.tests.ObjectMap;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMapDemo {
Properties prop=null;

	public ObjectMapDemo(String filepath)
	{
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(filepath);
			prop=new Properties();
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try {
			String locator=prop.getProperty(logicalname);
			System.out.println(locator);
			String locatorDetails[]=locator.split(";");
			String locatorename=locatorDetails[0];
			String locatorevalue=locatorDetails[1];
	 
			switch(locatorename.toLowerCase())
			{
			case "id":
				by=By.id(locatorevalue);
				break;
			case "name":
				by=By.name(locatorevalue);
				break;
			case "classname":
				by=By.className(locatorevalue);
				break;
			case "xpath":
				by=By.xpath(locatorevalue);
				break;
			case "cssselector":
				by=By.cssSelector(locatorevalue);
				break;
			case "linktext":
				by=By.linkText(locatorevalue);
				break;
			case "tagname":
				by=By.tagName(locatorevalue);
				break;
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return by;
	}
}
