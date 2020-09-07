package cucumberTestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
       (features="/Users/farrukhka/eclipse-workspace/Project/src/test/java/features",
       glue= "stepDefinition")

public class TestRunner {
	
	
}





	


