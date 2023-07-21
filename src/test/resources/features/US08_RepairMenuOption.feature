@B29G9-215
Feature: Repair Menu Option
  User story:
  As a POS & sales manager, I want to access the Repairs page.

  Background:User is already in the log in page
  #@B29G9-213
    Given the user is on the login page

	#As a POS & sales manager, I want to access the Repairs page.

	#Acceptance Criteria:
	#Verify there are 6 columns to see the repair orders on the Repairs page when the POS & sales managers login.
  @B29G9-212
  Scenario Outline: US08-AC01-TC01 Verify that user can see 6 columns on the Repair page when loged in as POS managers
    Given the user logged in as "<userType>"
    When user clicks on the "Repairs" repair menu option
    And user is able to successfully access and see the "Repair Orders" table
    Then user should see the following 6 features:

      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |

    Examples: userType
      | userType      |
      | POS manager   |
      | Sales manager |


	#As a POS & sales manager, I want to access the Repairs page.
	#Acceptance Criteria:
	#Verify user can see the result on the list when searching with Repair Reference data.
  @B29G9-214
  Scenario Outline: US08-AC02-TC02 Verify that user can see the result on the list when searching with Repair Reference data
    Given the user logged in as "<userType>"
    When user clicks on the "Repairs" repair menu option
    Then user searches repair reference in the search box and sees relevant results:
      | RMA/00246 |
      | RMA/00245 |
      | RMA/00243 |
      | RMA/00242 |
      | RMA/00240 |
      | RMA/00239 |
      | RMA/00238 |
      | RMA/00237 |
      | RMA/00230 |
      | RMA/00228 |

    Examples:
      | userType      |
      | POS manager   |
      | Sales manager |