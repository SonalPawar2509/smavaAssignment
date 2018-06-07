package com.smava.test.automation.testBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.smava.test.automation.configuration.ConfigReader;
import com.smava.test.automation.configuration.PropertyFileReader;
import com.smava.test.automation.utility.ResourceHelper;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class TestBase {
	
	public static WebDriver driver;
	static ConfigReader reader = new PropertyFileReader();

	@Before
	public static void setUpDriver() throws MalformedURLException{
		
		String browser = reader.getBrowser();
		String os=reader.getOS();
		if(os.equalsIgnoreCase("Linux")){
			URL serverurl = new URL("http://localhost:9515");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            driver = new RemoteWebDriver(serverurl,capabilities);}
		else{
			
            if(browser.equalsIgnoreCase("IE")){
    			System.setProperty("webdriver.ie.driver", ResourceHelper.getResourcePath("driver/IEDriverServer.exe"));
    			driver=new InternetExplorerDriver();
    		 }
    		else{
    			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
    		    driver=new ChromeDriver();
    		}
		}
		driver.manage().window().maximize();
	}
	
	@After
	public void closeDriver(){
		driver.quit();
	}
}
