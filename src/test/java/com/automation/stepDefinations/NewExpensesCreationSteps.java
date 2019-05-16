package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Map;


public class NewExpensesCreationSteps extends Testbase {


    LoginPage loginpage;
    HomePage homepage;
    CreateNewPage createnewpage;
    ProjectRecordTypePage projectRecordTypePage;
    NewProjectEditPage newProjectEditPage;
    ExpensesPage expensesPage;
    ExpenseEntryPage expenseEntryPage;
    UserDetailPage userdetailpage;

    public NewExpensesCreationSteps() {

        super();
    }


    @Then("^user clicks on createnew label$")
    public void user_clicks_on_createnew_label() throws Throwable {
        createnewpage = new CreateNewPage();
        createnewpage.Clickoncreatenewpagelink();

    }

    @Then("^user clicks \"([^\"]*)\" from dropdown list$")
    public void user_clicks_from_dropdown_list(String arg1) throws Throwable {
        expensesPage = new ExpensesPage();
        expensesPage.ClickExpensesLable();

    }

    @Then("^user move to \"([^\"]*)\" Page$")
    public void user_move_to_Page(String arg1) throws Throwable {
        expenseEntryPage = new ExpenseEntryPage();
        expenseEntryPage.DeleteProjectLines();
        expenseEntryPage.ClickonAddNewRows();


    }

    @Given("^user is on Expense Entry Page$")
    public void user_is_on_Expense_Entry_Page() throws Throwable {
        System.out.println("Expenses Entry page");

    }

    @Then("^user complete the Expenses Entry$")
    public void user_complete_the_Expenses_Entry(DataTable ExpenseData) throws Throwable {
        for (Map <String, String> data : ExpenseData.asMaps(String.class, String.class)) {
            expenseEntryPage.ClickonSelectProjecLookup();
            expenseEntryPage.ProjectSearchfield(data.get("Project"));
            expenseEntryPage.Selectproject();
            expenseEntryPage.ClickonDatefield();
            expenseEntryPage.SelectDate();
            expenseEntryPage.SelectExpenseType(data.get("ExpenseType"));
            expenseEntryPage.WriteDescription(data.get("Description"));
            expenseEntryPage.WriteTotalAmount(data.get("TotalAmount"));
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

    @Then("^user clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {

    }

    @Then("^expenses saved message displays$")
    public void expenses_saved_message_displays() throws Throwable {


    }

    @Then("^user submit the expense$")
    public void user_submit_the_expense() throws Throwable {


    }

    @Then("^expenses submitted message displays$")
    public void expenses_submitted_message_displays() throws Throwable {


    }

    @Then("^user switch to login as PA Profile user$")
    public void user_switch_to_login_as_PA_Profile_user() throws Throwable {
        homepage = new HomePage();
        homepage.LoginasPA();
        userdetailpage = new UserDetailPage();
        userdetailpage.LoginasPAprofileuser();

    }

    @Then("^user select the Resource$")
    public void user_select_the_Resource() throws Throwable {
        expenseEntryPage.ResourceName();


    }

    @Then("^user attach the expense reciept$")
    public void user_attach_the_expense_reciept() throws Throwable {

    }


}


