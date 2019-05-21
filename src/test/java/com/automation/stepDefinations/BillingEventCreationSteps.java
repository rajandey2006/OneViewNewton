package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.ExpenseReportsPage;
import com.automationtest.pages.HomePage;
import cucumber.api.java.en.Then;

public class BillingEventCreationSteps extends Testbase {
    HomePage homePage;
    ExpenseReportsPage expenseReportsPage;

    public BillingEventCreationSteps() {

        super();
    }


    @Then("^user switch to login as Businees Manager\\(Tom Elton\\) Profile user$")
    public void user_switch_to_login_as_Businees_Manager_Tom_Elton_Profile_user() throws Throwable {

        homePage = new HomePage();
        homePage.loginasBusinessManager();

    }

    @Then("^user switch to login as Finance Admin Profile user$")
    public void user_switch_to_login_as_Finance_Admin_Profile_user() throws Throwable {
        homePage = new HomePage();
        homePage.loginasFinanceAdmin();

    }

    @Then("^Finance Admin user complete the Audit approval process$")
    public void finance_Admin_user_complete_the_Audit_approval_process() throws Throwable {
        homePage.clickonExpenseReports();
        expenseReportsPage = new ExpenseReportsPage();
        expenseReportsPage.SelectAudit();
        expenseReportsPage.clickonSelecteforAuditCheckbox();
        expenseReportsPage.cilckonAuditApprovedtoReimburseCheckbox();


    }

    @Then("^user switch to login as Project Manager profile user$")
    public void user_switch_to_login_as_Project_Manager_profile_user() throws Throwable {

    }

    @Then("^Project Manager profile user Approve the Expense record$")
    public void project_Manager_profile_user_Approve_the_Expense_record() throws Throwable {

    }

    @Then("^user switch to login as Finanace Manager profile user$")
    public void user_switch_to_login_as_Finanace_Manager_profile_user() throws Throwable {

    }

    @Then("^user Finance approve the Expense record$")
    public void user_Finance_approve_the_Expense_record() throws Throwable {

    }
}
