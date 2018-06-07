# SMAVA Test Automation

**Java Cucumber Selenium with JUnit,hamcrest, Maven Test Automation Framework**

## Execution

**Main Class:** com.smava.test.automation.Runner.Runner

## Configuration Properties

**Url** Base URL (_https://www.smava.de/_)
    
**Browser** Browser Name (_chrome_)

**EmailId** Email Id to login to SMAVA site (_test471@gmail.com_)

**Password** Password to login to SMAVA site (_test123_)

**PageLoadTimeOut** Time in seconds to wait for page loading (_240_)

**OS** Operating System (_Linux_)

## Chrome Driver SetUp in Linux Machine

** Inside /home/${user} – create a new directory “ChromeDriver”
** Unzip the downloaded chromedriver into this folder
** Using chmod +x filename or chmod 777 filename make the file executable
** Go to the folder using cd command
** Execute the chrome driver with ./chromedriver command
** Now the chromedriver will start executing in the 9515 port


## Reports Path

**Generated Reports Path:** classpath:target/HtmlFile