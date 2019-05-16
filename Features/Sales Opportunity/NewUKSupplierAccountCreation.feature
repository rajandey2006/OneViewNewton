@SupplierAccountCreation
Feature: Account

  Scenario: Creating a new Customer account
	Given user log in to FFUAT sandbox
	Then user clicks on createnew label
	Then user clicks 'Account' from dropdown list
	Then user move to 'Select Account Record Type' Page
	Then user select the Account Record Type as UKsupplier
	Then user move to 'New Account' Creation page
	And user complete the new Supplier account details
	  | Account      | AccountTradingCurrency | BankAccountName | BankSortCode | BankAccountReference | GSTCode  |
	  | New Account1 | GBP                    | TestAccount     | 20-20-20     | Test                 | GB-I-ZRO |

	Then user navigate to "<Account Detail>" Page






	



