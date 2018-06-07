package com.smava.test.automation.stepdefination;

import com.smava.test.automation.configuration.ConfigReader;
import com.smava.test.automation.configuration.PropertyFileReader;
import com.smava.test.automation.pageObject.HomePage;
import com.smava.test.automation.pageObject.LoginPage;
import com.smava.test.automation.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	ConfigReader reader=new PropertyFileReader();
	HomePage homePage;
	LoginPage loginPage;
	

	@And("^I click on ANMELDEN link$")
	public void i_click_on_ANMELDEN_link() throws Throwable {
	    homePage=new HomePage(TestBase.driver);
	    homePage.clickAnmeldenLink();
	}

	@And("^I enter invalidUserName$")
	public void i_enter_invalidUserName() throws Throwable {
		loginPage=new LoginPage(TestBase.driver);
	    loginPage.enterEmailId();
	}

	@And("^I enter invalid password$")
	public void i_enter_invalid_password() throws Throwable {
	   loginPage.enterPassword();
	}

	@When("^I click on Anmelden button$")
	public void i_click_on_Anmelden_button() throws Throwable {
	    loginPage.clickAnmeldenButton();
	}

	@Then("^I should error message$")
	public void i_should_error_message() throws Throwable {
	    loginPage.verifyErrorMessage();
	}
	
}
