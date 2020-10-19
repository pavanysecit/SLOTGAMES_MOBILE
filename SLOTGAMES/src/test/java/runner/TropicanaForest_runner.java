package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/TropicanaForest_AllUsecases.feature", glue={"stepDefinition_TropicanaForest"})
public class TropicanaForest_runner {
	
}