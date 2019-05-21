@BillingEventCreation
Feature: Expenses

  Scenario: Creating a new Expenses
	Given user log in to FFUAT sandbox
	Then user switch to login as Businees Manager(Tom Elton) Profile user
	Then user clicks on createnew label
	Then user clicks "Expenses" from dropdown list
	Then user move to "Expense Entry" Page
	Then user complete the Expenses Entry
	  | Project          | Date | ExpenseType   | Description | TotalAmount | Currency      | TaxType |
	  | Weetabix Limited |      | Accommodation | Test        | 1234        | British Pound | VAT     |
	Then user clicks on "Save All" button
	Then expenses saved message displays
	Then user submit the expense
	Then expenses submitted message displays

  Scenario: Expense Record Approval Process
	Then user switch to login as Finance Admin Profile user
	And Finance Admin user complete the Audit approval process
	Then user switch to login as Project Manager profile user
	And Project Manager profile user Approve the Expense record
	Then user switch to login as Finanace Manager profile user
	And user Finance approve the Expense record










