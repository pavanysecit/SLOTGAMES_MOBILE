package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/VegasMania_AllUsecases.feature", glue={"stepDefinition_VegasMania"})
public class VegasMania_runner {
	
}