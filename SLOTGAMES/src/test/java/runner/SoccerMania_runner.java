package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:/SLOTGAMES_AUTOMATION/SLOTGAMES/features/SoccerMania_AllUsecases.feature", glue={"stepDefinition_SoccerMania"})
public class SoccerMania_runner {

}
