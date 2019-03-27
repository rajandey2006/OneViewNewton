package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends testbase {
    // PageFactory

    @FindBy(xpath = "//span[@class='subMsg normalImportance'][2]")
    WebElement FFUAT;

    @FindBy(xpath = "//a[@id='setupLink']")
    WebElement Setup;

    @FindBy(xpath = "//input[@name='setupSearch']")
    WebElement QuickSearchfield;
    @FindBy(xpath = "//a[@class='nameURL uiOutputURL']")
    WebElement ResourceName_ZoeBaker;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void VerifyFFDEV() {
        String Actual = FFUAT.getText().trim();
        String Expected = "FFUat";
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);


    }


    public CreateNewPage LoginasPA() {
        Setup.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Zoe Baker");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName_ZoeBaker.click();

        return new CreateNewPage();

    }


}