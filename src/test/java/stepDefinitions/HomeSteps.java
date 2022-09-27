package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HeaderPage;
import pageObjects.HomePage;
import pageObjects.LoginPage2;
import utilities.Helper;
import utilities.MenuItems;

import org.junit.Assert;

public class HomeSteps extends BaseClass{
	@When("User landed on the Home page")
	public void user_landed_on_the_home_page() {
	   homePage = new HomePage(Helper.getDriver());	
	   headerPage = new HeaderPage(Helper.getDriver());
	   homePage.getPMHomePgTitle();	
	}
	
	@When("User enters Username and Password")
	public void user_enters_username_and_password() {
		LoginPage2.SetUName(Helper.GetUserName());
		LoginPage2.SetPwd(Helper.GetPassword());
	}

	@Then("check the title")
	public void check_the_title() {
		Assert.assertEquals(homePage.getPMHomePgTitle(), "Manage Program");	
	}
	
	@Then("Verify the site header on the Home page")
	public void verify_the_site_header_on_the_home_page() {
		String val=headerPage.getSiteHeader();
		System.out.println("title"+val);
		Assert.assertEquals(headerPage.getSiteHeader(), "LMS - Learning Management System");	
	}
	
	
	@Then("User should see a button with text Program on the menu bar")
	public void user_should_see_a_button_with_text_program_on_the_menu_bar() {
		Boolean isVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Program);
	    Assert.assertTrue(isVisible);
	}

	@Then("User should see a button with text Batch on the menu bar")
	public void user_should_see_a_button_with_text_batch_on_the_menu_bar() {
		Boolean isVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Batch);
	    Assert.assertTrue(isVisible);
	}

	@Then("User should see a button with text User on the menu bar")
	public void user_should_see_a_button_with_text_user_on_the_menu_bar() {
		Boolean isVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.User);
	    Assert.assertTrue(isVisible);
	}

	@Then("User should see a button with text Assignment on the menu bar")
	public void user_should_see_a_button_with_text_assignment_on_the_menu_bar() {
		Boolean isVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Assignment);
	    Assert.assertTrue(isVisible);
	}

	@Then("User should see a button with text Attendance on the menu bar")
	public void user_should_see_a_button_with_text_attendance_on_the_menu_bar() {
		Boolean isVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Attendance);
	    Assert.assertTrue(isVisible);
	}

	@Then("User should see a button with text Logout on the menu bar")
	public void user_should_see_a_button_with_text_logout_on_the_menu_bar() {
		Boolean isVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Logout);
	    Assert.assertTrue(isVisible);
	    
	}


}
