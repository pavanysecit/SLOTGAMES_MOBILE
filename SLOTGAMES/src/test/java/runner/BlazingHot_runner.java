package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/BlazingHot_AllUsecases.feature", glue={"stepDefinition_BlazingHot"})
public class BlazingHot_runner {
	 
}