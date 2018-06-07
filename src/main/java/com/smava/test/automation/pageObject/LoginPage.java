package com.smava.test.automation.pageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smava.test.automation.configuration.ConfigReader;
import com.smava.test.automation.configuration.PropertyFileReader;

public class LoginPage {
	ConfigReader reader=new PropertyFileReader();
	
	WebDriver driver;
	public String actualErrorMessage="Ihre Angaben zum Einloggen sind ungültig. Bitte versuchen Sie es erneut. Bitte beachten Sie, dass Ihr Zugang bei 3 Fehlversuchen von uns vorläufig gesperrt wird.";
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@id='signonForm.email']")
	WebElement emailTxtBox;
	
	@FindBy(xpath="//input[@id='signonForm.password']")
	WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@class='ui right labeled icon fluid button']")
	WebElement anmeldenButton;
	
	@FindBy(xpath="//*[@id='layout-wrapper']/div[3]/div[1]/div/div/div[1]/div/ul/li")
	public
	WebElement loginErrorMessage;
	
	
	public void enterEmailId(){
		emailTxtBox.sendKeys(reader.getEmailId());
	}
	
	public void enterPassword(){
		passwordTxtBox.sendKeys(reader.getPassword());
	}
	
	public void clickAnmeldenButton(){
		anmeldenButton.click();
	}
}
