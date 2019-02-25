package com.automationtest.pages;
import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage extends testbase {
    @FindBy(xpath = "//span[@id='createNewLabel']")
    WebElement createNewLabel;

    @FindBy(xpath = "//a[@href='/a5A/e?retURL=%2Fhome%2Fhome.jsp']")
    WebElement SelectExpenseLabel;



    public ExpensesPage() {
        PageFactory.initElements(driver, this);
    }


    public void Clickoncreatenewpagelink() {
        createNewLabel.click();


    }

    public ExpenseEntryPage ClickExpensesLable() {
        SelectExpenseLabel.click();
        return new ExpenseEntryPage();


    }


}