@SmokeTest @HomePage
Feature: Homepage Validation


Scenario: Validation Homepage
	Given Go to URL
	Then Logo should present
	Then Banner should present
	Then Check connection code for all links and navigation of the links
	Then Check Left navigation pane has 16 links
	
	

Scenario Outline: Check middle section for <middleBlocks>
	Given Go to URL
	Then Check middle section for <middleBlocks>
Examples:
	|middleBlocks																|
	|Announcements															|
	| Web Self Services Registration           |
  | Bills and Payments                        |
  | Service Requests                          |
  | Facilities available without registration |
  
	

Scenario Outline: Check right section for <rightBlocks>
	Given Go to URL
	Then Check right section for <rightBlocks>
Examples: 
	|rightBlocks										|
	|Customer Cares									|
	|Know Your Relevant Documents		|
	|External Links									|
	|Policies										|
		

Scenario Outline: Check Footer section for <footerLinks>
	Given Go to URL
	Then Check footer section for <footerLinks> 
Examples: 
	|footerLinks								|
	|About Us										|
	|Contact Us									|
	|FAQ												|
	|Help												|
	|Disclaimer									|
	|Privacy Policy							|
	|customercare@mahadiscom.in	|
	|helpdesk_pg@mahadiscom.in	|

		
  
 	

	