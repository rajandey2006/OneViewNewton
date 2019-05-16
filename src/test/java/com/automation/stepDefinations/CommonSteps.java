package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.HomePage;
import com.automationtest.pages.LoginPage;
import cucumber.api.java.en.Given;

public class CommonSteps extends Testbase {

    LoginPage loginpage;
    HomePage homepage;


    public CommonSteps() {

        super();
    }

    @Given("^user log in to FFUAT sandbox$")
    public void user_log_in_to_FFUAT_sandbox() throws Throwable {
        Testbase.intialization();
        loginpage = new LoginPage();
        loginpage.EnterEmailAddress(prop.getProperty("Username"));
        loginpage.EnterPassword(prop.getProperty("Password"));
        loginpage.login();
        homepage = new HomePage();
        homepage.VerifyFFDEV();


    }

}
