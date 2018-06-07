Feature: Login Functionality

Scenario: Verify Login functionalty with invalid credentials

Given I Visit the website
And I click on ANMELDEN link
And I enter invalidUserName
And I enter invalid password
When I click on Anmelden button
Then I should error message
