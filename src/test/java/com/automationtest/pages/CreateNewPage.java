package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPage extends testbase {
    @FindBy(xpath = "//span[@id='createNewLabel']")
    WebElement createNewLabel;

    @FindBy(xpath = "//a[@href='/setup/ui/recordtypeselect.jsp?ent=01I58000000B9Jd&retURL=%2Fhome%2Fhome.jsp&save_new_url=%2Fa5c%2Fe%3FretURL%3D%252Fhome%252Fhome.jsp']")
    WebElement SelectProjectLabel;


    public CreateNewPage() {
        PageFactory.initElements(driver, this);
    }


    public void Clickoncreatenewpagelink() {
        createNewLabel.click();


    }

    public ProjectRecordTypePage ClickProjectLable() {
        SelectProjectLabel.click();
        return new ProjectRecordTypePage();


    }


}