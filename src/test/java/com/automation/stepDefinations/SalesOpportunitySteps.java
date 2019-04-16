package com.automation.stepDefinations;

import com.automationtest.base.testbase;
import com.automationtest.pages.CreateNewPage;
import com.automationtest.pages.NewProjectEditPage;
import com.automationtest.pages.ProjectDetailPage;
import com.automationtest.pages.ProjectRecordTypePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.Map;


public class SalesOpportunitySteps extends testbase {

    CreateNewPage createNewPage;
    ProjectRecordTypePage projectRecordTypePage;
    NewProjectEditPage newProjectEditPage;
    ProjectDetailPage projectDetailPage;



    public SalesOpportunitySteps() {

     super();
    }

    @Then("^user clicks 'Project' from dropdown list$")
    public void user_clicks_Project_from_dropdown_list() throws Throwable {
        createNewPage = new CreateNewPage();
        createNewPage.ClickProjectLable();

    }

    @Then("^user move to 'Select Project Record Type' Page$")
    public void user_move_to_Select_Project_Record_Type_Page() throws Throwable {
         projectRecordTypePage = new ProjectRecordTypePage();
         projectRecordTypePage.VerifySelectProjectRecordTypePage();



    }

    @Then("^user clicks on 'Continue' button$")
    public void user_clicks_on_Continue_button() throws Throwable {
        projectRecordTypePage.ClickonContinueButton();
    }



    @Then("^user move to 'New project' Edit page$")
    public void user_move_to_New_project_Edit_page() throws Throwable {
        newProjectEditPage=new NewProjectEditPage();



    }
    @Then("^user complete the new project details$")
    public void user_complete_the_new_project_details(DataTable ProjectData) throws Throwable {
        for (Map <String, String> data : ProjectData.asMaps(String.class, String.class)) {
            newProjectEditPage.EnterAccountName(data.get("AccountName"));
            newProjectEditPage.EnterProjectName(data.get("ProjectName"));
            newProjectEditPage.SelectProjectType();
            newProjectEditPage.EnterRegion(data.get("Region"));
            newProjectEditPage.EnterSector(data.get("Sector"));
            newProjectEditPage.EnterProjectFees(data.get("ProjectFees"));
            newProjectEditPage.EnterStartDate();
            newProjectEditPage.EnterDurtaionInWeeks(data.get("DurationInWeeks"));
            newProjectEditPage.EnterProbablity(data.get("Probability"));
            newProjectEditPage.EnterSaleslead(data.get("SalesLead"));



        }
    }

    @Then("^user clicks on 'Save' button$")
    public void user_clicks_on_Save_button() throws Throwable {

        newProjectEditPage.ClickonSave();
    }

    @Then("^user navigate to \"([^\"]*)\" Page$")
    public void user_navigate_to_Page(String arg1) throws Throwable {

    }

    @Then("^user move the OpportunityStage from stage five to stage four$")
    public void user_move_the_Opportunitystage_from_stage_five_to_stage_four() throws Throwable {
       projectDetailPage= new ProjectDetailPage();
       projectDetailPage.ClickonEditbutton();
       projectDetailPage.SelectOpportunityStage4();


    }

    @Then("^user move the OpportunityStage from stage four to three$")
    public void user_move_the_Opportunitystage_from_stage_four_to_three() throws Throwable {
        projectDetailPage.ClickonEditbutton();
        projectDetailPage.SelectOpportunityStage3();

    }

    @Then("^user move the OpportunityStage from stage three to two$")
    public void user_move_the_Opportunitystage_fromstage_three_to_two() throws Throwable {
        projectDetailPage.ClickonEditbutton();
        projectDetailPage.SelectOpportunityStage2();

    }

    @Then("^user move the OpportunityStage from stage two to stage live$")
    public void user_move_the_OpportunityStage_from_stage_two_to_stage_live() throws Throwable {
        projectDetailPage.ClickonEditbutton();
        projectDetailPage.SelectOpportunityStage1();

    }



        }







































