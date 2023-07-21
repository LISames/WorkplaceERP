@B29G9-229
Feature: As a sales manager
	I want to see 19 modules on the homepage

	Background:User is already in the log in page
		Given the user is on the login page

	#US17:
	#
	#As a sales manager, I should be able to access the different modules.
	#
	#AC 1:
	#
	#As a sales manager, I should be able to access the different modules.
	@B29G9-202
	Scenario: US17-AC01-TC01 Verify the sales manager can see the different modules
		Given the user logged in as "sales manager"
		    Then user should see the following modules

		|Discuss |
		|Calendar |
		|Notes |
		|Contacts |
		|CRM |
		|Sales |
		|Website |
		|Point of Sale |
		|Purchases |
		|Inventory |
		|Repairs |
		|Invoicing |
		|Email Marketing |
		|Events |
		|Employees|
		|Leaves   |
		|Expenses |
		|Maintenance|
		|Dashboards|
		
		
