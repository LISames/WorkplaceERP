package com.workplaceerp.step_definitions;

import com.workplaceerp.pages.BasePage;
import com.workplaceerp.pages.LoginPage;
import com.workplaceerp.utilities.BrowserUtils;
import com.workplaceerp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

public class LoginStepDefs 
{

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("POS Manager")){
            username = ConfigurationReader.getProperty("POS_manager_username");
            password = ConfigurationReader.getProperty("POS_manager_password");
        }else if(userType.equalsIgnoreCase("CRM Manager")){
            username = ConfigurationReader.getProperty("CRM_manager_username");
            password = ConfigurationReader.getProperty("CRM_manager_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("inventory manager")){
            username = ConfigurationReader.getProperty("inventory_manager_username");
            password = ConfigurationReader.getProperty("inventory_manager_password");
        }else if(userType.equalsIgnoreCase("expenses manager")){
            username = ConfigurationReader.getProperty("expenses_manager_username");
            password = ConfigurationReader.getProperty("expenses_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password)
    {
        BrowserUtils.sleep(2);
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);



    }








}
