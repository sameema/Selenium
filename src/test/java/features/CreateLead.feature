Feature: Create lead for Leaftap application
Background:
	Given open the browser
	And enter the url


@smoke	
Scenario: TC002_CreateLead Positive flow
And enter the username as DemoSalesManager
And enter the password as crmsfa
@smoke	
Scenario: TC002_CreateLead Positive flow
And enter the username as DemoSalesManager
And enter the password as crmsfa
And click login button
And click CRM/SFA button
And click Leads button
And click Create Lead button
And enter Company Name as Steria
And enter First Name as Sameema
And enter Last Name as Rani
When click Create Leads button
Then verify Create Lead is success

@reg
Scenario Outline: TC002_CreateLead Positive flow
And enter the username as <username>
And enter the password as <password>
And click login button
And click CRM/SFA button
And click Leads button
And click Create Lead button
And enter Company Name as <cname>
And enter First Name as <fname>
And enter Last Name as <lname>
When click Create Leads button
Then verify Create Lead is success
Examples:
|username|password|cname|fname|lname|
|DemoSalesManager|crmsfa|steria|Sameema|Rani|
|DemoSalesManager|crmsfa|CTS|Ifrah|K|
|DemoSalesManager|crmsfa|Contus|Kaja|Najmudheen|

