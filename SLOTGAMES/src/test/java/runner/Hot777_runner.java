package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Hot777_AllUsecases.feature", glue={"stepDefinition_Hot777"})
public class Hot777_runner {
	
}