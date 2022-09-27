package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.Helper;

public class FailureScenarioSteps extends BaseClass {

	@When("Home Page title should be {string}")
	public void home_page_title_should_be(String string) {
		homePage = new HomePage(Helper.getDriver());
		 String homePgTitle = Helper.getTitle();
		 Assert.assertEquals(string, homePgTitle);		    
	}

	@When("the user mentioned as {string}")
	public void the_user_mentioned_as(String string) throws Exception {
		String homePgTitle = Helper.getTitle();
		Assert.assertEquals(string, homePgTitle);	
	}
	
	@When("Login Page title is {string}")
	public void login_page_title_is(String string) {
		loginPage = new LoginPage(Helper.getDriver());
		String loginPgTitle = Helper.getTitle();
		Assert.assertEquals(string, loginPgTitle);	
	}
	
	@When("the user given as {string}")
	public void the_user_given_as(String string) throws Exception {
		String loginPgTitle = Helper.getTitle();
		Assert.assertEquals(string, loginPgTitle);	
	}
}
