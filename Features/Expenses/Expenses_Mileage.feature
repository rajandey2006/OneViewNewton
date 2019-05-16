@MileageExpense
Feature: Expenses

  Scenario: Creating a new Expenses for Mileage
	Given user log in to FFUAT sandbox
	Then user clicks on createnew label
	Then user clicks "Expenses" from dropdown list
	Then user move to "Expense Entry" Page
	Then user complete the Expenses Entry for mileage
	  | Project       | Expense          | ExpenseType      | Description | Distance | Unit | Currency      | TaxType |
	  | Newton Europe | Travel - flights | Travel - mileage | Test        | 100      | Mile | British Pound | No VAT  |
	Then user clicks on "Save All" button
	Then expenses saved message displays
	Then user submit the expense
	Then expenses submitted message displays

