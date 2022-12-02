package com.flipkart.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenFlipkart {
	
WebDriver ldriver;
    
    public OpenFlipkart(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    WebElement txtsearchforproducts;
    
    @FindBy(xpath="//button[contains(text(),'✕')]")
    @CacheLookup
    WebElement loginclosebtn;
    
    @FindBy(xpath="|//input[@class=\"_4rR01T\"='  ']")
    @CacheLookup
    WebElement redminote10btn;
    
    @FindBy(xpath="//button[normalize-space()='ADD TO CART']]")
    @CacheLookup
    WebElement addtocartbtn;
    
    
    
    public void  clickloginclosebtn() throws InterruptedException
    {
        loginclosebtn.click();
        Thread.sleep(5000);
    }
    
    public void setSearchforProducts(String sproducts)
    {
        txtsearchforproducts.sendKeys(sproducts);
        txtsearchforproducts.sendKeys(Keys.ENTER);
    }
    
    public void  clickredminote10btn() throws InterruptedException
    {
    	Thread.sleep(500);
        redminote10btn.click();
        
    }
    
    public void  clickaddtocartbtn() throws InterruptedException
    {
    	Thread.sleep(500);
        addtocartbtn.click();
        
    }
    
    
    


}
