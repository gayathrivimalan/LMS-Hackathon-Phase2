package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ButtonsPageobject;
import pageObjects.ManageUserPageobject;
import pageObjects.PaginationPageobject;
import pageObjects.TableHeaderPageobject;
import utilities.Helper;

public class TableHeader {
	ManageUserPageobject manageUser;
	PaginationPageobject pagination;
	ButtonsPageobject button;
	TableHeaderPageobject table;

	@Given("User is on  Login page")
	public void user_is_on_login_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		button = new ButtonsPageobject(Helper.getDriver());
		table = new TableHeaderPageobject(Helper.getDriver());

	}

	@When("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() {
		manageUser.Usermoduleclick();
	}

	@Then("User should see all the table headers")
	public void user_should_see_all_the_table_headers() {
		table.TableHeadingPresence();

	}

	@Given("User in manage user page")
	public void user_in_manage_user_page() {
		manageUser = new ManageUserPageobject(Helper.getDriver());
		button = new ButtonsPageobject(Helper.getDriver());
		table = new TableHeaderPageobject(Helper.getDriver());
		manageUser.Usermoduleclick();

	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
		table.CheckboxSelect();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {

	}
}
