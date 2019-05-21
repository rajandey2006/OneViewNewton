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
    @FindBy(xpath = "//span[contains(@id, 'userNavLabel')]")
    WebElement User;
    @FindBy(xpath = "//a[contains(@title, 'Logout')]")
    WebElement Logout;
    @FindBy(xpath = "//a[contains(@title, 'Expense Reports Tab')]")
    WebElement ExpenseReports;


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
    public void loginasBusinessManager(){
        Setup.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Tom Elton");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName.click();
        LoginButton.click();


    }

    public void loginasFinanceAdmin(){
        User.click();
        Logout.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Lara Froud");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName.click();
        LoginButton.click();

    }

    public void loginasProjectManager(){
        User.click();
        Logout.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Peter Hatfield");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName.click();
        LoginButton.click();

    }
    public void loginasFinanceManager(){
        User.click();
        Logout.click();
        QuickSearchfield.clear();
        QuickSearchfield.sendKeys("Lucas Hall");
        QuickSearchfield.sendKeys(Keys.ENTER);
        ResourceName.click();
        LoginButton.click();

    }


    public void SearchProject() {
        Search.sendKeys("AutomationProject");
        Search.sendKeys(Keys.ENTER);

    }

    public void clickonExpenseReports(){
        ExpenseReports.click();

    }


    public void ClickonProjectName() {

        AutomationProject.click();
    }


}