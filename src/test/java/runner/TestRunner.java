package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\arnab.adak\\eclipse-workspace\\Test\\src\\test\\resources\\Test1.feature"
		,glue={"src.test.steps"}
		,tags= {"@tag"}
		)

public class TestRunner {

}