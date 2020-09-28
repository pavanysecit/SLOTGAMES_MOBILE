package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FrizzlingHot_AllUsecases.feature", glue={"stepDefinition_FrizzlingHot"})
public class FrizzlingHot_runner {
	
}