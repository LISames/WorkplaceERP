package com.workplaceerp.step_definitions;

import com.workplaceerp.pages.BasePage;
import com.workplaceerp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ModulesStepDefs extends BasePage {

    WebDriver driver;

        /*
        if ("sales manager".equalsIgnoreCase(userType)) {
            // Code to log in as sales manager
            // For example:
            driver.get("https://qa.workplaceerp.com/web/login"); // Replace with the actual login page URL
            WebElement usernameInput = driver.findElement(By.id("Email"));
            WebElement passwordInput = driver.findElement(By.id("Password"));
            WebElement loginButton = driver.findElement(By.id("Log in"));

            usernameInput.sendKeys("salesmanager18@info.com");
            passwordInput.sendKeys("salesmanager");
            loginButton.click();
        }
*/


    @Then("user should see the following modules")
    public void userShouldSeeTheFollowingModules(List<String> expectedModulesItems) {

        BrowserUtils.sleep(5);

        List<String> actualModuleItems = new ArrayList<>();




        // actualModuleItems.addAll(BrowserUtils.getElementsText(menuOptions));

        for (WebElement element : menuOptions) {

            if (!element.getText().equals("") )
            {
                if(!element.getText().equals("More"))
                {
                    String actualItemText = element.getText();
                    actualModuleItems.add(actualItemText);
                }

            }

        }


        moreLink.click();
        for (WebElement each : menuOptionsMore) {
            String actualItemText = each.getText();
            actualModuleItems.add(actualItemText);
        }



        System.out.println("Expected Size: " + expectedModulesItems.size());
        System.out.println("Actual Size: " + actualModuleItems.size());



/*

            if (expectedItem.equals(actualItem)) {
                // Items match, do something (e.g., log or further validation)
            } else {
                // Items don't match, handle the mismatch as per your test requirements
                // For example, you can log the mismatch or throw an assertion error
                // depending on your needs.
                System.out.println("Mismatch found at index " + i + ":");
                System.out.println("Expected: " + expectedItem);
                System.out.println("Actual: " + actualItem);
                // or you can throw an AssertionError to fail the test immediately
                // throw new AssertionError("Mismatch found at index " + i + ": Expected: " + expectedItem + ", Actual: " + actualItem);
            }
        }
 */
            BrowserUtils.sleep(5);

            Assert.assertEquals(expectedModulesItems, actualModuleItems);

            //assertThat(actualModuleItems, is(equalTo(expectedModulesItems)));


        }




    /*
    @Then("user should see {} modules")
    public void userShouldSeeModules(int expectedModuleCount) {

        List<WebElement> moduleElements = driver.findElements(By.cssSelector("div[class='navbar-header']"));

        int actualModuleCount = moduleElements.size();

        Assert.assertEquals(String.valueOf(expectedModuleCount), actualModuleCount, "Number of modules is incorrect.");

     //   Assert.assertEquals(19, moduleElements.size());
    }

     */


    }
