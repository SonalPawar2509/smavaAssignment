package com.smava.test.automation.pageObject;


import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smava.test.automation.JsonReader.*;
import com.smava.test.automation.model.LoanInfo;
import com.smava.test.automation.testBase.TestBase;
import com.smava.test.automation.utility.ResourceHelper;






public class HomePage {
	
	WebDriver driver;
	Actions action;

	JsonReader jsonReader;
	File f=new File(ResourceHelper.getResourcePath("/src/main/resources/data/loanDetails.json"));
	LoanInfo loanInfo=JsonReader.convertJsonToJava(f, LoanInfo.class);
	
	public String selectedLoanAmount=loanInfo.getLoanAmount();
	public String selectedLoanTendure=loanInfo.getLoanTendure();
	public String selectedLoanType=loanInfo.getLoanType();
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='myselect']/div/input[@class='search']")
	WebElement loanAmount;
	
	@FindBy(xpath="//a[@id='forwardButtonkredit2day']")
	WebElement weiterButton; 
	
	@FindBy(xpath="//a[@class='item login-popup uppercase']")
	WebElement anmeldenLink;
	
	
	
	public void selectLoanAmount() throws InterruptedException{
	    loanAmount.sendKeys(selectedLoanAmount);
		action=new Actions(TestBase.driver);
		action.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).build().perform();
	}
	
	public void selectLoanTendure() throws InterruptedException{
	    Thread.sleep(2000);
		action=new Actions(TestBase.driver);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).build().perform();
	}

	public void selectLoanType() throws InterruptedException{
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickOnWeiterButton() throws InterruptedException{
		Thread.sleep(2000);
		weiterButton.click();
	}
	
	public void clickAnmeldenLink(){
		anmeldenLink.click();
	}
}
