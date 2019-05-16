package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YellowFormPage extends Testbase {

    @FindBy(xpath = "//*[@id=\"j_id0:j_id125\"]/div/center/table/tbody/tr[1]/td[1]/font[1]/b")
    WebElement IntialReport;

    @FindBy(xpath = "//*[@id=\"j_id0:j_id90:j_id91\"]/table/tbody/tr[3]/td[1]/a")
    WebElement Editlink;
    @FindBy(xpath = "//input[@id='j_id0:j_id2:j_id3:j_id32']")
    WebElement EnterAddress;
    @FindBy(xpath = "//input[@name='j_id0:j_id2:j_id3:j_id34' and @value='Add Address(es)']")
    WebElement AddAddreeField;
    @FindBy(xpath = "//a[contains(text(),'Close')]")
    WebElement CloseButton;
    @FindBy(xpath = "//input[@name='j_id0:j_id90:j_id91:j_id93' and @value='Save']")
    WebElement SaveButton;
    @FindBy(xpath = "//input[@name='j_id0:j_id2:j_id3:j_id8' and @value='Send Mail']")
    WebElement SendMailButton;


    public YellowFormPage() {
        PageFactory.initElements(driver, this);
    }


    public void SwitchtoYellowFormPageWindow() {
        java.util.Set <String> handles = driver.getWindowHandles();

        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);

        }
    }

    public void VerifyYellowFormReport() {
        String Actual = IntialReport.getText();
        String Expected = "Initial Opportunity Report";
        Assert.assertEquals(Actual, Expected);


    }

    public void ClickonEditButton() {

        WebElement element = Editlink;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);


    }

    public void AddEmailAddress() throws InterruptedException {
        Thread.sleep(2000);
        EnterAddress.sendKeys("oneviewuat@newtoneurope.com");
        AddAddreeField.click();
        CloseButton.click();
        WebElement element = SaveButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
        SendMailButton.click();


    }
}




