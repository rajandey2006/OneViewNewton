@NewExpensesCreation
Feature: OneviewUpgrade
Scenario: Creating a new Expenses
Given user log in to FFUAT sandbox
And User is on homepage
When user clicks on createnew label
  And user clicks "Expenses" from dropdown list
  Then user navigate to "Expense Entry" Page