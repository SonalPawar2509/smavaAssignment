package com.smava.test.automation.Runner;



import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFile"}, glue={"classpath:com.smava.test.automation"}, format={"pretty","html:target/htmlFile"})
public class Runner {

}
