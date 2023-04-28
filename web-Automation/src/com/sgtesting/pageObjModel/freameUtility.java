package com.sgtesting.pageObjModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class freameUtility {


		public static boolean isFreamPresent(WebDriver oBrowser)
		{
			boolean status=true;
			try {
				List<WebElement> oFreams=oBrowser.findElements(By.tagName("iframe"));
				status=(oFreams.size()>0);
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		public static boolean FreamControl(WebDriver oBrowser,String name)
		{
			boolean status=false;
			try {
				oBrowser.switchTo().frame(name);
				status=true;
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		public static boolean FreamControlW(WebDriver oBrowser,WebElement oEle)
		{
			boolean status=false;
			try {
				oBrowser.switchTo().frame(oEle);
				status=true;
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		public static boolean FreamControl(WebDriver oBrowser,int index)
		{
			boolean status=false;
			try {
				oBrowser.switchTo().frame(index);
				status=true;
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		
		public static int getFreamCount(WebDriver oBrowser)
		{ int count=0;
			try {
				List<WebElement> oFreams=oBrowser.findElements(By.tagName("iframe"));
				count=oFreams.size();
			} catch (Exception e) {
				count=-1;
			}
			return count;
		}
		//Switch to frame using webElement
		
		public static boolean isFreamPresent(WebDriver oBrowser,WebElement oEle)
		{
			boolean status=false;
			
			try {
				oBrowser.switchTo().frame(oEle);
				status=true;
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		/**
		 * switch to frame using frame name
		 */
		public static boolean isFreamPresent(WebDriver oBrowser,String name)
		{
			boolean status=false;
			
			try {
				oBrowser.switchTo().frame(name);
				status=true;
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		/**
		 * switch to frame using index
		 */
		public static boolean isFreamPresent(WebDriver oBrowser,int index)
		{
			boolean status=true;
			
			try {
				oBrowser.switchTo().frame(index);
				status=true;
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
		public static boolean isPopupPresent(WebDriver oBrowser)
		{
			boolean status=false;
			try {
				int count=oBrowser.getWindowHandles().size()-1;
				if(count>0)
				{
					status=true;
				}
				
			} catch (Exception e) {
				status=false;
			}
			return status;
		}
	
		
		public static int Popupscount(WebDriver oBrowser)
		{
			int count=0;
			try {
				count=oBrowser.getWindowHandles().size()-1;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return count;
		}
		
		
		public static boolean isAlertpresent(WebDriver oBrowser)
		{
			boolean status=false;
			try {
				
				oBrowser.switchTo().alert();
				status=true;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return status;
			
		}
		public static boolean isGUIElementpresent(WebDriver oBrowser,By by)
		{
			boolean status=false;
			
			try {
				
				status=oBrowser.findElement(by).isDisplayed();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		
	}


