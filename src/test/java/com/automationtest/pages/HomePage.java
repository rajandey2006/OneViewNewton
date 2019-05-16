package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Testbase {
    // PageFactory

    @FindBy(xpath = "//span[@class='subMsg normalImportance'][2]")
    WebElement FFUAT;

    @FindBy(xpath = "//a[@id='setupLink' and @title='Setup']")
    WebElement Setup;

    @FindBy(xpath = "//input[@name='setupSearch']")
    WebElement QuickSearchfield;
    @FindBy(xpath = "//a[@class='nameURL uiOutputURL']")
    WebElement ResourceName;
    @FindBy(xpath = "//input[@name='login' and @type='button']")
    WebElement LoginButton;
    @FindBy(xpath = "//input[@id='phSearchInput' and @name='str']")
    WebElement Search;
    @FindBy(xpath = "//*[@id='pse__Proj__c_body']/table/tbody/tr[2]/th/a")
    WebElement AutomationProject;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void VerifyFFDEV() {
        String Actual = FFUAT.getText().trim();
        String Expected = "FFUat";
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);


    }


    public void LoginasPA() {
        Setup.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Zoe Baker");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName.click();


    }

    public void LoginasSchedulingAdmin() {
        Setup.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Henry Kenyon");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName.click();
        LoginButton.click();

    }

    public void SearchProject() {
        Search.sendKeys("AutomationProject");
        Search.sendKeys(Keys.ENTER);

    }

    public void ClickonProjectName() {

        AutomationProject.click();
    }


}