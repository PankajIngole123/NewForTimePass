package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/comFB/features",glue="SetUp",dryRun=false,
		monochrome=true, plugin="html:target"
		)
public class Runner {

}
