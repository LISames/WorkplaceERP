package com.workplaceerp.step_definitions;

import com.workplaceerp.pages.LoginPage;
import com.workplaceerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_POS_CRM_LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")

    public void i_am_on_the_login_page() {
        Driver.getDriver().get("https://qa.workplaceerp.com/web/login");
    }

    @When("I login using {string} and {string}")

    public void i_login_using_and(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("account holder name should be {string}")

    public void account_holder_name_should_be(String expectName) {
        String actualName = loginPage.name.getText();
        Assert.assertEquals(actualName, expectName);

    }


    @Then("User see {string} is displayed")

    public void user_see_is_displayed(String expectErrormessage) {
        String actualErrormessage = loginPage.errormessage.getText();
        Assert.assertEquals(actualErrormessage, expectErrormessage);

    }


    @Then("User see message is in the blank field")
    public void user_see_message_is_in_the_blank_field() {

        String expectedAttributeValue = "Please fill out this field.";

        boolean isEmailEmpty = loginPage.email.getText().isEmpty();
        boolean isPasswordEmpty = loginPage.password.getText().isEmpty();

        if (isEmailEmpty && isPasswordEmpty) {

        } else if (isEmailEmpty) {

            String actualAttributeValue = loginPage.email.getAttribute("validationMessage");
            Assert.assertTrue(expectedAttributeValue.equals(actualAttributeValue));
        } else {

            String actualAttributeValue = loginPage.password.getAttribute("validationMessage");
            Assert.assertTrue(expectedAttributeValue.equals(actualAttributeValue));
        }
    }


}
