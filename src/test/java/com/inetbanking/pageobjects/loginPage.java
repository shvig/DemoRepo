package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;
	public loginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(name="btnReset")
	@CacheLookup
	WebElement btnReset;
	
	public void setUsername(String UName)
	{
		txtUsername.sendKeys(UName);
	}
	public void setPassword(String PWord)
	{
		txtPassword.sendKeys(PWord);
	}
	public void clickSubmit()
	{
		btnlogin.click();
	}
	public void clickReset()
	{
		btnReset.click();
	}
	
	
}
