@loginFeature
Feature: valide Techfios login functionality 

Background: 
#	Given User is on the Techfios login page
#	Given User is on the "Techfios" login page
	Given User is on the "Techfios" login page 

@Scenario1 	
Scenario: 1 User should be able to login with the valid cerdentials 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	And User clicks signin button 
	Then User should land on the Dashboard page 
	
@Scenario2 	
Scenario: 2 User should be able to login with the valid cerdentials 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc124" 
	And User clicks signin button 
	Then User should land on the Dashboard page 

@Scenario3 	
Scenario: 3 User should be able to login with the valid cerdentials 
	When User enters username as "demo1@techfios.com" 
	When User enters password as "abc123" 
	And User clicks signin button 
	Then User should land on the Dashboard page 

@Scenario4 	
Scenario: 4 User should be able to login with the valid cerdentials 
	When User enters username as "demo1@techfios.com" 
	When User enters password as "abc124" 
	And User clicks signin button 
	Then User should land on the Dashboard page