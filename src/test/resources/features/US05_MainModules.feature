@Wip
Feature: Create a new customer
  User Story: As a Sales Manager, I should be able to create a new customer from "Sales" module

  Background:
   # Given User is on the login page
    Given the user logged in as "Sales manager"
    And Sales Manager click on the Sales module from the menu options
    And Sales Manager click on the Customers tab under Orders

  @B29G9-225 @Wip
  Scenario Outline: User creates new customer
    When Sales Manager click on the Create button
    And Sales Manager writes "<customerName>" in the Name box as prompted
    And Sales Manager click the Save button
    Then Sales Manager should see the customer name "<expectedName>" displayed
    Examples:
    |customerName|expectedName|
    |Tom         |Tom         |
    |Tim         |Tim         |
    |Mila        |Mila        |

    @B29G9-226 @Wip
    Scenario Outline: Verify user can edit customer information
      When Sales Manager click on a any customer ID box
      And Sales Manager click on the Edit button
      And Sales manager ad "<customerName>" in the Name Box
      And Sales Manager clicks the Save button
      Then Sales Manager should see edited "<expectedName>"
      Examples:
      |customerName |expectedName|
      |Tomas        |Tomas       |
      |Tomi         |Tomi        |

