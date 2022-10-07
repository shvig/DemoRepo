package com.inetbsnking.testcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

	public String baseURL ="https://demo.guru99.com/V4/";
	public String username = "mngr439740";
	public String Password = "enYrApe";
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
	driver= new FirefoxDriver();
	
	logger= Logger.getLogger(TC_1_Login.class);
	PropertyConfigurator.configure("log4j.properties");
	
	
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
