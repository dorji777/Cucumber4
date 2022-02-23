@DbFeature
Feature: Login to Techfios Login page with data extrated from database


@DbScenerio1 
Scenario: User should be able to login with valid credentials
	Given User is on the Techfios login page
 	When User enters "Username" from techfios database
 	When User enters "Password" from techfios database
	
	And User clikcks on signin button
	Then user should land on dashboard page