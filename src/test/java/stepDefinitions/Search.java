package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageUserPageobject;
import utilities.Helper;

public class Search {
	ManageUserPageobject manageUser;
	@Given("User in Lms website after Login")
	public void user_in_lms_website_after_login() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		String Title = Helper.getTitle();
		Assert.assertEquals(Title, "LMS");
	    System.out.println("User is on LMS website");
	    System.out.println("User Click###");
		manageUser.Usermoduleclick();
	}
	

	

	@Then("User should see the search input field with search icon and text as\" Search…\"")
	public void user_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
	    System.out.println("User should see the search input field with search icon");
	}

	

	
	@When("User types random text in search field which has no matching entry")
	public void user_types_random_text_in_search_field_which_has_no_matching_entry() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
	   System.out.println("User types random textin searchfiels");
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
	   System.out.println("No rows is not displaying");
	}
}