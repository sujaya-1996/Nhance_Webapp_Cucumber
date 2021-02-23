Feature: Application Login 


Scenario Outline: Successful Login With Valid Credentials 

	Given User Launch Chrome Browser 
	When User Opens URL 
	And User enters emailid "<email>" and Password as "<password>" 
	And Click on Login 
	Then Dashboard page should be shown 
	When User clicks on Logout button and Clicking on confirm button 
	Then Login page should be shown 
	And Close browser 
	
	Examples: 
	
		| email |password|
		| qatesting20@yopmail.com | aaA@123 |
		| qatesting21@yopmail.com | aaA@123 |
		
		
Scenario: Login by giving invalid credentials 

	Given User Launch Chrome Browser 
	When User Opens URL 
	When User enters invalid emailId and Password as mentioned below 
		|randomInput@yopmail.com|aaA@123|
	And Click on Login 
	Then Validation error message should be shown 
	And User clicks on the ok button the pop-up 
	And Close browser 
	
Scenario: Successful Login With Valid Credentials 

	Given User Launch Chrome Browser 
	When User Opens URL 
	When User enters email "emailId" and Password as "password" 
	And Click on Login 
	Then Dashboard page should be shown 
	When User clicks on Logout button and Clicking on confirm button 
	Then Login page should be shown 
	And Close browser 
	
	
	
	
	
