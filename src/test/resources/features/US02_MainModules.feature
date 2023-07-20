@B29G9-205
Feature: As a sales and expense manager,
  I want to Login with valid credentials and get my account name.


  @B29G9-199
  Scenario Outline: US02-AC03-TC01 - Verify that the user gets the "Please fill in this field." message for at least one field

    Given the user is on the login page
    When the user submits empty "<username>" and "<password>"
    And the user clicks on the Login button
    Then user sees - Please fill in this field. - for at least one field

    Examples:
      | username                  | password     |
      |                           |              |
      |                           | salesmanager |
      | expensemanager15@info.com |              |


  @B29G9-188
  Scenario Outline: US02-AC02-TC02 - Verify the "Wrong login/password" error message should be displayed after entering the invalid email and valid password

    Given the user is on the login page
    When the user enters invalid "<username>" and valid "<password>"
    And the user clicks on the Login button
    Then the "Wrong login/password" error message should be displayed

    Examples:
      | username                    | password        |
      | salesmanager1000@info.com   | salesmanager    |
      | salesmanager2000@info.com   | salesmanager    |
      | expensemanager1000@info.com | expensesmanager |
      | expensemanager2000@info.com | expensesmanager |


  @B29G9-183
  Scenario Outline: US02-AC01-TC01 - Verify that sales manager and expense manager can login with valid credentials by clicking on "Login" button


    Given the user is on the login page
    When the user enters valid username "<username>" and password "<password>"
    And the user clicks on the Login button
    Then the user should be logged in successfully and see his name according to the "<username>"

    Examples:
      | username                   | password        |
      | salesmanager15@info.com    | salesmanager    |
      | salesmanager25@info.com    | salesmanager    |
      | expensesmanager15@info.com | expensesmanager |
      | expensesmanager25@info.com | expensesmanager |


  @B29G9-185
  Scenario Outline: US02-AC01-TC02 - Verify sales manager and expense manager can login with valid credentials and pressing "ENTER" button

    Given the user is on the login page
    When the user enters valid username "<username>" and password "<password>"
    And the user presses "ENTER" key
    Then the user should be logged in successfully and see his name according to the "<username>"

    Examples:
      | username                   | password        |
      | salesmanager15@info.com    | salesmanager    |
      | salesmanager25@info.com    | salesmanager    |
      | expensesmanager15@info.com | expensesmanager |
      | expensesmanager25@info.com | expensesmanager |


  @B29G9-186
  Scenario Outline: US02-AC02-TC01 - Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials

    Given the user is on the login page
    When the user enters invalid username "<username>" and invalid password "<password>"
    And the user clicks on the Login button
    Then the "Wrong login/password" error message should be displayed

    Examples:
      | username                    | password     |
      | salesmanager1000@info.com   | invalidpass1 |
      | salesmanager2000@info.com   | invalidpass1 |
      | expensemanager1000@info.com | invalidpass2 |
      | expensemanager2000@info.com | invalidpass2 |


  @B29G9-190
  Scenario Outline: US02-AC02-TC03 - Verify the "Wrong login/password" error message should be displayed after entering the valid email and invalid password

    Given the user is on the login page
    When the user enters valid "<username>" and invalid "<password>"
    And the user clicks on the Login button
    Then the "Wrong login/password" error message should be displayed

    Examples:
      | username                   | password     |
      | salesmanager15@info.com    | invalipas    |
      | salesmanager25@info.com    | invalidpas01 |
      | expensesmanager15@info.com | invalidpas   |
      | expensesmanager25@info.com | invalidpas01 |