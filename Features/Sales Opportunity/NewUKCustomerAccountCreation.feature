@CustomerAccountCreation
Feature: Account

  Scenario: Creating a new Customer account
	Given user log in to FFUAT sandbox
	Then user clicks on createnew label
	Then user clicks 'Account' from dropdown list
	Then user move to 'Select Account Record Type' Page
	Then user select the Account Record Type as UKcustomer
	Then user move to 'New Account' Creation page
	And user complete the new customer account details
	  | Account      | AccountTradingCurrency|
	  | New Account1 | GBP                    |

	Then user navigate to "<Account Detail>" Page
	Then user edit the Account details Page
	  | CreditLimit  | CompanyRegistrationNumber | CreditRating | CreditRatingReviewed |
	  | 2,000,000.00 | 00979395                  | 100          |                      |






	



