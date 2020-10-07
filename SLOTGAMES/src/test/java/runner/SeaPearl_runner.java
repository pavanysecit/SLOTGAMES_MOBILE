package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SeaPearl_AllUsecases.feature", glue={"stepDefinition_SeaPearl"})
public class SeaPearl_runner {
	
}