package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HeaderPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LoginPageAlt;
import utilities.Helper;
import utilities.MenuItems;

import org.junit.Assert;

public class HomeSteps extends BaseClass{
	
	@Given("User landed on the Home page")
	public void user_landed_on_the_home_page() {
	   homePage = new HomePage(Helper.getDriver());	
	   headerPage = new HeaderPage(Helper.getDriver());
	   homePage.getPMHomePgTitle();	
	}
	
	@When("User enters Username and Password")
	public void user_enters_username_and_password() {
		LoginPageAlt.SetUName(Helper.GetUserName());
		LoginPageAlt.SetPwd(Helper.GetPassword());
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
	
	@Then("User should be able to see all six menu bar button in the header")
	public void user_should_be_able_to_see_all_six_menu_bar_button_in_the_header() {
		Boolean isProgramVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Program);
	    Assert.assertTrue(isProgramVisible);
	    
	    Boolean isBatchVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Batch);
	    Assert.assertTrue(isBatchVisible);
	    
	    Boolean isUserVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.User);
	    Assert.assertTrue(isUserVisible);
	    
	    Boolean isAssignmentVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Assignment);
	    Assert.assertTrue(isAssignmentVisible);
	    
	    Boolean isAttendanceVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Attendance);
	    Assert.assertTrue(isAttendanceVisible);
	    
	    Boolean isLogoutVisible =  headerPage.IsMenuBarItemDisplayed(MenuItems.Logout);
	    Assert.assertTrue(isLogoutVisible);
	}
}
