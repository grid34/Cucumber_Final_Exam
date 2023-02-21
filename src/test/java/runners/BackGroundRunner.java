package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src\\test\\java\\features\\SkyBleuFeature.feature", 
		glue="steps",
		tags="@Scenario1",
		monochrome=true, 
		dryRun=false,    
		plugin = {
				"pretty",  
				"html:target/cucumber",  
				"json:target/cucumber.json" 
											
		}
		)

public class BackGroundRunner {

}

