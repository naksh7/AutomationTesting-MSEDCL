@SmokeTest @LoginPage
Feature: LoginPage Validation


Scenario Outline: Validation Login Page <fields>
	Given Go to URL
	Then Go To Login Page
	Then LPCheck following <fields> are present
Examples:
|fields|
|Login Name|
|Passwordd|
|Captcha|

Scenario: Validation of Submit button
	Given Go to URL
	Then Go To Login Page
	Then LPFill All the textboxes
	Then LPCheck alert message displayed on clicking submit button
	
	
Scenario: Validation of Clear button
	Given Go to URL
	Then Go To Login Page
	Then LPFill All the textboxes
	Then LPCheck textbox get cleared on clicking clear button