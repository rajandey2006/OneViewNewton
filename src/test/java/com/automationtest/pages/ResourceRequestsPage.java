package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourceRequestsPage extends testbase {


    @FindBy(xpath = "//input[@value='Create Resource Requests' and @type='submit']")
    WebElement CreateResourceRequests;

    public ResourceRequestsPage() {
        PageFactory.initElements(driver, this);
    }


    public void ClickonCreateResourceRequests() {
        CreateResourceRequests.click();
    }


}
