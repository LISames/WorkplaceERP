@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


    #login functionality using scenario outline
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"

    Examples:
      | userType          |
      | POS Manager       |
      | CRM Manager       |
      | Sales Manager     |
      | Inventory Manager |
      | Expenses Manager  |

    #login functionality using parameterization
  Scenario: Verify login with different user types
    Given the user logged in with username as "salesmanager18@info.com" and password as "salesmanager"








