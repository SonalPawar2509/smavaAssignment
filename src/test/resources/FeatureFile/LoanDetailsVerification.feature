Feature: Verify Loan Details

Scenario: Verify User is able to see Entered Loan Details in Loan Page

Given I Visit the website
And I Enter Nettokreditbetrag amount
And I Enter Lauzeit months
And I Enter Verwendung as Wohnen
When I Enter weiter button
Then I verify auto populated loan details data mentioned data