package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true, 
				plugin = {"pretty", "html:Reports/htmlReport.html","json:Reports/jsonReport.json"}, 
				features = { ".\\src\\test\\resources\\features" }, 
				glue = {"step_definitions" }, 
				tags = "@etsyLoginPage")
public class EtsyPageRunner {

}
