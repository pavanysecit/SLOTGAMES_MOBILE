package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/BrownieHot_AllUsecases.feature", glue={"stepDefinition_BrownieHot"})
public class BrownieHot_runner {
	
}