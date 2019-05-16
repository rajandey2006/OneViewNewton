package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.*;
import cucumber.api.java.en.Then;


public class ResourceRequestsSteps extends Testbase {
    ProjectDetailPage projectDetailPage;
    ResourceRequestsPage resourceRequestsPage;
    UpdateResourceRequestsPage updateResourceRequestsPage;
    AddResourceRequestsPage addResourceRequestsPage;


    public ResourceRequestsSteps() {

        super();
    }


    @Then("^user update the Resourcesrequest$")
    public void user_update_the_Resourcesrequest() throws Throwable {
        projectDetailPage = new ProjectDetailPage();
        projectDetailPage.ClickonUpdateResourceField();
        resourceRequestsPage = new ResourceRequestsPage();
        resourceRequestsPage.ClickonCreateResourceRequests();

    }

    @Then("^user complete the UpdateResourceRequestsform$")
    public void user_complete_the_UpdateResourceRequestsform() throws Throwable {
        updateResourceRequestsPage = new UpdateResourceRequestsPage();
        updateResourceRequestsPage.EnterRoleTitle();
        updateResourceRequestsPage.SelectResourceRole();
        updateResourceRequestsPage.EnterRequestedHours();
        updateResourceRequestsPage.SelectStartDate();
        updateResourceRequestsPage.SelectEndDate();
        updateResourceRequestsPage.SelectStatus();
        updateResourceRequestsPage.ClickonQuickUpdateSelectedResourceRequests();

    }

    @Then("^user verify the Succuess message$")
    public void user_verify_the_Succuess_message() throws Throwable {
        updateResourceRequestsPage.ClickonSaveUpdateResourceRequestsButton();
    }


    @Then("^user add Resource Requests from Template$")
    public void user_add_Resource_Requests_from_Template() throws Throwable {
        addResourceRequestsPage = new AddResourceRequestsPage();
        addResourceRequestsPage.clickonAddResourcesRequestsFromTemplateButton();
        addResourceRequestsPage.selectProjectTemplateRadioButton();
        addResourceRequestsPage.clickonSelectButton();


    }

    @Then("^user add the Template to the project$")
    public void user_add_the_Template_to_the_project() throws Throwable {
        addResourceRequestsPage.clickonAddtoProject();
    }




}









































