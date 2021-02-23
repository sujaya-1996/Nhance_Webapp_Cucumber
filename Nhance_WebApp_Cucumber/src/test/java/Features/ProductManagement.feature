Feature: Product Management 

@currentTest 
Scenario: Verify Product Management listing screen 

	Given User Launch Chrome Browser 
	When User Opens URL 
	And User enters email "emailId" and Password as "password" 
	And Click on Login 
	Then Dashboard page should be shown 
	When User clicks on Product management 
	Then Product management listing screen should show 
	
@currentTest 
Scenario: Add product in Product Management 


	When User clicks on Add product button 
	Then Product Details screen header should show 
	And Select Value from dropdown for Product category 
	And Select Value from dropdown for Product subcategory 
	And Select Value from dropdown for Product Manufacturer 
	And Input below values for Model Number, Warranty period and Description field 
		|HealthInsuranceCardSix|12|Test Description|
	When User clicks the save button 
	Then Successfull addition of product message should show 
	And User clicks on the ok button the pop-up 
	
Scenario: Edit product in Product Management 


	When User clicks on Edit option for the product 
	Then Product Details screen header should show 
	And User clears the value from Warranty and Description field 
	And User gives the new input to Warranty and Description field 
		|11|New Test Description|
	When User clicks the save button 
	Then Successfull addition of product message should show 
	And User clicks on the ok button the pop-up 
	When User clicks on Edit option for the product 
	Then Product Details screen header should show 
	Then Verify for the new added Details 
	Then Click on the back button 
	Then Product management listing screen should show 
	
Scenario: Delete Product in Product Management 

	When User clicks on Product management 
	Then Product management listing screen should show 
	And User clicks on the Delete option of the Product 
	And User clicks on the ok button the pop-up 
	Then Verify if the product is deleted or not, by taking the Product count 
	
Scenario: Add product by giving all the required details 


	When User clicks on Add product button 
	Then Product Details screen header should show 
	And Select Value from dropdown for Product category 
	And Select Value from dropdown for Product subcategory 
	And Select Value from dropdown for Product Manufacturer 
	And Input below values for Model Number, Warranty period and Description field 
		|HealthInsuranceCardSix|12|Test Description|
	And Input value for document section 
	And Input value for Service Charge section 
	And Input value for Custom Fields section 
	And Input value for Additional Info section 
	When User clicks the save button 
	Then Successfull addition of product message should show 
	And User clicks on the ok button the pop-up 
	When User clicks on Logout button and Clicking on confirm button 
	Then Login page should be shown 
	And Close browser 
	
	
	