$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Expenses.feature");
formatter.feature({
  "line": 2,
  "name": "OneviewUpgrade",
  "description": "",
  "id": "oneviewupgrade",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NewExpensesCreation"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Creating a new Expenses",
  "description": "",
  "id": "oneviewupgrade;creating-a-new-expenses",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user log in to FFUAT sandbox",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on createnew label",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks \"Expenses\" from dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user navigate to \"Expense Entry\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewExpensesCreation.user_log_in_to_FFDEV_sandbox()"
});
formatter.result({
  "duration": 15651850099,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreation.user_is_on_homepage()"
});
formatter.result({
  "duration": 38897101,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreation.user_clicks_on_createnew_label()"
});
formatter.result({
  "duration": 83247301,
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
  "duration": 7045110100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Expense Entry",
      "offset": 18
    }
  ],
  "location": "NewExpensesCreation.user_navigate_to_Page(String)"
});
formatter.result({
  "duration": 72201,
  "status": "passed"
});
});