@B29G9-235
Feature: Default

	#{color:#de350b}*US:*{color}
	#
	#As POS and event CRM manager, I should be able to log in with valid credentials.
	#
	#{color:#de350b}*AC1:*{color}
	#
	# Verify that the user can log in with valid credentials either by clicking on the "Login" button or hitting the "Enter" key on the keyboard.
	@B29G9-231
	Scenario Outline: US01-AC01-TC01 Verify that the user can log in with valid credentials either by clicking on the "Login".
		Given I am on the login page
		
		When I login using "<email>" and "<password>"
		
		Then account holder name should be "<name>"
		
		
		
		Examples:
		
		|email                      |password        |name              |
		|posmanager55@info.com      |posmanager      |POSManager55      |
		|posmanager67@info.com      |posmanager      |POSManager67      |
		|posmanager89@info.com      |posmanager      |POSManager89      |
		|eventscrmmanager55@info.com|eventscrmmanager|EventsCRMManager55|
		|eventscrmmanager67@info.com|eventscrmmanager|EventsCRMManager67|
		|eventscrmmanager89@info.com|eventscrmmanager|EventsCRMManager89|

	#{color:#de350b}*US:*{color}
	#
	#As POS and event CRM manager, I should be able to log in with valid credentials.
	#
	#{color:#de350b}*AC2:*{color}
	#
	# Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials.
	@B29G9-232
	Scenario Outline: US01-AC02-TC02 Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials.
		Given I am on the login page
		
		When I login using "<email>" and "<password>"
		
		Then  User see "<errormessage>" is displayed
		
		
		
		Examples:
		
		|email                       |password         |errormessage             |
		|posmanager705@info.com      |posmanager       |Wrong login/password|
		|posmanager67@info.com       |posmanagerj      |Wrong login/password|
		|posmanager709@info.com      |posmanagerj      |Wrong login/password|
		|eventscrmmanager705@info.com|eventscrmmanager |Wrong login/password|
		|eventscrmmanager67@info.com |eventscrmmanagerj|Wrong login/password|
		|eventscrmmanager709@info.com|eventscrmmanagerj|Wrong login/password|	

	#{color:#de350b}*US:*{color}
	#
	#As POS and event CRM manager, I should be able to log in with valid credentials.
	#
	#{color:#de350b}*AC3:*{color}
	#
	# Verify that the user gets the "Please fill in this field." message for at least one blank field.
	@B29G9-234
	Scenario Outline: US01-AC03-TC03 Verify that the user gets the "Please fill in this field." message for at least one blank field.
		Given I am on the login page
		
		When I login using "<email>" and "<password>"
		
		Then User see message is in the blank field
		
		
		
		Examples:
		
		|email                       |password         |
		|                            |posmanager       |
		|posmanager55@info.com       |                 |
		|                            |eventscrmmanager |
		|eventscrmmanager55@info.com |                 |
		|                            |                 |