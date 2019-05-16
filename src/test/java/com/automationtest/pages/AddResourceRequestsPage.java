package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddResourceRequestsPage extends Testbase {


    @FindBy(xpath = "//input[@name='j_id0:RRM_Form:RRM_PB:j_id71:j_id74' and @value='Add To Project']")
    WebElement AddtoProjectButton;
    @FindBy(xpath = "//input[@name='pse__oppaddresreqfromtemplate' and @value='Add Resource Requests From Template']")
    WebElement AddResourceRequestsFromTemplate;
    @FindBy(xpath = "//input[@name='justADummyForVF' and @type='radio' and @value='a5c58000000TPEPAA4']")
    WebElement ProjectTemplateRadioButton;
    @FindBy(xpath = "//div[3]/table/tbody/tr/td[2]/input[2]")
    WebElement SelectButton;

    public AddResourceRequestsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickonAddtoProject() {

        WebElement element = AddtoProjectButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

    }

    public void clickonAddResourcesRequestsFromTemplateButton() {
        AddResourceRequestsFromTemplate.click();


    }


    public void selectProjectTemplateRadioButton() {
        WebElement element = ProjectTemplateRadioButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

    }

    public void clickonSelectButton() {
        WebElement element = SelectButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }


}
