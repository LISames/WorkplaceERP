package com.workplaceerp.pages;

import com.workplaceerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage_ZD {
    public MainModulesPage_ZD(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']")
    public WebElement salesBtn;
    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']")
    public WebElement customerTab;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement CreateBtn;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement namePlaceholder;
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;
    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement information;
    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div")
    public List<WebElement> allCustomers;
    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[2]")
    public WebElement customer;
    @FindBy(xpath = "//div[@class='o_form_buttons_view']/button[1]   ")
    public WebElement editBtn;



    public void anyCustomer(){
        List<WebElement> customerIdBoxes = allCustomers;
        for (WebElement box : customerIdBoxes) {
            String customerId = box.getText();
            if(customerId.equals("AHMET")){
                box.click();
               // BrowserUtils.sleep(10);
               // Driver.getDriver().navigate().back();

            }

        }
    }
}
