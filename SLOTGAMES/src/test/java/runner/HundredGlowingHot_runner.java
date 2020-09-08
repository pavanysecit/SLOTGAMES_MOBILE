package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/100GlowingHot_AllUsecases.feature", glue={"stepDefinition_100GlowingHot"})
public class HundredGlowingHot_runner {
	
}