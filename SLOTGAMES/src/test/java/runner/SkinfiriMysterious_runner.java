package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SkinfiriMysterious_AllUsecases.feature", glue={"stepDefinition_SkinfiriMysterious"})

public class SkinfiriMysterious_runner {

}