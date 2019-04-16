package com.automation.stepDefinations;

import com.automationtest.base.testbase;
import com.automationtest.pages.HomePage;
import com.automationtest.pages.LoginPage;
import cucumber.api.java.en.Given;

public class CommonSteps extends testbase {

    LoginPage loginpage;
    HomePage homepage;


    public CommonSteps() {

        super();
    }
    @Given("^user log in to FFUAT sandbox$")
    public void user_log_in_to_FFUAT_sandbox() throws Throwable {
        testbase.intialization();
        loginpage = new LoginPage();
        loginpage.EnterEmailAddress(prop.getProperty("Username"));
        loginpage.EnterPassword(prop.getProperty("Password"));
        loginpage.login();
        homepage = new HomePage();
        homepage.VerifyFFDEV();


    }
    
}
