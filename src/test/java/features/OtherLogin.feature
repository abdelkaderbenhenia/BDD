@OtherFeature @smoke 
Feature: Other valide Techfios login functionality 

Background: 
	Given User is on the "Techfios" login page 
@Other1	
Scenario Outline: 1 User should be able to login with the valid cerdentials 
	When User enters "<username>" and "<password>" 
	And User clicks signin button 
	Then User should land on the Dashboard page 
	Examples: 
				|  username       |password|
			  	|demo@techfios.com|abc123  |
			  	|demo@techfios.com|abc124  |
			  	|demo2@techfios.com|abc123  |
			  	|demo2@techfios.com|abc124  |
	#	
	#@Other1 	@smoke
	#Scenario: 1 User should be able to login with the valid cerdentials 
	#	When User enters username as "demo@techfios.com" 
	#	When User enters password as "abc123" 
	#	And User clicks signin button 
	#	Then User should land on the Dashboard page 
	#	
	#@Other2 	@smoke
	#Scenario: 2 User should be able to login with the valid cerdentials 
	#	When User enters username as "demo@techfios.com" 
	#	When User enters password as "abc124" 
	#	And User clicks signin button 
	#	Then User should land on the Dashboard page 
	#
	#@Other3 	
	#Scenario: 3 User should be able to login with the valid cerdentials 
	#	When User enters username as "demo1@techfios.com" 
	#	When User enters password as "abc123" 
	#	And User clicks signin button 
	#	Then User should land on the Dashboard page 
	#
	#@Other4 	
	#Scenario: 4 User should be able to login with the valid cerdentials 
	#	When User enters username as "demo1@techfios.com" 
	#	When User enters password as "abc124" 
	#	And User clicks signin button 
	#	Then User should land on the Dashboard page