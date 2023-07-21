package com.workplaceerp.step_definitions;

import com.workplaceerp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.workplaceerp.pages.AddToInventory_NY;
import com.workplaceerp.pages.BasePage;
import com.workplaceerp.pages.LoginPage;

import org.junit.Assert;
import org.openqa.selenium.Keys;


public class US06_inventoryStepDefs extends BasePage  {
    LoginPage loginPage = new LoginPage();
    AddToInventory_NY addToInventoryNy = new AddToInventory_NY();


    @Given("the user is logged in as the POS Manager")
    public void theUserIsLoggedInAsThePOSManager() {
        loginPage.login("posmanager155@info.com", "posmanager");

    }

    @When("User clicks on the Inventory tab")
    public void userClicksOnTheInventoryTab() {
        BrowserUtils.sleep(5);
        addToInventoryNy.inventoryTab.click();

    }

    @And("User clicks on the Products tab under the Master Data")
    public void userClicksOnTheProductsTabUnderTheMasterData() {

        addToInventoryNy.productTab.click();
    }

    @And("User clicks the CREATE button")
    public void userClicksTheCREATEButton() {
        addToInventoryNy.createButton.click();
    }

    @Given("User enters the product name {string} in the Product Name input box")
    public void userEntersTheProductNameInTheProductNameInputBox(String product_name) {
        addToInventoryNy.productNameInput.sendKeys(product_name);
        BrowserUtils.sleep(10);
    }

    @And("User clicks the SAVE button")
    public void userClicksTheSAVEButton() {

        addToInventoryNy.saveButton.click();

    }

    @Then("User-entered {string} should be displayed for the product")
    public void userEnteredShouldBeDisplayedForTheProduct(String product_name) {
        Assert.assertEquals(addToInventoryNy.Product.getText(),product_name);
    }



    @When("User clicks on a product")
    public void userClicksOnTheProduct() {
        addToInventoryNy.newProduct.click();
    }
    @And("User clicks on the edit button")
    public void userClicksOnTheEditButton() {

        addToInventoryNy.clickEditButton.click();
    }

    @And("User edits the ProductName input box with another {string}")
    public void userEditsTheProductNameInputBoxWithAnother(String editedName) {

       addToInventoryNy.editedProductInput.clear();
       addToInventoryNy.editedProductInput.sendKeys(editedName);
    }

    @And("User clicks the save button")
    public void userClicksTheSaveButton() {
        addToInventoryNy.saveButton.click();
    }


    @Then("User should see the {string} information displayed")
    public void userShouldSeeTheInformationDisplayed(String editedName) {
        BrowserUtils.sleep(10);
        Assert.assertEquals(addToInventoryNy.Product.getText(), editedName);
    }
}
//
