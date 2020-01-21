package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeaturesFile",monochrome = true,
glue ="stepDefinations",
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html",
"pretty", "html:target/cucumber-reports"})
public class Runner {

}
