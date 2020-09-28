package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/CircusMania_AllUsecases.feature", glue={"stepDefinition_CircusMania"})
public class CircusMania_runner {
	
}