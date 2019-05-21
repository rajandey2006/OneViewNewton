$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Expenses/BillingEvent.feature");
formatter.feature({
  "line": 2,
  "name": "Expenses",
  "description": "",
  "id": "expenses",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BillingEventCreation"
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
  "name": "user switch to login as Businees Manager(Tom Elton) Profile user",
  "keyword": "Then "
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
      "line": 11
    },
    {
      "cells": [
        "Weetabix Limited",
        "",
        "Accommodation",
        "Test",
        "1234",
        "British Pound",
        "VAT"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on \"Save All\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "expenses saved message displays",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user submit the expense",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "expenses submitted message displays",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.user_log_in_to_FFUAT_sandbox()"
});
formatter.result({
  "duration": 17132568200,
  "status": "passed"
});
formatter.match({
  "location": "BillingEventCreationSteps.user_switch_to_login_as_Businees_Manager_Tom_Elton_Profile_user()"
});
formatter.result({
  "duration": 9094992900,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.user_clicks_on_createnew_label()"
});
formatter.result({
  "duration": 119638200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Expenses",
      "offset": 13
    }
  ],
  "location": "NewExpensesCreationSteps.user_clicks_from_dropdown_list(String)"
});
formatter.result({
  "duration": 4477597400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Expense Entry",
      "offset": 14
    }
  ],
  "location": "NewExpensesCreationSteps.user_move_to_Page(String)"
});
formatter.result({
  "duration": 7379401900,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.user_complete_the_Expenses_Entry(DataTable)"
});
formatter.result({
  "duration": 35912262700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Save All",
      "offset": 16
    }
  ],
  "location": "NewExpensesCreationSteps.user_clicks_on_button(String)"
});
formatter.result({
  "duration": 57100,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.expenses_saved_message_displays()"
});
formatter.result({
  "duration": 26500,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.user_submit_the_expense()"
});
formatter.result({
  "duration": 32400,
  "status": "passed"
});
formatter.match({
  "location": "NewExpensesCreationSteps.expenses_submitted_message_displays()"
});
formatter.result({
  "duration": 48500,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Expense Record Approval Process",
  "description": "",
  "id": "expenses;expense-record-approval-process",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user switch to login as Finance Admin Profile user",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Finance Admin user complete the Audit approval process",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user switch to login as Project Manager profile user",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Project Manager profile user Approve the Expense record",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user switch to login as Finanace Manager profile user",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user Finance approve the Expense record",
  "keyword": "And "
});
formatter.match({
  "location": "BillingEventCreationSteps.user_switch_to_login_as_Finance_Admin_Profile_user()"
});
formatter.result({
  "duration": 6124402000,
  "status": "passed"
});
formatter.match({
  "location": "BillingEventCreationSteps.finance_Admin_user_complete_the_Audit_approval_process()"
});
formatter.result({
  "duration": 4249077700,
  "status": "passed"
});
formatter.match({
  "location": "BillingEventCreationSteps.user_switch_to_login_as_Project_Manager_profile_user()"
});
formatter.result({
  "duration": 27700,
  "status": "passed"
});
formatter.match({
  "location": "BillingEventCreationSteps.project_Manager_profile_user_Approve_the_Expense_record()"
});
formatter.result({
  "duration": 25600,
  "status": "passed"
});
formatter.match({
  "location": "BillingEventCreationSteps.user_switch_to_login_as_Finanace_Manager_profile_user()"
});
formatter.result({
  "duration": 31900,
  "status": "passed"
});
formatter.match({
  "location": "BillingEventCreationSteps.user_Finance_approve_the_Expense_record()"
});
formatter.result({
  "duration": 25700,
  "status": "passed"
});
});