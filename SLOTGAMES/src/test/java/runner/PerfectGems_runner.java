package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/PerfectGems_AllUsecases.feature", glue={"stepDefinition_PerfectGems"})
public class PerfectGems_runner {
	
}