package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewProjectEditPage extends testbase {
  String accountname = "ACA";
  String projectname ="TEST123";
  String region="UK";
  String sector= "Air";
  String projectfees ="2000";
  String duraioninweeks="4";
  String probability="50";
  String salesLead = "Adam Walker";
    @FindBy(xpath = "//*[@class='mainTitle']")
    WebElement VerifyPage;

    @FindBy(xpath = "//*[@id='CF00N58000004jvLp']")
    WebElement AccountName;
    @FindBy(xpath = "//*[@id='Name']")
    WebElement ProjectName;
    @FindBy(xpath = " //*[@name='00N58000004jvN7']")
    WebElement ProjectType;
    @FindBy(xpath = " //*[@name='CF00N58000004jvNB']")
    WebElement Region;
    @FindBy(xpath = "//*[@name='CF00N58000004jvMY']")
    WebElement Sector;
    @FindBy(xpath = "//*[@id='00N58000004jvN7']/option[2]")
    WebElement ProjectTypeDropdown;
    @FindBy(xpath = "//*[@id='00N5800000DBERx']")
    WebElement ProjectFees;
    @FindBy(xpath = "//*[@id='00N58000004jvNM']")
    WebElement StartDate;
    @FindBy(xpath ="//*[contains(text(),'Today')]" )
    WebElement DatePicker;
    @FindBy(xpath = "//*[@id='00N5800000DBEQj']")
    WebElement DurationInWeeks;
    @FindBy(xpath = "//*[@id='00N5800000DBERs']")
    WebElement Probablity;
    @FindBy(xpath = "//*[@id='CF00N5800000DBES4']")
    WebElement SalesLead;
    @FindBy(xpath = "//input[@name='save' and @tabindex='24']")
    WebElement SaveButton;

    public NewProjectEditPage() {
        PageFactory.initElements(driver, this);}

        public void EnterAccountName() {

      AccountName.sendKeys(accountname);
        }
    public void EnterProjectName() {
      ProjectName.sendKeys(projectname);

    }
    public void SelectProjectType() throws InterruptedException {
      ProjectType.click();
      ProjectTypeDropdown.click();
      Thread.sleep(2000);

  }

   public void EnterRegion(){

        Region.sendKeys(region);
   }

   public void EnterSector(){
      Sector.sendKeys(sector);

   }

   public void EnterProjectFees(){
      ProjectFees.sendKeys(projectfees);

   }
   public void EnterStartDate()  {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate localDate = LocalDate.now();
       StartDate.sendKeys(dtf.format(localDate));
   }

   public  void EnterDurtaionInWeeks(){
           DurationInWeeks.sendKeys(duraioninweeks);


    }

    public void EnterProbablity(){
        Probablity.sendKeys(probability);
    }

    public void EnterSaleslead(){
        SalesLead.sendKeys(salesLead);

    }

    public void ClickonSave(){
        SaveButton.click();

    }

    }
