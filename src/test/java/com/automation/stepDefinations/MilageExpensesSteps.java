package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.ExpenseEntryPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.Map;


public class MilageExpensesSteps extends Testbase {

    ExpenseEntryPage expenseEntryPage;


    public MilageExpensesSteps() {

        super();
    }


    @Then("^user complete the Expenses Entry for mileage$")
    public void user_complete_the_Expenses_Entry_for_mileage(DataTable MilageExpenseData) throws Throwable {
        for (Map <String, String> data : MilageExpenseData.asMaps(String.class, String.class)) {
            expenseEntryPage = new ExpenseEntryPage();
            expenseEntryPage.ClickonSelectProjecLookup();
            expenseEntryPage.ProjectSearchfield(data.get("Project"));
            expenseEntryPage.Selectproject();
            expenseEntryPage.ClickonDatefield();
            expenseEntryPage.SelectDate();
            expenseEntryPage.SelectExpenseType(data.get("Expense"));
            expenseEntryPage.SelectExpenseType(data.get("ExpenseType"));
            expenseEntryPage.WriteDescription(data.get("Description"));
            expenseEntryPage.EnterDistance(data.get("Distance"));
            expenseEntryPage.SelectUnit(data.get("Unit"));
            expenseEntryPage.SelectCurrency(data.get("Currency"));
            expenseEntryPage.SelectTaxType(data.get("TaxType"));
            expenseEntryPage.ClickonSaveAllButton();
            expenseEntryPage.VerifyExpensesSavedMessage();
            expenseEntryPage.SelectLostReceiptCheckbox();
            //expenseEntryPage.AttachReciept();
            expenseEntryPage.SelectExpense();
            expenseEntryPage.ClickonSubmitButton();
            expenseEntryPage.VerifyExpensesSubmitMessage();


        }


    }
}

































