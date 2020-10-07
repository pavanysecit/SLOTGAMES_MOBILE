package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/UltraHot_AllUsecases.feature", glue={"stepDefinition_UltraHot"})
public class UltraHot_runner {
	
}