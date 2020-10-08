package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/LadyFortune_AllUsecases.feature", glue={"stepDefinition_LadyFortune"})
public class LadyFortune_runner {
	
}