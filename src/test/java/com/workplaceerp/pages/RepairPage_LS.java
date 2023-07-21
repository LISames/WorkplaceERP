package com.workplaceerp.pages;

import com.workplaceerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairPage_LS
{
    public RepairPage_LS()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//thead//th")
    public List<WebElement> tableHeaders;

    @FindBy(css = "input.o_searchview_input")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody//td[contains (., 'RMA/')]")
    public List<WebElement> rmaListNumber;

    @FindBy (xpath = "//input[@class = 'o_searchview_input']")
    public WebElement searchResultOption;

    @FindBy(xpath = "//tbody//td[@width = '1']/following-sibling::td[1]")
    public WebElement firstElementAfterSearch;

    @FindBy(xpath = "//div[@class = 'fa fa-sm fa-remove o_facet_remove']")
    public WebElement removeSearch;


}
