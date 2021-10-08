package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Abdelkader\\Desktop\\AEK\\Selenium\\BDD\\src\\test\\java\\features\\Home_Work.feature",
		glue ="steps1",
		tags ="@AEK",
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}
		)
public class HM_Login_Runner {

}
