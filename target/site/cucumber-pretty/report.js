$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Expenses/Expenses_PA.feature");
formatter.feature({
  "line": 2,
  "name": "Expenses",
  "description": "",
  "id": "expenses",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PAexpenseCreation"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating a new Expenses",
  "description": "",
  "id": "expenses;creating-a-new-expenses",
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
  "name": "user switch to login as PA Profile user",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on createnew label",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks \"Expenses\" from dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user move to \"Expense Entry\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user select the Resource",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user complete the Expenses Entry",
  "rows": [
    {
      "cells": [
        "Project",
        "Date",
        "ExpenseType",
        "Description",
        "TotalAmount",
        "Currency",
        "TaxType"
      ],
      "line": 12
    },
    {
      "cells": [
        "ALS Air",
        "",
        "Accommodation",
        "Test",
        "100",
        "British Pound",
        "VAT"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on \"Save All\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "expenses saved message displays",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user submit the expense",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "expenses submited message displays",
  "keyword": "Then "
});
formatter.match({
  "location": "NewExpensesCreation.user_log_in_to_FFUAT_sandbox()"
});
formatter.result({
  "duration": 16778007100,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreation.user_switch_to_login_as_PA_Profile_user()"
});
formatter.result({
  "duration": 12428403000,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreation.user_clicks_on_createnew_label()"
});
formatter.result({
  "duration": 101387900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Expenses",
      "offset": 13
    }
  ],
  "location": "NewExpensesCreation.user_clicks_from_dropdown_list(String)"
});
formatter.result({
  "duration": 4360679600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Expense Entry",
      "offset": 14
    }
  ],
  "location": "NewExpensesCreation.user_move_to_Page(String)"
});
formatter.result({
  "duration": 7508694100,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreation.user_select_the_Resource()"
});
formatter.result({
  "duration": 3124318900,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreation.user_complete_the_Expenses_Entry(DataTable)"
});
formatter.result({
  "duration": 6216484600,
  "error_message": "org.openqa.selenium.InvalidElementStateException: invalid element state: Element is not currently interactable and may not be manipulated\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027PBONTHALA-001\u0027, ip: \u0027192.168.39.99\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\PURNA~1.BON\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53721}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 72.0.3626.121, webStorageEnabled: true}\nSession ID: f6e0aa693a75e01992f553204d8dd33f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:118)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy14.clear(Unknown Source)\r\n\tat com.automationtest.pages.ExpenseEntryPage.ProjectSearchfield(ExpenseEntryPage.java:136)\r\n\tat com.automation.stepDefinations.NewExpensesCreation.user_complete_the_Expenses_Entry(NewExpensesCreation.java:70)\r\n\tat ✽.Then user complete the Expenses Entry(Expenses/Expenses_PA.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save All",
      "offset": 16
    }
  ],
  "location": "NewExpensesCreation.user_clicks_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewExpensesCreation.expenses_saved_message_displays()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewExpensesCreation.user_submit_the_expense()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewExpensesCreation.expenses_submited_message_displays()"
});
formatter.result({
  "status": "skipped"
});
});