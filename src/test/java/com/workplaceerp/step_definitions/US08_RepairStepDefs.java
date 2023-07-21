package com.workplaceerp.step_definitions;

import com.sun.jdi.IntegerValue;
import com.workplaceerp.pages.BasePage;
import com.workplaceerp.pages.RepairPage_LS;
import com.workplaceerp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class US08_RepairStepDefs extends BasePage
{
    RepairPage_LS repairPageLs = new RepairPage_LS();

    @When("user clicks on the {string} repair menu option")
    public void user_clicks_on_the_repair_menu_option(String expectedMenuOption)
    {
        BrowserUtils.sleep(5);

        for (WebElement each : menuOptions)
        {
            if(each.getText().equalsIgnoreCase(expectedMenuOption))
            {
                each.click();
            }
        }
    }
    @When("user is able to successfully access and see the {string} table")
    public void user_is_able_to_successfully_access_and_see_the_table(String expectedTitle)
    {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Then("user should see the following {int} features:")
    public void user_should_see_the_following_features(Integer expectedNumberOfColumns, List<String> expectedTableHeaders) {
        int actualSize = repairPageLs.tableHeaders.size()-1;
        Assert.assertTrue("number of columns don't match",expectedNumberOfColumns == actualSize);

        List<String> actualTableHeaders = new ArrayList<>();

        for (WebElement each : repairPageLs.tableHeaders)
        {
            if(!each.getText().isEmpty())
            {
                actualTableHeaders.add(each.getText());
            }
        }

        BrowserUtils.sleep(2);

        Assert.assertEquals(expectedTableHeaders, actualTableHeaders);
    }



    @Then("user searches repair reference in the search box and sees relevant results:")
    public void userSearchesRepairReferenceInTheSearchBoxAndSeesRelevantResults(List<String> searchRMA)
    {
        BrowserUtils.sleep(10);
        BrowserUtils.sleep(10);
        for (String each : searchRMA)
        {
            repairPageLs.searchBox.sendKeys(each);
            BrowserUtils.sleep(4);
            repairPageLs.searchBox.sendKeys(Keys.ENTER);
            BrowserUtils.waitForVisibility(repairPageLs.removeSearch, 10);

            BrowserUtils.sleep(5);
            Assert.assertTrue((repairPageLs.firstElementAfterSearch.getText().equalsIgnoreCase(each)));

            repairPageLs.removeSearch.click();

        }
        for (String each : searchRMA)
        {
            repairPageLs.searchBox.sendKeys(each);
            BrowserUtils.sleep(4);
            repairPageLs.searchBox.sendKeys(Keys.ENTER);
            BrowserUtils.waitForVisibility(repairPageLs.removeSearch, 10);

            BrowserUtils.sleep(5);
            Assert.assertTrue((repairPageLs.firstElementAfterSearch.getText().equalsIgnoreCase(each)));

            repairPageLs.removeSearch.click();

        }
    }
}
