package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProjectDetailPage extends Testbase {
    @FindBy(xpath = "//input[@name='edit' and @type='button']")
    WebElement EditButton;
    @FindBy(xpath = "//input[@name='save' and @class='btn']")
    WebElement Save;
    @FindBy(xpath = "//input[@id='CF00N58000004jvN2' and @type='text']")
    WebElement ProjectManager;
    @FindBy(xpath = "//select[@id='00N5800000DBERb']")
    WebElement OpportunityStage;
    @FindBy(xpath = "//input[@name='update_resources' and @type='button' and @value='Update Resources']")
    WebElement UpdateResources;
    @FindBy(xpath = "//input[@name='new_status_report' and @value='Yellow Form Report']")
    WebElement YellowFormButton;
    @FindBy(xpath = "//input[@name='00N5800000DBEQo' and @type='checkbox']")
    WebElement CheckboxToStage;


    public ProjectDetailPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickonEditbutton() {

        EditButton.click();
    }

    public void ClickonYelloFormReportButton() {
        WebElement element = YellowFormButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void SelectOpportunityStage4() {
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("4 - Opportunity - Cluster Board Approval");
        Actions actions = new Actions(driver);
        actions.moveToElement(CheckboxToStage).click().build().perform();
        Save.click();


    }

    public void SelectOpportunityStage3() {
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByValue("3 – cluster leads have qualified the opportunity and happy to proceed");
        Save.click();

    }

    public void SelectOpportunityStage2() {
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("2 – DE EPR Approved Opportunity - Commercial EPR Approval");
        ProjectManager.click();
        ProjectManager.sendKeys("Adam Walker");
        Save.click();

    }

    public void SelectOpportunityStage1() {
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("1 - Live Project");
        Save.click();

    }

    public void ClickonUpdateResourceField() {
        UpdateResources.click();

    }


}