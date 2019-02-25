package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends testbase {
    // PageFactory

    @FindBy(xpath = "//span[@class='subMsg normalImportance'][2]")
    WebElement FFUAT;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public CreateNewPage VerifyFFDEV() {
        String Actual = FFUAT.getText().trim();
        String Expected = "FFUat";
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);

        return new CreateNewPage();


    }

}