package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"..\\LMSUIHackathonPhase2_Cucumber\\Features"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
			 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	             
	    }		
)
public class TestRun {

}
