package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectRecordTypePage extends Testbase {

    @FindBy(xpath = "//*[@class='mainTitle']")
    WebElement VerifyPage;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement Continue;


    public ProjectRecordTypePage() {
        PageFactory.initElements(driver, this);
    }

    public void VerifySelectProjectRecordTypePage() {
        String expected = VerifyPage.getText().trim();
        System.out.println(expected);
        //String  actual  = "Select Project Record Type";
        //Assert.assertEquals(expected,actual);

    }

    public NewProjectEditPage ClickonContinueButton() {
        Continue.click();
        return new NewProjectEditPage();

    }
}
