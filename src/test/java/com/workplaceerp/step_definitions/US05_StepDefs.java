package com.workplaceerp.step_definitions;

import com.workplaceerp.pages.*;
import com.workplaceerp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_StepDefs extends BasePage {
    LoginPage loginPage = new LoginPage();
    MainModulesPage_ZD dashboardPage = new MainModulesPage_ZD();



    @Given("User enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        loginPage.login("salesmanager15@info.com","salesmanager");

    }
    @Given("Sales Manager click on the Sales module from the menu options")
    public void sales_manager_click_on_the_sales_module_from_the_menu_options() {
        dashboardPage.salesBtn.click();



    }
    @Given("Sales Manager click on the Customers tab under Orders")
    public void sales_manager_click_on_the_customers_tab_under_orders() {
       dashboardPage.customerTab.click();
       BrowserUtils.sleep(10);
    }
    @When("Sales Manager click on the Create button")
    public void sales_manager_click_on_the_create_button() {
        dashboardPage.CreateBtn.click();


    }
    @When("Sales Manager writes {string} in the Name box as prompted")
    public void sales_manager_fill_out_the_name_box_as_prompted(String name) {
        dashboardPage.namePlaceholder.sendKeys(name);

    }
    @When("Sales Manager click the Save button")
    public void sales_manager_click_the_save_button() {
        dashboardPage.saveButton.click();

    }
    @Then("Sales Manager should see the customer name {string} displayed")
    public void sales_manager_should_see_the_customer_information_displayed(String name) {
       Assert.assertEquals(dashboardPage.information.getText(),name);

    }

    @When("Sales Manager click on a any customer ID box")
    public void sales_manager_click_on_a_any_customer_id_box() {
        dashboardPage.customer.click();

    }
    @When("Sales Manager click on the Edit button")
    public void sales_manager_click_on_the_edit_button() {
        dashboardPage.editBtn.click();
    }
    @When("Sales manager ad {string} in the Name Box")
    public void sales_manager_makes_changes_in_the_name_box(String changes) {
        dashboardPage.namePlaceholder.clear();
        dashboardPage.namePlaceholder.sendKeys(changes);
    }
    @When("Sales Manager clicks the Save button")
    public void sales_manager_clicks_the_save_button() {
        dashboardPage.saveButton.click();
    }
    @Then("Sales Manager should see edited {string}")
    public void sales_manager_should_see_edited_current_information(String name) {
        Assert.assertEquals(dashboardPage.information.getText(),name);

    }




}
