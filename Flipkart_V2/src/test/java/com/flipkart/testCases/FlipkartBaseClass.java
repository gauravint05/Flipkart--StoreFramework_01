package com.flipkart.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class FlipkartBaseClass {
	    
	    public String baseURL="https://www.flipkart.com/";
	    public String searchforproducts="REDMI Note 10 Pro";
	    public static WebDriver driver;
	    
	    
	    @BeforeClass
	    public void setup()
	    {
	        System.setProperty ("webdriver.chrome.driver",System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();    
	    }

	    
//	    @AfterClass
//	    public void teardown()
//	    {
//	        driver.quit();
//	    }
	//    




}
