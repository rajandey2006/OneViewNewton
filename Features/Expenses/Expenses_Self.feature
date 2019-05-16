@NewExpensesCreation
Feature: Expenses

  Scenario: Creating a new Expenses
	Given user log in to FFUAT sandbox
	Then user clicks on createnew label
	Then user clicks "Expenses" from dropdown list
	Then user move to "Expense Entry" Page
	Then user complete the Expenses Entry
	  | Project                 | Date | ExpenseType                              | Description | TotalAmount | Currency        | TaxType |
	  | ALS Air                 |      | Accommodation                            | Test        | 100         | British Pound   | VAT     |
	  | Newton Europe           |      | Advertising                              | Test        | 200         | British Pound   | VAT     |
	  | Cornwall Council        |      | Client Entertainment                     | Test        | 300         | Euro            | No VAT  |
	  | University              |      | Donations                                | Test        | 400         | Canadian Dollar | VAT     |
	  | Newton Europe           |      | Drinks                                   | Test        | 500         | British Pound   | VAT     |
	  | BST Recruitment         |      | Equipment Rental                         | Test        | 600         | U.S. Dollar     | VAT     |
	  | Hazlewood Foods         |      | Fuel Receipts                            | Test        | 700         | British Pound   | VAT     |
	  | BAE Systems Surface     |      | Gifts                                    | Test        | 800         | Euro            | No VAT  |
	  | Marks and Spencer plc   |      | Hire Car Fuel                            | Test        | 900         | British Pound   | VAT     |
	  | NHS                     |      | IT equipment Purchased                   | Test        | 1000        | British Pound   | VAT     |
	  | ALS Land Campaign       |      | IT Services contracts & support          | Test        | 1234        | Euro            | VAT     |
	  | Birmingham City Council |      | IT Software                              | Test        | 4466        | British Pound   | No VAT  |
	  | BST                     |      | Meeting Room Hire                        | Test        | 3245        | U.S. Dollar     | VAT     |
	  | Swindon Borough Council |      | Miscellaneous other project Supplies     | Test        | 454         | British Pound   | VAT     |
	  | Transport for London    |      | Office equipment Purchased               | Test        | 1212        | British Pound   | VAT     |
	  | NEC LIMITED             |      | Office Equipment repairs and Maintenance | Test        | 23232       | Canadian Dollar | VAT     |
	  | Weetabix Limited        |      | Other Sundry personal expenses           | Test        | 1356        | British Pound   | VAT     |
	  | Tulip Limited           |      | Staff Entertainment                      | Test        | 2398        | Euro            | No VAT  |
	  | INTP                    |      | Subscriptions                            | Test        | 1359        | British Pound   | VAT     |
	  | Poundland Limited       |      | Telephone - internet                     | Test        | 1359        | U.S. Dollar     | VAT     |
	  | NHS HCT                 |      | Telephone - landlines                    | Test        | 9766        | Canadian Dollar | No VAT  |
	  | Marks and Spencer plc   |      | Telephone - mobile                       | Test        | 456         | British Pound   | VAT     |
	  | ALS Air                 |      | Travel - flights                         | Test        | 100         | British Pound   | VAT     |
	  | Cornwall Council        |      | Travel - parking & tolls                 | Test        | 300         | Euro            | No VAT  |
	  | University              |      | Travel - public transport                | Test        | 400         | Canadian Dollar | VAT     |
	  | Newton Europe           |      | Travel - taxis                           | Test        | 500         | British Pound   | VAT     |
	  | BST Recruitment         |      | Travel - vehicle hire                    | Test        | 600         | U.S. Dollar     | VAT     |
	  | Hazlewood Foods         |      | Travel - vehicle repairs & servicing     | Test        | 700         | British Pound   | VAT     |
	  | BAE Systems Surface     |      | Other Subsistence Costs                  | Test        | 800         | Euro            | No VAT  |
	  | Marks and Spencer plc   |      | Print stationery & Postage               | Test        | 900         | British Pound   | VAT     |
	  | NHS                     |      | Meals & Drinks                           | Test        | 1000        | British Pound   | VAT     |

	Then user clicks on "Save All" button
	Then expenses saved message displays
	Then user submit the expense
	Then expenses submitted message displays









