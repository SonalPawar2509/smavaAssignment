package com.smava.test.automation.stepdefination;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import com.smava.test.automation.configuration.ConfigReader;
import com.smava.test.automation.configuration.PropertyFileReader;
import com.smava.test.automation.pageObject.HomePage;
import com.smava.test.automation.pageObject.LoanPage;
import com.smava.test.automation.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoanDetailsVerification {
	ConfigReader reader=new PropertyFileReader();
	HomePage homePage;
	LoanPage loanPage;
	
	
	
	@Given("^I Visit the website$")
	public void i_Visit_the_website() throws Throwable {
	   TestBase.driver.get(reader.getUrl());
	   TestBase.driver.manage().timeouts().pageLoadTimeout(reader.getPageLoadTimeOut(), TimeUnit.SECONDS);
	}

	@And("^I Enter Nettokreditbetrag amount$")
	public void i_Enter_Nettokreditbetrag_as() throws Throwable {
	   homePage=new HomePage(TestBase.driver);
	   homePage.selectLoanAmount();
	}

	@And("^I Enter Lauzeit months$")
	public void i_Enter_Lauzeit_as() throws Throwable {
	    homePage.selectLoanTendure();
	}

	@And("^I Enter Verwendung as Wohnen$")
	public void i_Enter_Verwendung_as_Wohnen() throws Throwable {
	   homePage.selectLoanType();
	}

	@When("^I Enter weiter button$")
	public void i_Enter_weiter_button() throws Throwable {
	    homePage.clickOnWeiterButton();
	}

	@Then("^I verify auto populated loan details data mentioned data$")
	public void i_verify_auto_populated_loan_details_data_mentioned_data() throws Throwable {
	   loanPage=new LoanPage(TestBase.driver);
	    assertThat(homePage.selectedLoanAmount,equalTo(loanPage.getLoanAmount()));
		assertThat(homePage.selectedLoanTendure,equalTo(loanPage.getLoanDuration()));
		assertThat(homePage.selectedLoanType,equalTo(loanPage.getLoanCategory()));
	}

}
