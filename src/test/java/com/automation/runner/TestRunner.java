package com.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Purna
 * This is a TestRunnerclass
 */
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "Features",
        tags = {"@NewExpensesCreation"},
        format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        //plugin = {"pretty","json:target/cucumber.json"},


        /*plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
          "html:target/cucumber-reports"},*/
        /*plugin = { "pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "junit:target/cucumber.xml",
                "rerun:target/rerun.txt" },*/
        glue = {"com/automation/stepDefinations"},
        monochrome = true,
        strict = true,
        dryRun = false
)



public class TestRunner {

}


