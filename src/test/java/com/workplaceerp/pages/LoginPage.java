package com.workplaceerp.pages;
import com.workplaceerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="login")
    public WebElement email;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement submit;



    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement name;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errormessage;

    @FindBy(xpath = "//input[@required='required']")
    public WebElement message;



    public void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.submit.click();
    }


}
