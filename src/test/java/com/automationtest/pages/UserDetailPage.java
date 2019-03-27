package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailPage extends testbase {


  public UserDetailPage() { PageFactory.initElements(driver , this); }

  @FindBy(xpath = "//*[@id='topButtonRow']/input[4]")
  WebElement LoginButton_PAProfile;

  public void LoginasPAprofileuser() throws InterruptedException{
    LoginButton_PAProfile.click();



  }

}
