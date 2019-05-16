package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewProjectEditPage extends Testbase {

    @FindBy(xpath = "//*[@class='mainTitle']")
    WebElement VerifyPage;

    @FindBy(xpath = "//*[@id='CF00N58000004jvLp']")
    WebElement accountname;
    @FindBy(xpath = "//*[@id='Name']")
    WebElement projectname;
    @FindBy(xpath = " //*[@name='00N58000004jvN7']")
    WebElement ProjectType;
    @FindBy(xpath = " //*[@name='CF00N58000004jvNB']")
    WebElement region;
    @FindBy(xpath = "//*[@name='CF00N58000004jvMY']")
    WebElement sector;
    @FindBy(xpath = "//*[@id='00N58000004jvN7']/option[2]")
    WebElement ProjectTypeDropdown;
    @FindBy(xpath = "//*[@id='00N5800000DBERx']")
    WebElement projectfees;
    @FindBy(xpath = "//*[@id='00N58000004jvNM']")
    WebElement StartDate;
    @FindBy(xpath = "//*[contains(text(),'Today')]")
    WebElement DatePicker;
    @FindBy(xpath = "//*[@id='00N5800000DBEQj']")
    WebElement durationinweeks;
    @FindBy(xpath = "//*[@id='00N5800000DBERs']")
    WebElement probability;
    @FindBy(xpath = "//*[@id='CF00N5800000DBES4']")
    WebElement saleslead;
    @FindBy(xpath = "//input[@name='save' and @tabindex='24']")
    WebElement SaveButton;

    public NewProjectEditPage() {
        PageFactory.initElements(driver, this);
    }

    public void EnterAccountName(String AccountName) {

        accountname.sendKeys(AccountName);
    }

    public void EnterProjectName(String ProjectName) {
        projectname.sendKeys(ProjectName);

    }

    public void SelectProjectType() throws InterruptedException {
        ProjectType.click();
        ProjectTypeDropdown.click();
        Thread.sleep(2000);

    }

    public void EnterRegion(String Region) {

        region.sendKeys(Region);
    }

    public void EnterSector(String Sector) {
        sector.sendKeys(Sector);

    }

    public void EnterProjectFees(String ProjectFees) {
        projectfees.sendKeys(ProjectFees);

    }

    public void EnterStartDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        StartDate.sendKeys(dtf.format(localDate));
    }

    public void EnterDurtaionInWeeks(String DurationInWeeks) {
        durationinweeks.sendKeys(DurationInWeeks);


    }

    public void EnterProbablity(String Probability) {
        probability.sendKeys(Probability);
    }

    public void EnterSaleslead(String SalesLead) {
        saleslead.sendKeys(SalesLead);

    }

    public void ClickonSave() {
        SaveButton.click();

    }

}
