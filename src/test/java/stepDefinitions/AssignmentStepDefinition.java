package stepDefinitions;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;
import utilities.Helper;

public class AssignmentStepDefinition extends BaseClass {

	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.checkTitle();
	}

	@When("User clicks Assignment in header")
	public void user_clicks_assignment_in_header() {
		assignmentPage.clickAssignementHeader();
	}

	@Then("User should see a heading with text Manage Assignment on the page")
	public void user_should_see_a_heading_with_text_manage_assignment_on_the_page() {
		assignmentPage.checkManageAssignmentHeader();
	}

	@Then("User should see the text as Showing one to three of three entries below the table")
	public void user_should_see_the_text_as_showing_one_to_three_of_three_entries_below_the_table() {
		assignmentPage.checkShowingEntries();
	}

	@Then("User should see the footer as In total there are three assignements")
	public void user_should_see_the_footer_as_in_total_there_are_three_assignements() {
		assignmentPage.checkAssignementFooterMsg();
	}

	@Given("User is on Assignment page")
	public void user_is_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@Then("Text box used for search has text as Search")
	public void text_box_used_for_search_has_text_as_search() {
		assignmentPage.checkSearchBox();
	}

	@When("User clicks on search with sql into search box")
	public void user_clicks_on_search_with_sql_into_search_box() {
		assignmentPage.EnterSearchBox();
	}

	@Then("Entries for sql are shown")
	public void entries_for_sql_are_shown() {
		assignmentPage.checkSqlAssignment();
	}

	@When("User selects Assignment using checkbox")
	public void user_selects_assignment_using_checkbox() {
		assignmentPage.EnterCheckBox();
	}

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		assignmentPage.ClickEditIcon();
	}

	@Then("User lands on Assignment Details form")
	public void user_lands_on_assignment_details_form() {
		assignmentPage.checkAssignmentDetails();
	}

	@When("User edits Name and click save")
	public void user_edits_name_and_click_save() {
		assignmentPage.EnterAssignmentName();
	}

	@Then("User can see updated Name")
	public void user_can_see_updated_name() {
		assignmentPage.checkSql();

	}

	@When("User edits Description and click save")
	public void user_edits_description_and_click_save() {
		assignmentPage.ClickEditIcon();
		assignmentPage.EnterAssignmentDescription();
	}

	@Then("User can see updated Description")
	public void user_can_see_updated_description() {
		assignmentPage.checkSqllanguage();
	}

	@When("User edits Grade and click save")
	public void user_edits_grade_and_click_save() {
		assignmentPage.ClickEditIcon();
		assignmentPage.EnterAssignmentGrade();
	}

	@When("User edits Due Date and click save")
	public void user_edits_due_date_and_click_save() {
		assignmentPage.ClickEditIcon();
		assignmentPage.EnterAssignmentDueDate();
	}

	@Then("User can see updated Due Date")
	public void user_can_see_updated_due_date() {
		assignmentPage.checkAssignmentDueDate();
	}

	@When("User clicks Cancel button")
	public void user_clicks_cancel_button() {
		assignmentPage.ClickEditIcon();
		assignmentPage.ClickCancelButton();
		assignmentPage.ClickSaveButton();
	}

	@Then("User can see Assignment Details form disappears")
	public void user_can_see_assignment_details_form_disappears() {
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User clicks Save button in Assignment Page")
	public void user_clicks_save_button_in_Assignment_Page() throws InterruptedException {
		assignmentPage.isElementVisible(assignmentPage.EditIcon, Duration.ofSeconds(5));
		assignmentPage.ClickEditIcon();
		Thread.sleep(1000);
		assignmentPage.isElementVisible(assignmentPage.SaveButton, Duration.ofSeconds(5));
		assignmentPage.ClickSaveButton();
		Thread.sleep(1000);
		assignmentPage.isElementVisible(assignmentPage.SuccessMSg, Duration.ofSeconds(10));
		Thread.sleep(1000);
		
	}

	@Then("User can see Successful Assignment Updated message")
	public void user_can_see_successful_assignment_updated_message() {

		assignmentPage.ViewSuccessMsg();
	}

	@Given("User currently on Assignment page")
	public void user_currently_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User clicks on Delete button after selecting an assignment")
	public void user_clicks_on_delete_button_after_selecting_an_assignment() {
		assignmentPage.EnterCheckBox();
		assignmentPage.ClickDeleteIcon();
	}

	@Then("User lands on Confirm Deletion form")
	public void user_lands_on_confirm_deletion_form() {
		assignmentPage.VerifyDeleteConfirmWindow();
	}

	

	@When("User clicks Yes button")
	public void user_clicks_yes_button() {
		assignmentPage.ClickYesButton();
		assignmentPage.isElementVisible(assignmentPage.DeleteSuccessMSg, Duration.ofSeconds(10));
	}

	@Then("User can see Successful Assignment Deleted message")
	public void user_can_see_successful_assignment_deleted_message() {

		assignmentPage.ViewDeleteSuccessMsg();
	}

	@When("User clicks No button")
	public void user_clicks_no_button() {
		assignmentPage.EnterCheckBox();
		assignmentPage.ClickDeleteIcon();
		assignmentPage.ClickNoButton();
	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
		assignmentPage.checkManageAssignmentHeader();
	}

	@Given("User present on Assignment page")
	public void user_present_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User selects more than one Assignment using checkbox")
	public void user_selects_more_than_one_assignment_using_checkbox() {
		assignmentPage.EnterCommonCheckBox();
	}

	@Then("Assignments get selected")
	public void assignments_get_selected() {
		System.out.println("Multiple Assignments get selected");
	}

	@When("User clicks on Delete button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		assignmentPage.ClickCommonDeleteButton();
	}

	@Then("User can see Confirm Deletion form")
	public void user_can_see_confirm_deletion_form() {
		System.out.println("User can see Confirm Deletion form");
	}

	@Given("User see Confirm Deletion form")
	public void user_see_confirm_deletion_form() {
		System.out.println("User see Confirm Deletion form");
	}

	@When("User clicks Yes button on Delete Form")
	public void user_clicks_yes_button_on_delete_form() {
		System.out.println("User clicks Yes button on Delete Form");
	}

	@Then("User can see Successful Deleted message")
	public void user_can_see_successful_deleted_message() {
		System.out.println("User can see Successful Deleted message");
	}

	@When("User clicks No button on Delete Form")
	public void user_clicks_no_button_on_delete_form() {
		System.out.println("User clicks No button on Delete Form");
	}

	@Then("User can see Confirm Deletion form gets closed")
	public void user_can_see_confirm_deletion_form_gets_closed() {
		System.out.println("User can see Confirm Deletion form gets closed");
	}

	@Given("User stays on Assignment page")
	public void user_stays_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User clicks A New Assignment button")
	public void user_clicks_a_new_assignment_button() {
		assignmentPage.ClickNewAssignmentButton();

	}

	@Then("user can see Assignment details form")
	public void user_can_see_assignment_details_form() {
		assignmentPage.VerifyNewAssignmentDetailsWindow();
	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		assignmentPage.ClickNewAssignmentSaveButton();
	}

	@Then("User gets message Name is required")
	public void user_gets_message_name_is_required() {
		assignmentPage.VerifyNameIsRequiredMSg();
	}

	@When("user enters Assignment name")
	public void user_enters_assignment_name() {
		assignmentPage.EnterNewAssignmentName();
	}

	@Then("User can see Name entered")
	public void user_can_see_name_entered() {
		assignmentPage.CheckNewAssignmentName();
	}

	@When("user enters Assignment description")
	public void user_enters_assignment_description() {
		assignmentPage.EnterNewAssignmentDescription();
	}

	@Then("User can see Description entered")
	public void user_can_see_description_entered() {
		assignmentPage.CheckNewAssignmentDescription();
	}

	@When("user enters assignment grade")
	public void user_enters_assignment_grade() {
		assignmentPage.EnterNewAssignmentGrade();
	}

	@Then("user can see Grade entered")
	public void user_can_see_grade_entered() {
		assignmentPage.CheckNewAssignmentGrade();
	}

	@When("user enters assignment due date")
	public void user_enters_assignment_due_date() {
		assignmentPage.EnterNewAssignmentDueDate();
	}

	@Then("user can see Assignment due date")
	public void user_can_see_assignment_due_date() {
		assignmentPage.CheckNewAssignmentDueDate();
	}

	@When("User now clicks Save button")
	public void user_now_clicks_save_button() {
		assignmentPage.ClickNewAssignmentSaveButton();
		assignmentPage.isElementVisible(assignmentPage.NewAssignmentSuccessMSg, Duration.ofSeconds(10));
	}

	@Then("User gets message Successful assignment created")
	public void user_gets_message_successful_assignment_created() {

		assignmentPage.ViewNewAssignmentSuccessMsg();
	}

	@When("User now clicks Cancel button")
	public void user_now_clicks_cancel_button() {
		assignmentPage.ClickNewAssignmentButton();
		assignmentPage.EnterNewAssignmentName();
		assignmentPage.ClickNewCancelButton();
	}

	@Then("User can now see assignment Details form disappears")
	public void user_can_now_see_assignment_details_form_disappears() {
		assignmentPage.ClickNewAssignmentSaveButton();
	}

	@Given("User on Assignment Page")
	public void user_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User Click on Submit")
	public void user_click_on_submit() {
		System.out.println("User Click on Submit");
	}

	@Then("User can see need to fill required fields")
	public void user_can_see_need_to_fill_required_fields() {
		System.out.println("User can see need to fill required fields");
	}

	@When("User enter reguired details and submit")
	public void user_enter_reguired_details_and_submit() {
		System.out.println("User enter reguired details and submit");
	}

	@Then("User can see Submit Assignment Sucessfully")
	public void user_can_see_submit_assignment_sucessfully() {
		System.out.println("User enter reguired details and submit");
	}

	@Given("Users are on Assignment Page")
	public void users_are_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User clicks on the Ascending down arrow near to the Assignment name")
	public void user_clicks_on_the_ascending_down_arrow_near_to_the_assignment_name() {
		assignmentPage.clickAssignmentAscendingOrder();
	}

	@Then("User can see the results in Ascending order of Assignment name")
	public void user_can_see_the_results_in_ascending_order_of_assignment_name() {
		assignmentPage.clickAssignmentAscendingOrder();
	}

	@When("User clicks onthe Ascending down arrow near to the Assignment Description")
	public void user_clicks_onthe_ascending_down_arrow_near_to_the_assignment_description() {
		assignmentPage.clickAssignmentDescriptionAscendingOrder();
	}

	@Then("User can see the results in Ascending order of Assignment Description")
	public void user_can_see_the_results_in_ascending_order_of_assignment_description() {
		assignmentPage.clickAssignmentDescriptionAscendingOrder();
	}

	@Given("Users are currently on Assignment Page")
	public void users_are_currently_on_assignment_page() {
		assignmentPage = new AssignmentPage(Helper.getDriver());
		assignmentPage.clickAssignementHeader();
		assignmentPage.checkManageAssignmentHeader();
	}

	@When("User clicks onthe Descending arrow down near to the Assignment name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_name() {
		try {
		assignmentPage.clickAssignmentDescendingOrder();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Then("User can see the results in Descending order of Assignment name")
	public void user_can_see_the_results_in_descending_order_of_assignment_name() {
		try {
			assignmentPage.clickAssignmentDescendingOrder();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		
	}

	@When("User clicks onthe Descending arrow down near to the Assignment Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_description() {
		
		try {
			assignmentPage.clickAssignmentDescriptionDescendingOrder();
			}catch(Exception ex){
				ex.printStackTrace();
			}
	}

	@Then("User can see the results in Descending order of Assignment Description")
	public void user_can_see_the_results_in_descending_order_of_assignment_description(){
		try {
			assignmentPage.clickAssignmentDescriptionDescendingOrder();
			}catch(Exception ex){
				System.out.println(ex);
			}		
	}
}
