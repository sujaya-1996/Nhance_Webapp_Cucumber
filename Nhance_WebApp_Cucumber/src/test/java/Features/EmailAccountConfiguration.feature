Feature: Email Account Configuration feature in Settings (For 11736 story) 


Scenario: Verify Email Account Configuration feature In Settings 

	Given User Launch Chrome Browser 
	When User Opens URL 
	And User enters email "emailId" and Password as "password" 
	And Click on Login 
	Then Dashboard page should be shown 
	When User clicks on the Settings menu 
	Then Email Account Configuration feature should show 
	
Scenario: 
	Verify if the fields are showing fine or not On Email Account Configuration screen 

	When User clicks on Email Account Configuration feature 
	Then User should get navigated to Email gateway screen 
	When User Clicks and select the value from the dropdown 
	Then All three required fields should show on the UI 
	
Scenario: Saving by giving invalid inputs in the three fields 

	When User is giving the below mentioned values in the three fields respectively 
		|random API Key|URL in text|random endpoint|
	And Clicks on the save button 
	Then It should show validation for URL field 
	
Scenario: Saving by not giving any inputs in the three fields 

	When User clears the inputs given in the three fields 
	And Clicks on the save button 
	Then For all the three fields validation should be shown 
	
Scenario: Saving by giving valid inputs in the three fields 

	When User is giving the below mentioned values in the three fields respectively 
		|SG.F64lyxhgSiWrBA0BMCe72g.L-VbzNe7jCyvwCIaMiISfWgSBj1PjXKvt9ZW25sKjTwa|https://api.sendgrid.com|/api/mail.send.json|
	And Clicks on the save button 
	Then Success message pop-up should show 
	And User clicks on the ok button the pop-up 
	
Scenario: 
	Verify if the configured values are showing fine or not On Email Account Configuration screen 	
	
	When User clicks on Email Account Configuration feature 
	Then User should get navigated to Email gateway screen 
	When User Clicks and select the value from the dropdown 
	Then All three configured field values should show properly on the UI 
	When Click on the back button 
	Then Email Account Configuration feature should show 
	When User clicks on Logout button and Clicking on confirm button 
	Then Login page should be shown 
	And Close browser 
	 