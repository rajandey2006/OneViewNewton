package com.automationtest.base;

import FFUATAutomationTest.util.TestUtil;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class testbase {

   public static WebDriver driver;
    public static Properties prop;
   // public WebDriver driver;
    public Scenario scenario;

    public testbase() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    "C:/Users/Purna.bonthala/IdeaProjects/OneviewFFDEVcom/src/main/java/FFDEVAutomation/config/config.properties");

            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void intialization() {
        String browserName = prop.getProperty("browser");

        // To Open the Browser
        if (browserName == "IE") {
            System.setProperty("webdriver.ie.driver", prop.getProperty("IEPath"));
            driver = new InternetExplorerDriver();

        } else if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.firefox.marionette", prop.getProperty("FFPath"));
            driver = new FirefoxDriver();

        }
        

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        // To navigate to the URL
        driver.get(prop.getProperty("url"));
    }


    public void cleanUp() {
        driver.close();
        driver.quit();
    }
}