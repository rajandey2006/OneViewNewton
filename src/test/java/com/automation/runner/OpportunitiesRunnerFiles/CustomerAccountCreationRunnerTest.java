package com.automation.runner.OpportunitiesRunnerFiles;

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
        tags ={"@CustomerAccountCreation"},
        format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = {"com/automation/stepDefinations"},
        monochrome = true,
        strict = true,
        dryRun = false


)



public class CustomerAccountCreationRunnerTest {



}


