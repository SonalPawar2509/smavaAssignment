package com.smava.test.automation.configuration;

import java.util.Properties;

import com.smava.test.automation.utility.ResourceHelper;

public class PropertyFileReader implements ConfigReader {

	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/configFile/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getEmailId() {
		return prop.getProperty("EmailId");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getUrl() {
		return prop.getProperty("Url");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	public String getBrowser() {
		return prop.getProperty("Browser");
	}

	public String getOS() {
		return prop.getProperty("OS");
	}

}
