package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//FeatureFiles/login.feature",
		glue= "StepDefinations",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:target/report"}
		)

public class Runner {

}
