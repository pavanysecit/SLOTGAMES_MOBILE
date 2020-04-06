package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/sw176/git/SLOTGAMES_MOBILES/SLOTGAMES/features/TreasureBonanza_AllUsecases.feature", glue={"stepDefinition_TreasureBonanza"})
public class TreasureBonanza_runner {
	
}
