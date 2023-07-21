package com.workplaceerp.pages;
import com.workplaceerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
public class AddToInventory_NY {
    public AddToInventory_NY() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=347&action=']")
    public WebElement inventoryTab;

    @FindBy(xpath = "//a[@href='/web#menu_id=378&action=521']")
    public WebElement productTab;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement productNameInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement Product;

    @FindBy(xpath = "//div[@class='o_view_manager_content']//div[22]")
    public WebElement newProduct;

    @FindBy(xpath = "//div[@class='o_form_buttons_view']/button[1]")
    public WebElement clickEditButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement ProductSearchBox;




    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement editedProductInput;

    @FindBy(xpath = "//div[@class='oe_kanban_details']//strong/span[.='Alienware Area 51-m']")
    public WebElement productToEdit;

    //
}



