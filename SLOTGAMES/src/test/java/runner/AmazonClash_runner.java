package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/AmazonClash_AllUsecases.feature", glue={"stepDefinition_AmazonClash"})
public class AmazonClash_runner {
	
}