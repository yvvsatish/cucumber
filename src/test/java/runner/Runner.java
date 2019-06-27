package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature\\gmail.feature" ,glue={"stepDefinition"}, 
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
/*tags = {"@SmokeTest","@RegressionTest"}, */monochrome = true)

 public class Runner {
	 @AfterClass
	 public static void setup()
	 {
	 Reporter.loadXMLConfig(new File("src\\test\\java\\extent-config.xml"));
	 //********************** Optional **************************//
	 Reporter.setSystemInfo("User Name", "AJ");
	 Reporter.setSystemInfo("Application Name", "Test App ");
	 Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	 Reporter.setSystemInfo("Environment", "Production");
	 Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	 }
}