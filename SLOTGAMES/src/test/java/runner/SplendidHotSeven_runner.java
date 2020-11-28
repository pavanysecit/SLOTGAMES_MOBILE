package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SplendidHot7_AllUsecases.feature", glue={"stepDefinition_SplendidHot7"})
public class SplendidHotSeven_runner {
	
}