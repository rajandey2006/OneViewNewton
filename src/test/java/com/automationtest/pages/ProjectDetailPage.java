package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProjectDetailPage extends testbase {
    @FindBy(xpath = "//input[@name='edit' and @type='button']")
    WebElement EditButton;

    @FindBy(xpath = "//img[@id='00N5800000DBEQo_chkbox'  and @class='checkImg']")
    WebElement ProgresstoStage4;
    @FindBy(xpath = "//input[@name='save' and @class='btn']")
    WebElement Save;
    @FindBy(xpath = "//input[@id='00N5800000DBEQo' and @type='checkbox']")
    WebElement ProgresstoStage3;
    @FindBy(xpath = "//img[@id='00N5800000DBEQq_chkbox' and @class='checkImg']")
    WebElement ProgresstoStage2;
    @FindBy(xpath = "//input[@id='CF00N58000004jvN2' and @type='text']")
    WebElement ProjectManager;
    @FindBy(xpath = "//select[@id='00N5800000DBERb' and @tabindex='36']")
    WebElement OpportunityStage;

    public ProjectDetailPage() {
        PageFactory.initElements(driver, this);
    }
    public void ClickonEditbutton() {

        EditButton.click();
    }

    public void SelectOpportunityStage4(){
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("4 - Opportunity - Cluster Board Approval");
        Save.click();

    }
    public void SelectOpportunityStage3(){
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("3 – Cluster Qualified Opportunity - DE EPR Approval");
        Save.click();

    }
    public void SelectOpportunityStage2(){
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("2 – DE EPR Approved Opportunity - Commercial EPR Approval");
        ProjectManager.click();
        ProjectManager.sendKeys("Adam Walker");
        Save.click();

    }
    public void SelectOpportunityStage1(){
        Select OppStageDropdown = new Select(OpportunityStage);
        OppStageDropdown.selectByVisibleText("1 - Live Project");
        Save.click();

    }

}