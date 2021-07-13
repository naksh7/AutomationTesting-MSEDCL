@SmokeTest @RegistrationPage
Feature: Registration Page Validation


Scenario Outline: Validation Registration Page <fields>
	Given Go to URL
	Then Go To Registration Page
	Then Check following <fields> are present
Examples:
|fields|
|Consumer Number|
|Mobile Number|
|Email|
|Generate OTP|
|Email OTP|
|Login Names|
|Password|
|Confirm Password|

Scenario: Validation of Submit button
	Given Go to URL
	Then Go To Registration Page
	Then Fill All the textboxes
	Then Check alert message displayed on clicking submit button
	
	
Scenario: Validation of Clear button
	Given Go to URL
	Then Go To Registration Page
	Then Fill All the textboxes
	Then Check textbox get cleared on clicking clear button