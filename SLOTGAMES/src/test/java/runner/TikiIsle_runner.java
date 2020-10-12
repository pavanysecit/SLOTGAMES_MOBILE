package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/TikiIsle_AllUsecases.feature", glue={"stepDefinition_TikiIsle"})
public class TikiIsle_runner {

}