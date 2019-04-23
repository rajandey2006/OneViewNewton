package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends testbase {

    // PageFactory
    @FindBy(id = "username")
    WebElement UsernameField;

    @FindBy(xpath = "//input[@id='password']")
    WebElement PasswordField;

    @FindBy(xpath = "//*[@id='Login']")
    WebElement LogintoSandbox;




    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public void EnterEmailAddress(String Username) {
        UsernameField.sendKeys(Username);

    }

    public void EnterPassword(String Password) {
        PasswordField.sendKeys(Password);

    }

    public HomePage login() {

        LogintoSandbox.click();
        return new HomePage();

    }

}


