@B29G9-240
Feature: Default

	Background:
		#@B29G9-230

		    Given the user is logged in as the POS Manager
			And User clicks on the Inventory tab
			And User clicks on the Products tab under the Master Data

	#*{color:#403294}User Story:{color}* {color:#ff8b00}As a PosManager, I should be able to add new products to inventory.{color}
	#
	#*{color:#403294}AC1:{color}* {color:#ff8b00}The user can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.{color}
	@B29G9-204
	Scenario Outline: US06-AC01-TC01: Verify that POS Manager can create a new product by only filling the Product Name input box
		When User clicks the CREATE button
		And User enters the product name "<product_name>" in the Product Name input box
		    And    User clicks the SAVE button
		    Then   User-entered "<product_name>" should be displayed for the product
		    Examples:
		      | product_name |
		      | Book         |
		      | Ipad         |
		      | Iphone8      |	

	#*{color:#403294}User Story:{color}* {color:#ff8b00}As a PosManager, I should be able to add new products to inventory.{color}
	#
	#*{color:#403294}AC2:{color}* {color:#ff8b00}When clicking any product and then clicking the edit button all the boxes entered information can be editable again.{color}
	@B29G9-207
	Scenario Outline: US06-AC02-TC02: Verify that entered information is editable when clicking on the “edit” button on any product.
		When   User clicks on a product
		  And  User clicks on the edit button
		  And   User edits the ProductName input box with another "<editedName>"
		  And   User clicks the save button
		  Then  User should see the "<expectedName>" information displayed
		
		    Examples:
		      |editedName   |expectedName|
		      |Notebooks    |Notebooks   |
		      |Tablet       |Tablet      |
		      |Android      |Android     |

