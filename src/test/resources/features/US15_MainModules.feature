@B29G9-239
Feature: Default

	Background:
		#@B29G9-237
		Given the user is on the login page
		And the user logged in as "CRM Manager"

	#*User Story:*
	#
	#As an Event manager, I want to access the different modules.
	#
	#*Acceptance Criteria:*
	#
	#1. Verify the Event managers access to 15 modules.
	#
	# 
	@B29G9-238
	Scenario: US15-AC01-TC01: Verify that the user can access different modules as an event manager
		Given user sees all modules displayed
		And user can click different modules
		Then user can see 15 modules as follows:
			|Discuss|
			|Calendar|
			|Notes|
			|Contacts|
			|CRM|
			|Sales|
			|Website|
			|Inventory|
			|Repairs|
			|Events|
			|Employees|
			|Leaves|
			|Expenses|
			|Maintenance|
			|Dashboards|
