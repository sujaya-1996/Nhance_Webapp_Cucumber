package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\SampleProject\\Nhance_WebApp_Cucumber\\src\\test\\java\\Features\\ProductManagement.feature", glue = {
		"stepDefinitions" }, tags={"@currentTest"}, dryRun = false, monochrome = true, strict = true, plugin = { "pretty", "html:target/cucumber" })

// dryRun step is for to know, for each feature file step, whether it contains a step or not!
// plugin step is for to create report
// monochrome will remove unnecessary characters from console window

public class TestRun {

}
 