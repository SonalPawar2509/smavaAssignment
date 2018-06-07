package com.smava.test.automation.configuration;



public interface ConfigReader {
	
	public String getEmailId();
	public String getPassword();
	public String getUrl();
	public int getPageLoadTimeOut();
	public String getBrowser();
	public String getOS();

}
