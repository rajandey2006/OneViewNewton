package com.automationtest.pages;

import com.automationtest.base.testbase;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExpenseEntryPage<check> extends testbase {
    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:expenseSelector' and @type='checkbox']")
    WebElement ProjectCheckbox;

    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:pbb:deleteLinesButton' and @value='Delete Lines']")
    WebElement DeleteLinesButton;
    @FindBy(xpath = "//div[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:assignmentnamePanel']")

    //img[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:poraLookup
            WebElement selectProjectLookUp;

    @FindBy(xpath = "//input[@id='assigORProjSearchString']")
    WebElement searchField;
    @FindBy(xpath = "//a[@class='YUIFakeSelectorClassForResourceSelection']")
    WebElement clickonProject;
    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:date']")
    WebElement DateField;
    @FindBy(xpath = "//*[contains(text(),'Today')]")
    WebElement DatePicker;
    @FindBy(xpath = "//select[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:type']")
    WebElement Type;
    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:billableLine']")
    WebElement BillableCheckbox;
    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:nonReimburOnFrontPage']")
    WebElement NonReimbursableCheckbox;
    @FindBy(xpath = "//textarea[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:descr']")
    WebElement DescriptionBox;
    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:amountText']")
    WebElement TotalAmountBox;
    @FindBy(xpath = "//select[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:currencyISOCodeInput']")
    WebElement CurrencyDropdown;
    @FindBy(xpath = "//select[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:expTaxType']")
    WebElement TaxTypeDropdown;
    @FindBy(xpath = "//input[@name='expPage:expEntryForm:itemsBlock:pbb:bottom:j_id76' and  @value='Save All']")
    WebElement SaveAllButton;
    @FindBy(xpath = "//div[@id='expPage:messageSection:j_id7:j_id8:0:j_id9:j_id10:j_id12' and @class='messageText']")
    WebElement ExpensesSavedMessage;
    @FindBy(xpath = "//div[@id='expPage:messageSection:j_id7:j_id8:0:j_id9:j_id10:j_id12' and @class='messageText']")
    WebElement ExpensesSubmitMessage;

    @FindBy(xpath = "//input[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:j_id162' and @type='checkbox']")
    WebElement LostReceiptCheckbox;

    @FindBy(xpath = "//input[@name='expPage:expEntryForm:itemsBlock:pbb:bottom:j_id77' and  @value='Submit']")
    WebElement SubmitButton;
    @FindBy(xpath = "//input[@name='expPage:expEntryForm:itemsBlock:pbb:j_id75' and @value='Add New Rows']")
    WebElement AddNewRows;

    @FindBy(xpath = "//div[@id='expPage:expEntryForm:itemsBlock:pbb:resourceSelect' and @class='resourceNameDiv editableNameBox']")
    WebElement Resource;
    @FindBy(xpath = "//input[@id='delegatedResSearchString']")
    WebElement ResourceLookup;

    @FindBy(xpath = "//a[@href='#' and @class='YUIFakeSelectorClassForResourceSelection']")
    WebElement PAResource;

    @FindBy(xpath = "//img[@id='expPage:expEntryForm:itemsBlock:j_id84:tblRepeat:0:attachinfoImage']")
    WebElement Attachment;

    @FindBy(xpath = "//input[@class='__web-inspector-hide-shortcut__']")
    WebElement ChooseFileButton;

    @FindBy(xpath = "//input[@name='j_id0:attachmentForm:attachBlock:j_id32:j_id33' and @class='btn']")
    WebElement AttachFileButton;


    public ExpenseEntryPage() {
        PageFactory.initElements(driver, this);
    }


    public void DeleteProjectLines() throws InterruptedException {
        if (ProjectCheckbox.isDisplayed() && ProjectCheckbox.isEnabled() && !ProjectCheckbox.isSelected()) {
            ProjectCheckbox.click();
            Thread.sleep(3000);
            DeleteLinesButton.click();
            WebDriverWait wait = new WebDriverWait(driver, 5000);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(2000);
        } else if (ProjectCheckbox.isSelected()) {
            DeleteLinesButton.click();
            WebDriverWait wait = new WebDriverWait(driver, 5000);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(2000);


        } else if (!ProjectCheckbox.isDisplayed()) {
            {
                System.out.println("No Project Lines to delete");
            }


        }
    }

    public void ClickonAddNewRows() throws InterruptedException {

        for (int i = 0; i < 1; i++) {
            WebElement element = AddNewRows;
            // JavascriptExecutor js = (JavascriptExecutor)driver;
            //js.executeScript("arguments[0].click();", AddNewRows);

            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
            Thread.sleep(2000);

        }
    }

    public void ClickonSelectProjecLookup() throws InterruptedException {

        Thread.sleep(3000);
        WebElement element = selectProjectLookUp;
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }


        Thread.sleep(3000);


    }

    public void ProjectSearchfield(String Project) {
        searchField.clear();
        searchField.sendKeys(Project);
        searchField.sendKeys(Keys.ENTER);


    }

    public void Selectproject() throws InterruptedException {
        Thread.sleep(3000);

        int ok_size = driver.findElements(By.xpath("//a[@class='YUIFakeSelectorClassForResourceSelection']")).size();

        driver.findElements(By.xpath("//a[@class='YUIFakeSelectorClassForResourceSelection']")).get(ok_size - 1).click();


    }

    public void ClickonDatefield() {
        DateField.click();
    }

    public void SelectDate() {
        DatePicker.click();

    }

    public void SelectExpenseType(String ExpenseType) {
        Select type = new Select(Type);
        type.selectByVisibleText(ExpenseType);
    }

    public void WriteDescription(String Description) {
        DescriptionBox.sendKeys(Description);
    }

    public void WriteTotalAmount(String TotalAmount) throws InterruptedException {
        Thread.sleep(2000);
        TotalAmountBox.sendKeys(TotalAmount);

    }

    public void SelectCurrency(String Currency) {
        Select currency = new Select(CurrencyDropdown);
        currency.selectByVisibleText(Currency);
    }

    public void SelectTaxType(String TaxType) {
        Select taxtype = new Select(TaxTypeDropdown);
        taxtype.selectByVisibleText(TaxType);
    }

    public void ClickonSaveAllButton() {
        SaveAllButton.click();
    }

    public void VerifyExpensesSavedMessage() throws InterruptedException {
        Thread.sleep(8000);


        String actual = ExpensesSavedMessage.getText();
        System.out.println(actual);
        String expected = "1 Expense(s) are saved";
        // Assert.assertEquals(actual, expected);
        Assert.assertTrue(actual.contains("1 Expense(s)"));

    }

    public void SelectLostReceiptCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(LostReceiptCheckbox)).click();

        //LostReceiptCheckbox.click();

    }

    public void AttachReciept() throws InterruptedException {


        String workingDir = System.getProperty("user.dir");
        String filepath = workingDir + "/Reciepts/Expense.jpg";



        WebElement fileInput = driver.findElement(By.name("j_id0:attachmentForm:attachBlock:j_id35:j_id36:fileField:inputFile:file"));
        fileInput.sendKeys(filepath);
        // Added a wait to make you notice the difference.
        Thread.sleep(1000);

        driver.findElement(By.id("j_id0:attachmentForm:attachBlock:j_id35:j_id36:fileField:inputFile:file")).sendKeys(
                "C:\\Users\\Purna.bonthala\\Desktop\\Test Data\\Reciepts\\Expense.jpg");



        // Added sleep to make you see the difference.uploadfile
        Thread.sleep(1000);
        //JUST A COMMENT

        fileInput.sendKeys(filepath);








            AttachFileButton.click();
        }





        public void SelectExpense () {
            WebElement Checkbox = ProjectCheckbox;
            Checkbox.click();

        }

        public void ClickonSubmitButton () {

            SubmitButton.click();
        }

        public void VerifyExpensesSubmitMessage () throws InterruptedException {
            Thread.sleep(8000);


            String actual = ExpensesSubmitMessage.getText();
            System.out.println(actual);
            String expected = "1 Expense(s) are submitted";
            // Assert.assertEquals(actual, expected);
            Assert.assertTrue(actual.contains("1 Expense(s)"));
            Thread.sleep(5000);


        }

        public void ResourceName() throws InterruptedException{
            Resource.click();
            Thread.sleep(2000);
            ResourceLookup.clear();
            ResourceLookup.sendKeys("Sophie Green");
            ResourceLookup.sendKeys(Keys.ENTER);
            PAResource.click();


        }



    }

