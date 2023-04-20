package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
        (
		features=".//features//login.feature",
		glue="stepdefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", 
				"html:test-output"},
		publish = true
		)
		
public class testrun {

}
