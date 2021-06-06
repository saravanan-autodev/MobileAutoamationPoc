package com.facebook.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.facebook.steps",
        dryRun = false,
        plugin = {"pretty","com.epam.reportportal.cucumber.ScenarioReporter"}
)
public class Runner {
}
