package com.workplaceerp.step_definitions;

import com.workplaceerp.pages.BasePage;
import com.workplaceerp.pages.LoginPage;
import com.workplaceerp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US02StepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_button() {
      loginPage.submit.click();
    }

    @When("the user enters invalid {string} and valid {string}")
    public void the_user_enters_invalid_and_valid(String username, String password) {

        loginPage.email.sendKeys(username);
        loginPage.password.sendKeys(password);
      
    }

    @Then("the {string} error message should be displayed")
    public void the_error_message_should_be_displayed(String str) {

        String expectedErrorMessage = str;

        BrowserUtils.waitForVisibility(loginPage.errorMessage, 10);

        String actualErrorMessage = loginPage.errorMessage.getText();

        BrowserUtils.verifyElementDisplayed(loginPage.errorMessage);
        Assert.assertTrue(str.equals(actualErrorMessage));

    }

    @When("the user enters valid {string} and invalid {string}")
    public void theUserEntersValidAndInvalid(String username, String password) {

        loginPage.email.sendKeys(username);
        loginPage.password.sendKeys(password);

    }


    @Then("user sees - Please fill in this field. - for at least one field")
    public void userSeesForAtLeastOneField() {

        String expectedAttributeValue = "Please fill in this field.";

        if (loginPage.email.getText().isEmpty()) {
            String actualAttributeValue = loginPage.email.getAttribute("validationMessage");
            Assert.assertTrue(expectedAttributeValue.equals(actualAttributeValue));
        } else {
            String actualAttributeValue = loginPage.password.getAttribute("validationMessage");
            Assert.assertTrue(expectedAttributeValue.equals(actualAttributeValue));
        }


    }

    @When("the user enters valid username {string} and password {string}")
    public void theUserEntersValidUsernameAndPassword(String username, String password) {

        loginPage.email.sendKeys(username);
        loginPage.password.sendKeys(password);

    }

    @Then("the user should be logged in successfully and see his name according to the {string}")
    public void theUserShouldBeLoggedInSuccessfully(String expectedInName) {

        BrowserUtils.waitForVisibility(name, 10);
        String actualName = name.getText().toLowerCase();
        Assert.assertTrue(expectedInName.contains(actualName));
    }
    

    @And("the user presses {string} key")
    public void theUserPressesKey(String key) {
        loginPage.password.sendKeys(Keys.ENTER);
    }

    @When("the user enters invalid username {string} and invalid password {string}")
    public void theUserEntersInvalidUsernameAndInvalidPassword(String invalidUsername, String invalidPassword) {
        loginPage.email.sendKeys(invalidUsername);
        loginPage.password.sendKeys(invalidPassword);
    }


    @When("the user submits empty {string} and {string}")
    public void theUserSubmitsEmptyAnd(String username, String password) {

        loginPage.email.sendKeys(username);
        loginPage.password.sendKeys(password);


    }
}
