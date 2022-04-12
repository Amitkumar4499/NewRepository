package CucumberTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature", glue = { "StepDefinitions" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
