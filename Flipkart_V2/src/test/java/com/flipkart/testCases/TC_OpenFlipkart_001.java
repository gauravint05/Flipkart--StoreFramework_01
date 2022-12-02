package com.flipkart.testCases;

import org.testng.annotations.Test;

import com.flipkart.pageObjects.OpenFlipkart;

public class TC_OpenFlipkart_001 extends FlipkartBaseClass
{
	@Test
    public void Open () throws InterruptedException
    {
        driver.get(baseURL);
        
        OpenFlipkart of= new OpenFlipkart(driver);
        
        of.clickloginclosebtn();
        of.setSearchforProducts(searchforproducts);
        of.clickredminote10btn();
//        of.clickaddtocartbtn();
        
    }

}
