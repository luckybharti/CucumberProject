package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\Lenovo\\Desktop\\lucky\\CucumberProject\\src\\main\\resources\\featureFile\\test.feature",
		glue = {"stepDefinition"},
	    plugin = {"pretty","html:target/cucumber/report.html"},
		monochrome = true
		)
public class TestRunner {
	
	
}
