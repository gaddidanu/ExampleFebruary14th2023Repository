package com.sgtesting.pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrwoser)
	{
		PageFactory.initElements(oBrwoser,this);
	}
	
	private WebElement username;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	private WebElement pwd;
	
	public WebElement getPassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(linkText="Logout")
	
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}

