package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SeaMermaid_AllUsecases.feature", glue={"stepDefinition_SeaMermaid"})
public class SeaMermaid_runner {
	
}