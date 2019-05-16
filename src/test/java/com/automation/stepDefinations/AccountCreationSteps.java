package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.AccountEditPage;
import com.automationtest.pages.AccountRecordTypePage;
import com.automationtest.pages.CreateNewPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.Map;


public class AccountCreationSteps extends Testbase {
    CreateNewPage createNewPage;
    AccountRecordTypePage accountRecordTypePage;
    AccountEditPage accountEditPage;


    public AccountCreationSteps() {

        super();
    }

    @Then("^user clicks 'Account' from dropdown list$")
    public void user_clicks_Account_from_dropdown_list() throws Throwable {
        createNewPage = new CreateNewPage();
        createNewPage.ClickonAccountLabel();

    }

    @Then("^user move to 'Select Account Record Type' Page$")
    public void user_move_to_Select_Account_Record_Type_Page() throws Throwable {
        accountRecordTypePage = new AccountRecordTypePage();


    }

    @Then("^user select the Account Record Type as UKcustomer$")
    public void user_select_the_Account_Record_Type_as_UKcustomer() throws Throwable {
        accountRecordTypePage.SelectRecordTypeasUKcustomer();
        accountRecordTypePage.ClickonContinueButton();
    }

    @Then("^user select the Account Record Type as UKsupplier")
    public void user_select_the_Account_Record_Type_as_UKsupplier() throws Throwable {
        accountRecordTypePage.SelectRecordTypeasUKsupplier();
        accountRecordTypePage.ClickonContinueButton();
    }

    @Then("^user move to 'New Account' Creation page$")
    public void user_move_to_New_Account_Creation_page() throws Throwable {
        accountEditPage = new AccountEditPage();


    }

    @Then("^user complete the new customer account details$")
    public void user_complete_the_new_customer_account_details(DataTable CustomerAccountData) throws Throwable {
        for (Map <String, String> data : CustomerAccountData.asMaps(String.class, String.class)) {
            accountEditPage.EnterAccountName(data.get("Account"));
            accountEditPage.EnterAccountTradingCurrency(data.get("AccountTradingCurrency"));
            accountEditPage.ClickSave();
            accountEditPage.ClickonEditButton();

        }
    }

    @Then("^user complete the new Supplier account details$")
    public void user_complete_the_new_Supplier_account_details(DataTable SupplierAccountData) throws Throwable {
        for (Map <String, String> data : SupplierAccountData.asMaps(String.class, String.class)) {
            accountEditPage.EnterAccountName(data.get("Account"));
            accountEditPage.EnterAccountTradingCurrency(data.get("AccountTradingCurrency"));
            accountEditPage.EnterBankAccountName(data.get("BankAccountName"));
            accountEditPage.EnterBankSortCode(data.get("BankSortCode"));
            accountEditPage.EnterBankAccountRef(data.get("BankAccountReference"));
            accountEditPage.EnterGSTcode(data.get("GSTCode"));
            accountEditPage.ClickSave();

        }

    }


    @Then("^user edit the Account details Page$")
    public void user_eit_the_Account_details_Page(DataTable AccountupdateData) throws Throwable {
        for (Map <String, String> data : AccountupdateData.asMaps(String.class, String.class)) {
            accountEditPage.EnterCreditLimit(data.get("CreditLimit"));
            accountEditPage.EnterCompanyRegNumber(data.get("CompanyRegistrationNumber"));
            accountEditPage.EnterCreditRating(data.get("CreditRating"));
            accountEditPage.EnterDate();
            accountEditPage.ClickSave();


        }


    }

}







































