package com.sgtesting.pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeCreatUser {

	public ActTimeCreatUser(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
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
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement userselect;
	
	public WebElement getuser()
	{
		return userselect;
	}
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement cruser;
	
	public WebElement seluser()
	{
		return cruser;
	}
private WebElement firstName;
	
	public WebElement getFname()
	{
		return firstName;
	}
private WebElement lastName;
	
	public WebElement getLname()
	{
		return lastName;
	}
private WebElement email;
	
	public WebElement getemail()
	{
		return email;
	}
private WebElement userDataLightBox_usernameField;
	
	public WebElement getUsname()
	{
		return userDataLightBox_usernameField;
	}
private WebElement userDataLightBox_passwordField;
	
	public WebElement getpasswrd()
	{
		return userDataLightBox_passwordField;
	}
private WebElement userDataLightBox_passwordCopyField;
	
	public WebElement getpasswrdcopy()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement crUsBt;
	public WebElement getUsBt()
	{
		return crUsBt;
	}
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[3]/span")
	private WebElement modichk;
	public WebElement modify1()
	{
		return modichk;
	}
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[3]/span")
	private WebElement modific;
	public WebElement getmodify()
	{
		return modific;
	}
	
	@FindBy(xpath="//*[@id=\\'topnav\\']/tbody/tr[1]/td[5]/a")
	private WebElement deli;
	public WebElement delitt()
	{
		return deli;
	}
	private WebElement userNameContainer;
	public WebElement seldel()
	{
		return userNameContainer;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdelbt()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(linkText="Logout")
	
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}


}
