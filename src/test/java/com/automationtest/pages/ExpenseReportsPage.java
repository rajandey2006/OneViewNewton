package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpenseReportsPage extends Testbase {
    @FindBy(xpath = "//select[@id='fcf']")
    WebElement ViewDropdown;
    @FindBy(xpath = "//input[@name='go' and @value=' Go! ']")
    WebElement GoButton;
    @FindBy(xpath = "//*[@id=\"ext-gen11\"]/div[1]/table/tbody/tr/td[4] ")
    WebElement SelectedforAuditCheckbox;
    @FindBy(xpath = "//input[@id='00N5800000DBHbq' and @type='checkbox']")
    WebElement EditAuditCheckbox;
    @FindBy(xpath = "//input[@id='saveButton' and @value='Save']")
    WebElement SaveButton;
    @FindBy(xpath = "//*[@id=\"ext-gen11\"]/div[1]/table/tbody/tr/td[5]")
    WebElement AuditApprovedtoReimburseCheckbox;
    @FindBy(xpath = "//input[@id='00N5800000DBFNf' and @type='checkbox']")
    WebElement EditAuditApprovedtoReimburseCheckbox;



    public ExpenseReportsPage() {
        PageFactory.initElements(driver, this);
    }


public void SelectAudit(){
    Select AuditDropdown = new Select(ViewDropdown);
    AuditDropdown.selectByVisibleText("1 - Audit - Available");
   GoButton.click();

    }

    public void clickonSelecteforAuditCheckbox(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = SelectedforAuditCheckbox;
        actions.doubleClick(elementLocator).perform();
        EditAuditCheckbox.click();
        SaveButton.click();

    }

    public void cilckonAuditApprovedtoReimburseCheckbox() throws InterruptedException{
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement elementLocator = AuditApprovedtoReimburseCheckbox;
        actions.doubleClick(elementLocator).perform();
        EditAuditApprovedtoReimburseCheckbox.click();
        SaveButton.click();


    }



}