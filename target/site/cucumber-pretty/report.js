$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Project.feature");
formatter.feature({
  "line": 2,
  "name": "Opportunity",
  "description": "",
  "id": "opportunity",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NewProjectCreation"
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
        "New",
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
  "name": "user move the OpportunityStage fromstage three to two",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user move the OpportunityStage from stage two to stage live",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_in_to_FFUAT_sandbox()"
});
formatter.result({
  "duration": 16827705100,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027PBONTHALA-001\u0027, ip: \u0027192.168.39.99\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\PURNA~1.BON\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49357}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 73.0.3683.103, webStorageEnabled: true}\nSession ID: 64717c6fd6dc6531d1f40af63e5d3fb1\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027subMsg normalImportance\u0027][2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getText(Unknown Source)\r\n\tat com.automationtest.pages.HomePage.VerifyFFDEV(HomePage.java:31)\r\n\tat com.automation.stepDefinations.CommonSteps.user_log_in_to_FFUAT_sandbox(CommonSteps.java:26)\r\n\tat ✽.Given user log in to FFUAT sandbox(Project.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.user_clicks_on_createnew_label()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_clicks_Project_from_dropdown_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_to_Select_Project_Record_Type_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_clicks_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_to_New_project_Edit_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_complete_the_new_project_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_clicks_on_Save_button()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_the_Opportunitystage_from_stage_five_to_stage_four()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_the_Opportunitystage_from_stage_four_to_three()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SalesOpportunitySteps.user_move_the_OpportunityStage_from_stage_two_to_stage_live()"
});
formatter.result({
  "status": "skipped"
});
});