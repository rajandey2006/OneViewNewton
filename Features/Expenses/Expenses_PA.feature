@PAexpenseCreation
Feature: Expenses

  Scenario: Creating a new Expenses
	Given user log in to FFUAT sandbox
	Then user switch to login as PA Profile user
	Then user clicks on createnew label
	Then user clicks "Expenses" from dropdown list
	Then user move to "Expense Entry" Page
	Then user select the Resource
	Then user complete the Expenses Entry
	  | Project | Date | ExpenseType   | Description | TotalAmount | Currency      | TaxType |
	  | ALS Air |      | Accommodation | Test        | 100         | British Pound | VAT     |

	Then user clicks on "Save All" button
	Then expenses saved message displays
	Then user submit the expense
	Then expenses submitted message displays









