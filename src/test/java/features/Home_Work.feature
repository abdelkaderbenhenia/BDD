@AEK
Feature: Other valide Techfios login functionality 

Background: 
	Given User is on the "Techfios" login page 
@AEK
Scenario Outline: User should be able to login with the valid cerdentials 
	When User enters "<username>" and "<password>" 
	When User clicks signin button 
	When User should land on the Dashboard page 
	When User clicks bank and cash button
	When User clicks New Account 
	When User Add Account enters "<title>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phone>" and "<bankURL>"
	And User clicks submit account button 
	Then User should land on the account add page 
	Examples: 
				|  username       |password|title|description|initialBalance|accountNumber|contactPerson|phone   |bankURL     |
			  	|demo@techfios.com|abc123  |acxvsss|aznerty  |2050110       |82542557112253|aawserct    |817706  |www.bofa.com|
			  