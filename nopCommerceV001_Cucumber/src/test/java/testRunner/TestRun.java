package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features=".//Features/Login2.feature",
				glue="stepDefinitions",
				dryRun=true,
				plugin= {"pretty","html:test-output"}
		)
public class TestRun {
	
	

}
