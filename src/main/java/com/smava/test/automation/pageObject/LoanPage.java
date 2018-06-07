package com.smava.test.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoanPage {
	
	WebDriver driver;
	
	public LoanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@id='applicant0.loan.selection.category']")
	WebElement creditLoanAmountCategory;
	
	@FindBy(xpath="//select[@id='applicant0.loan.selection.amount']")
	WebElement creditLoanAmount;
	
	@FindBy(xpath="//select[@id='applicant0.loan.selection.duration']")
	WebElement creditLoanDuration;
	
	public String getLoanCategory() throws InterruptedException{
		Select select=new Select(creditLoanAmountCategory);
		return select.getFirstSelectedOption().getText();
		
	}
	
	public String getLoanAmount() throws InterruptedException{
		Select select=new Select(creditLoanAmount);
		return select.getFirstSelectedOption().getText();
		
	}
	
	public String getLoanDuration() throws InterruptedException{
		Select select=new Select(creditLoanDuration);
		return select.getFirstSelectedOption().getText();
		
	}
	
}
