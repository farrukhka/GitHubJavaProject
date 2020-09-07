package PageObjectPattern;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)

	@CucumberOptions
	       (features="/Users/farrukhka/eclipse-workspace/Project/src/test/java/login.feature",
	       glue= "stepDefinition")

	public class TestRunner {
}
