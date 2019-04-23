$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sales Opportunity/RolestoProject.feature");
formatter.feature({
  "line": 2,
  "name": "Opportunity",
  "description": "",
  "id": "opportunity",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AllocateRolestoProject"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating a new Project",
  "description": "",
  "id": "opportunity;creating-a-new-project",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user log in to FFUAT sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on createnew label",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks \u0027Project\u0027 from dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user move to \u0027Select Project Record Type\u0027 Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on \u0027Continue\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user move to \u0027New project\u0027 Edit page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user complete the new project details",
  "rows": [
    {
      "cells": [
        "AccountName",
        "ProjectName",
        "ProjectType",
        "Region",
        "Sector",
        "ProjectFees",
        "StartDate",
        "DurationInWeeks",
        "Probability",
        "SalesLead"
      ],
      "line": 12
    },
    {
      "cells": [
        "ACA",
        "AutomationProject",
        "",
        "UK",
        "Air",
        "10000",
        "",
        "4",
        "50",
        "Adam Walker"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on \u0027Save\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user navigate to \"\u003cProject Detail\u003e\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user move the OpportunityStage from stage five to stage four",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user move the OpportunityStage from stage four to three",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user move the OpportunityStage from stage three to two",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user switch to login as Scheduling Profile user",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "search for projectName",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user update the Resourcesrequest",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user complete the UpdateResourceRequestsform",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user verify the Succuess message",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Delete the project",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_in_to_FFUAT_sandbox()"
});
formatter.result({
  "duration": 21564647600,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.user_clicks_on_createnew_label()"
});
formatter.result({
  "duration": 153352600,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_clicks_Project_from_dropdown_list()"
});
formatter.result({
  "duration": 969269200,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_to_Select_Project_Record_Type_Page()"
});
formatter.result({
  "duration": 73695400,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_clicks_on_Continue_button()"
});
formatter.result({
  "duration": 1678204200,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_to_New_project_Edit_page()"
});
formatter.result({
  "duration": 1522100,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_complete_the_new_project_details(DataTable)"
});
formatter.result({
  "duration": 3969545500,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_clicks_on_Save_button()"
});
formatter.result({
  "duration": 4424216900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cProject Detail\u003e",
      "offset": 18
    }
  ],
  "location": "SalesOpportunitySteps.user_navigate_to_Page(String)"
});
formatter.result({
  "duration": 1252200,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_the_Opportunitystage_from_stage_five_to_stage_four()"
});
formatter.result({
  "duration": 5131005700,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_the_Opportunitystage_from_stage_four_to_three()"
});
formatter.result({
  "duration": 5761296600,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_the_Opportunitystage_fromstage_three_to_two()"
});
formatter.result({
  "duration": 4369819700,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_switch_to_login_as_Scheduling_Profile_user()"
});
formatter.result({
  "duration": 8000921200,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.search_for_project()"
});
formatter.result({
  "duration": 1995306500,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_update_the_Resourcesrequest()"
});
formatter.result({
  "duration": 5366021000,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_complete_the_UpdateResourceRequestsform()"
});
formatter.result({
  "duration": 764760100,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_verify_the_Succuess_message()"
});
formatter.result({
  "duration": 76769700,
  "status": "passed"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_Delete_the_project()"
});
formatter.result({
  "duration": 1514168400,
  "status": "passed"
});
});