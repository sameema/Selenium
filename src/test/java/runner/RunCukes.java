package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/CreateLead.feature",
		glue = {"steps,pages"},
		monochrome = true,
		tags = {"@reg or @smoke"})
		/*dryRun = true,
		snippets = SnippetType.CAMELCASE)*/

public class RunCukes {

}
