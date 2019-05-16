package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.*;
import cucumber.api.java.en.Then;


public class YellowFormSteps extends Testbase {
    HomePage homePage;
    CreateNewPage createNewPage;
    ProjectRecordTypePage projectRecordTypePage;
    NewProjectEditPage newProjectEditPage;
    ProjectDetailPage projectDetailPage;
    ResourceRequestsPage resourceRequestsPage;
    UpdateResourceRequestsPage updateResourceRequestsPage;
    YellowFormPage yellowFormPage;


    public YellowFormSteps() {

        super();
    }


    @Then("^user clicks on 'Yellow Form Report' button$")
    public void user_clicks_on_Yellow_Form_Report_button() throws Throwable {
        projectDetailPage.ClickonYelloFormReportButton();
        yellowFormPage = new YellowFormPage();
    }

    @Then("^user validate the Yellow Form$")
    public void user_validate_the_Yellow_Form() throws Throwable {

        yellowFormPage.SwitchtoYellowFormPageWindow();

        //yellowFormPage.VerifyYellowFormReport();


    }

    @Then("^user send the Yellow Form to recipient$")
    public void user_send_the_Yellow_Form_to_recipient() throws InterruptedException {
        Thread.sleep(4000);
        yellowFormPage.ClickonEditButton();
        yellowFormPage.AddEmailAddress();

    }


}









































