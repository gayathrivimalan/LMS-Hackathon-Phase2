package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.Helper;
import utilities.UserLogin;

public class LoginStep extends BaseClass{
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		loginPage = new LoginPage(Helper.getDriver());
	}

	@When("User opens the LMS Website {string}")
	public void user_opens_the_lms_website(String url){
		 Helper.openPage(url);
		 
	}

	@Then("User should see the Login page")
	public void user_should_see_the_login_page()  {
		loginPage.checkTitle();
		
	}

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		loginPage.checkTitle();
	}

	@When("User fills the form from the given sheetName\"Data\"")
	public void user_fills_the_form_from_the_given_sheet_name_data() throws InterruptedException {
		UserLogin ul = new UserLogin();
		try {
			Object data[][] = ul.getTestData("Data");

			String username, password;

			for (int i = 0; i < data.length; i++) {
				username = null;
				password = null;
				for (int j = 0; j < data[i].length; j++) {
					if (j == 0) {
						username = (String) data[i][j];
					}
					if (j == 1) {
						password = (String) data[i][j];
					}
				}
				if (username != null && password != null) {
					if(username.equalsIgnoreCase("null")) {
						username = "";
					}
					if(password.equalsIgnoreCase("null")) {
						password = "";
					}
					System.out.println("User Name: " + username);
					System.out.println("Password: " + password);
					Helper.getDriver().navigate().refresh();
					loginPage.enterUserName(username);
					loginPage.enterPassword(password);
					loginPage.clickLogin();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Then("User should see the LMS Home page")
	public void user_should_see_the_lms_home_page() {
		loginPage.checkHomePageTitle();
	}



}
