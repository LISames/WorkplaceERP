package com.workplaceerp.step_definitions;

import com.workplaceerp.pages.BasePage;
import com.workplaceerp.utilities.BrowserUtils;
import com.workplaceerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US15_StepDefsFB extends BasePage
{
    @Given("user sees all modules displayed")
    public void userSeesAllModulesDisplayed()
    {
        //verifies all the modules are visible
        for (WebElement eachModule : menuOptions)
        {
            if(!eachModule.getAttribute("id").equals("menu_more_container"))
            {
                BrowserUtils.sleep(1);
                Assert.assertTrue(eachModule.isDisplayed());
            }

        }
    }
    @Then("user can click different modules")
    public void user_can_click_different_modules()
    {
        //verifies all the modules are enabled
        for (WebElement eachModule : menuOptions)
        {
            if (!eachModule.getAttribute("id").equals("menu_more_container"))
            {
                Assert.assertTrue(eachModule.isEnabled());
            }

        }
    }
    @Given("user can see {int} modules as follows:")
    public void user_can_see_modules_as_follows(Integer expectedNumberOfModules, List<String> expectedModules)
    {
        //list of string to store all the modules names
        List <String> actualModules = new ArrayList<>();

        for (WebElement each : menuOptions)
        {
            if(!each.getAttribute("id").equals("menu_more_container"))
            {
                BrowserUtils.sleep(1);
                actualModules.add(each.getText());
            }
        }

        //verifies the number of modules are the same as expected
        int actualNumberOfModules = actualModules.size();
        Assert.assertTrue(actualNumberOfModules == expectedNumberOfModules);

        //verifies the actual name of modules is as expected
        Assert.assertEquals(actualModules, expectedModules);


    }

    }

