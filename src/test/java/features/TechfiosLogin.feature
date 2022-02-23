@Loginfeature @Regression
Feature: TechFios Login functionality validation

Background:
Given User is on the Techfios login page
@Scenerio1 @Smoke
Scenario: User should be able to login with valid credentials
 	When User enters username as "demo@techfios.com"
	When User enters password as "abc123"
	And User clikcks on signin button
	Then user should land on dashboard page
@Scenerio2	 
Scenario: User should be able to login with invalid username
	When User enters username as "demo1@techfios.com"
	When User enters password as "abc123"
	And User clikcks on signin button
	Then user should land on dashboard page

@Scenerio3	 
Scenario: User should be able to login with invalid password
	When User enters username as "demo@techfios.com"
	When User enters password as "abc124"
	And User clikcks on signin button
	Then user should land on dashboard page

@Scenerio4
Scenario: User should be able to login with invalid username & password
	When User enters username as "demo1@techfios.com"
	When User enters password as "abc124"
	And User clikcks on signin button
	Then user should land on dashboard page
	