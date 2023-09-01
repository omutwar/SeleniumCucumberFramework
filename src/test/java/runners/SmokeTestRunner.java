package runners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:Reports/htmlReport.html",
		"json:Reports/jsonReport.json" }, 
				features = "./src/test/resources/features", 
				glue = "step_definitions", 
				dryRun = false, 
				monochrome = true, 
				tags = "@SmokeTest")
public class SmokeTestRunner {
	Logger log = LogManager.getLogger(SmokeTestRunner.class);
}

// to run with TestNG >> extends AbstractTestNGCucumberTests