package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/40SplendidHot_AllUsecases.feature", glue={"stepDefinition_40SplendidHot"})
public class FourtySplendidHot_runner {
	
}