package com.automation.stepDefinations;

import com.automationtest.base.testbase;
import com.automationtest.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewExpensesCreation extends testbase {
    LoginPage loginpage;
    HomePage homepage;
    CreateNewPage createnewpage;
    ProjectRecordTypePage projectRecordTypePage;
    NewProjectEditPage newProjectEditPage;
    ExpensesPage expensesPage;

    public NewExpensesCreation() {
        super();
    }

    @Given("^user log in to FFUAT sandbox$")
    public void user_log_in_to_FFDEV_sandbox() throws Throwable {
        testbase.intialization();
        loginpage = new LoginPage();
        loginpage.EnterEmailAddress(prop.getProperty("Username"));
        loginpage.EnterPassword(prop.getProperty("Password"));
        loginpage.login();



    }

    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        homepage=new HomePage();
        homepage.VerifyFFDEV();


    }

    @When("^user clicks on createnew label$")
    public void user_clicks_on_createnew_label() throws Throwable {
        createnewpage = new CreateNewPage();
        createnewpage.Clickoncreatenewpagelink();

    }

    @When("^user clicks \"([^\"]*)\" from dropdown list$")
    public void user_clicks_from_dropdown_list(String arg1) throws Throwable {
        expensesPage = new ExpensesPage();
        expensesPage.ClickExpensesLable();


    }

    @Then("^user navigate to \"([^\"]*)\" Page$")
    public void user_navigate_to_Page(String arg1) throws Throwable {

    }


}
