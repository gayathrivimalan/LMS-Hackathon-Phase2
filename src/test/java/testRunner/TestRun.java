package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"..\\LMSUIHackathonPhase2_Cucumber\\Features"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//			 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	             
	    }		
	
)
public class TestRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
