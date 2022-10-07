package com.inetbsnking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.loginPage;

public class TC_1_Login extends BaseClass

{

	@Test
	public void LoginTest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		loginPage lp= new loginPage(driver);
		lp.setUsername(username);
		logger.info("Entered Username");
		lp.setPassword(Password);
		logger.info("Entered Password");
		lp.clickSubmit();
		logger.info("Logged in Succesfully");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else
			{Assert.assertTrue(false);
	}}
		
	
}
