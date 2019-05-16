package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AccountEditPage extends Testbase {

    @FindBy(xpath = "//input[@id='acc2' and @type='text']")
    WebElement Accountname;
    @FindBy(xpath = "//input[@name='00N58000004jf13' and @type='text']")
    WebElement Accounttradingcurrency;
    @FindBy(xpath = "//input[@name='save' and @type='submit']")
    WebElement Save;
    @FindBy(xpath = "//input[@name='edit' and @type='button']")
    WebElement Edit;
    @FindBy(xpath = "//input[@name='00N58000004jf1U']")
    WebElement Creditlimit;
    @FindBy(xpath = "//input[@name='00N5800000DB5ZZ']")
    WebElement CompanyRegistrationnumber;
    @FindBy(xpath = "//input[@name='00N58000004jf1X']")
    WebElement Creditrating;
    @FindBy(xpath = "//input[@id='00N58000004jf1W']")
    WebElement Date;
    @FindBy(xpath = "//input[@id='00N58000004jf17']")
    WebElement Bankaccountname;
    @FindBy(xpath = "//input[@id='00N58000004jf1H']")
    WebElement Banksortcode;
    @FindBy(xpath = "//input[@id='00N58000004jf19']")
    WebElement Bankaccountreference;
    @FindBy(xpath = "//input[@id='CF00N58000004jf1y']")
    WebElement GSTcode;


    public AccountEditPage() {
        PageFactory.initElements(driver, this);
    }

    public void EnterAccountName(String Account) {
        Accountname.sendKeys(Account);

    }

    public void EnterAccountTradingCurrency(String AccountTradingCurrency) {

        Accounttradingcurrency.sendKeys(AccountTradingCurrency);
    }

    public void ClickSave() {
        Save.click();
    }

    public void ClickonEditButton() {
        WebElement element = (Edit);
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

    public void EnterCreditLimit(String CreditLimit) {
        Creditlimit.sendKeys(CreditLimit);

    }

    public void EnterCompanyRegNumber(String CompanyRegistrationNumber) {
        CompanyRegistrationnumber.sendKeys(CompanyRegistrationNumber);
    }

    public void EnterCreditRating(String CreditRating) {
        Creditrating.sendKeys(CreditRating);

    }

    public void EnterBankAccountName(String BankAccountName) {
        Bankaccountname.sendKeys(BankAccountName);


    }

    public void EnterBankSortCode(String BankSortCode) {
        Banksortcode.sendKeys(BankSortCode);
    }

    public void EnterBankAccountRef(String BankAccountReference) {
        Bankaccountreference.sendKeys(BankAccountReference);
    }

    public void EnterGSTcode(String GSTCode) {
        GSTcode.sendKeys(GSTCode);

    }


    public void EnterDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        Date.sendKeys(dtf.format(localDate));
    }
}
