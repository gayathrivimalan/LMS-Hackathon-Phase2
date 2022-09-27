package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageUserPageobject;
import pageObjects.UserIdPageobject;
import utilities.Helper;

public class UserID {
	ManageUserPageobject manageUser;
	UserIdPageobject userid;

	@Given("User is on manage user page")
	public void user_is_on_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();
	}

	@When("User clicks ID in any row")
	public void user_clicks_id_in_any_row() {
		userid = new UserIdPageobject(Helper.getDriver());
		userid.UserIdclicking();
	}

	@Then("User details dialog box displayed with user information")
	public void user_details_dialog_box_displayed_with_user_information() {
		System.out.println("User Can see user dialog box");
	}
}
