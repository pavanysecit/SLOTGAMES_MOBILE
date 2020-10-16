package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/GummyLand_AllUsecases.feature", glue={"stepDefinition_GummyLand"})
public class GummyLand_runner {
	
}