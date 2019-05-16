package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountRecordTypePage extends Testbase {

    @FindBy(xpath = "//select[@id='p3' and @name='p3']")
    WebElement RecordTypeofnewrecord;
    @FindBy(xpath = "//input[@value='Continue' and @name='save']")
    WebElement ContinueButton;


    public AccountRecordTypePage() {
        PageFactory.initElements(driver, this);
    }

    public void SelectRecordTypeasUKcustomer() {

        Select RecordType = new Select(RecordTypeofnewrecord);
        RecordType.selectByVisibleText("UK Customer");

    }

    public void SelectRecordTypeasUKsupplier() {

        Select RecordType = new Select(RecordTypeofnewrecord);
        RecordType.selectByVisibleText("UK Supplier");

    }

    public void ClickonContinueButton() {

        ContinueButton.click();
    }
}
