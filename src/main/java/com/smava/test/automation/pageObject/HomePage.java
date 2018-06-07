package com.smava.test.automation.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smava.test.automation.testBase.TestBase;

public class HomePage {

	WebDriver driver;
	public String selectedLoanAmount = "2.750 €";
	public String selectedLoanTendure = "24 Monate";
	public String selectedLoanType = "Wohnen";
	Actions action;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='myselect']/div/input[@class='search']")
	WebElement loanAmount;

	@FindBy(xpath = "//a[@id='forwardButtonkredit2day']")
	WebElement weiterButton;

	@FindBy(xpath = "//a[@class='item login-popup uppercase']")
	WebElement anmeldenLink;

	public void selectLoanAmount() throws InterruptedException {
		loanAmount.sendKeys(selectedLoanAmount);
		action = new Actions(TestBase.driver);
		action.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).build().perform();
	}

	public void selectLoanTendure() throws InterruptedException {
		Thread.sleep(2000);
		action = new Actions(TestBase.driver);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).build().perform();
	}

	public void selectLoanType() throws InterruptedException {
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.UP).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public void clickOnWeiterButton() throws InterruptedException {
		Thread.sleep(2000);
		weiterButton.click();
	}

	public void clickAnmeldenLink() {
		anmeldenLink.click();
	}
}
