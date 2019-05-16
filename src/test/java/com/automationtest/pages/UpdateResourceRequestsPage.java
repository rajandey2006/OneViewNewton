package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateResourceRequestsPage extends Testbase {
    @FindBy(xpath = "//input[@id='j_id0:massUpdateRRForm:quickUpdRRPB:resourceSelectorPBS:quickUpdateTable:0:j_id86' and @type='text']")
    WebElement RoleTitleField;
    @FindBy(xpath = "//select[@id='j_id0:massUpdateRRForm:quickUpdRRPB:resourceSelectorPBS:quickUpdateTable:0:j_id88']")
    WebElement ResourceRole;
    @FindBy(xpath = "//input[@id='j_id0:massUpdateRRForm:quickUpdRRPB:resourceSelectorPBS:quickUpdateTable:0:j_id90' and @type='text']")
    WebElement RequestedHours;
    @FindBy(xpath = "//input[@id='j_id0:massUpdateRRForm:quickUpdRRPB:resourceSelectorPBS:quickUpdateTable:0:j_id92' and @type='text']")
    WebElement StartDateField;
    @FindBy(xpath = "//*[@id='calRow3']/td[5]")
    WebElement StartDatepicker;
    @FindBy(xpath = "//input[@id='j_id0:massUpdateRRForm:quickUpdRRPB:resourceSelectorPBS:quickUpdateTable:0:j_id94' and @type='text']")
    WebElement EndDateField;
    @FindBy(xpath = "//*[@id='calRow4']/td[1]")
    WebElement EndDatepicker;
    @FindBy(xpath = "//select[@id='j_id0:massUpdateRRForm:quickUpdRRPB:resourceSelectorPBS:quickUpdateTable:0:j_id96']")
    WebElement Status;
    @FindBy(xpath = "//input[@value='Quick Update Selected Resource Requests' and @type='button']")
    WebElement QuickUpdateSelectedResourceRequests;
    @FindBy(xpath = "//input[@id='j_id0:massUpdateRRForm:quickUpdRRPB:j_id53:updateResourceRequestsBtn' and @value='Save Updated Resource Requests']")
    WebElement SaveUpdateResourceRequests;
    @FindBy(xpath = "//span[@id='j_id0:massUpdateRRForm:rrUpdResultPB:resultMessageSection:j_id17:j_id18:0:j_id19:j_id20:j_id23']")
    WebElement SuccessMessage;
    @FindBy(xpath = "//input[@value='Back to Project' and @type='submit']")
    WebElement BacktoProject;
    @FindBy(xpath = "//input[@name='del' and @value='Delete']")
    WebElement DeleteProject;


    public UpdateResourceRequestsPage() {
        PageFactory.initElements(driver, this);

    }

    public void EnterRoleTitle() {

        RoleTitleField.clear();
        RoleTitleField.sendKeys("RR-0004357");

    }

    public void SelectResourceRole() {
        Select Role = new Select(ResourceRole);
        Role.selectByVisibleText("Lead Consultant");

    }

    public void EnterRequestedHours() {
        RequestedHours.sendKeys("200");

    }

    public void SelectStartDate() {
        StartDateField.click();
        StartDatepicker.click();


    }

    public void SelectEndDate() {
        EndDateField.click();
        EndDatepicker.click();


    }

    public void SelectStatus() {
        Select status = new Select(Status);
        status.selectByVisibleText("Draft");

    }

    public void ClickonQuickUpdateSelectedResourceRequests() {
        QuickUpdateSelectedResourceRequests.click();
    }

    public void ClickonSaveUpdateResourceRequestsButton() {

        WebElement element = (SaveUpdateResourceRequests);
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();


    }

    public void ClickonBacktoProjectButton() {

        WebElement element = BacktoProject;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);


    }

    public void DeletetheProject()  {
        DeleteProject.click();
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}