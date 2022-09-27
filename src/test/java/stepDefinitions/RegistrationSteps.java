package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;
import utilities.Helper;
import utilities.RegFormControls;

public class RegistrationSteps extends BaseClass{

	@Given("User landed on the LMS Website")
	public void user_landed_on_the_lms_website() {
	    registrationPage = new RegistrationPage(Helper.getDriver());
	    Assert.assertEquals(Helper.getTitle(), "LMS"); 			
	}
	
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		registrationPage.ClickBtnRegister();
	}
	
	@Then("User sees the heading on the form as {string}")
	public void user_sees_the_heading_on_the_form_as(String expectedHeader) {
		 String Header = registrationPage.getRegSiteHeader();
		 System.out.println("header: "+Header);
		 Assert.assertEquals(Header, expectedHeader);
	}
	
	@Given("User is on the Registration page")
	public void user_is_on_the_registration_page() {
		registrationPage.getRegSiteHeader();
	}
	
	@Then("User sees a button with text {string} on the form")
	public void user_sees_a_button_with_text_on_the_form(String expectedvalue) {
		String LoginBtnTxt = registrationPage.GetLoginBtnText();
		 Assert.assertEquals(LoginBtnTxt,expectedvalue);
	    
	}
	
	@Then("User Clicks the Log in button")
	public void user_clicks_the_log_in_button() {
		registrationPage.ClickBtnLogin();
	}
	
	@Then("User lands on Log in page")
	public void user_lands_on_log_in_page() {
		Boolean isVisible = registrationPage.HeaderLoginPage();
		Assert.assertTrue(isVisible);
	    
	}
		
	@Then("User see a button with text {string} on the form")
	public void user_see_a_button_with_text_on_the_form(String expectedvalue) {
		String SignUpBtnTxt = registrationPage.GetSignUpBtnText();
		 Assert.assertEquals(SignUpBtnTxt,expectedvalue);
		
		    
		}
	@When("User fills the First Name in Alphabets only")
	public void user_fills_the_first_name_in_alphabets_only() {
		registrationPage.setRegFormControlValues(RegFormControls.FirstName, "FirstName One");
	}
	
	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed() {
		String FirstNameDisplay = registrationPage.getRegFormControlValues(RegFormControls.FirstName);
		 Assert.assertEquals(FirstNameDisplay,"FirstName One");
	}
	
	@When("User fills the Last Name in Alphabets only")
	public void user_fills_the_last_name_in_alphabets_only() {
		registrationPage.setRegFormControlValues(RegFormControls.LastName, "LastName Two");
	}
	
	@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed() {
		String LastNameDisplay = registrationPage.getRegFormControlValues(RegFormControls.LastName);
		 Assert.assertEquals(LastNameDisplay,"LastName Two");
	}
	
	@When("User fills the Address\\(House number) Field using Alpha Numerics and or Symbols")
	public void user_fills_the_address_house_number_field_using_alpha_numerics_and_or_symbols() {
		registrationPage.setRegFormControlValues(RegFormControls.Address,"12345");
	}
	
	@Then("The Address will be displayed")
	public void the_address_will_be_displayed() {
		String AddressDisplay = registrationPage.getRegFormControlValues(RegFormControls.Address);
		 Assert.assertEquals(AddressDisplay,"12345");
	}
	
	@When("User fills the Street name Field using Alpha Numerics and or Symbols")
	public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols() {
		registrationPage.setRegFormControlValues(RegFormControls.StreetName,"ABC Street");
	}
	
	@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed() {
		String StreetDisplay = registrationPage.getRegFormControlValues(RegFormControls.StreetName);
		 Assert.assertEquals(StreetDisplay,"ABC Street");
	}
	
	@When("User fills the {int} digit Zip code using Numbers only")
	public void user_fills_the_digit_zip_code_using_numbers_only(Integer int1) {
		registrationPage.setRegFormControlValues(RegFormControls.Zip,"97229");
	}
	
	@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed() {
		String ZipCodeDisplay = registrationPage.getRegFormControlValues(RegFormControls.Zip);
		 Assert.assertEquals(ZipCodeDisplay,"97229");
	}
	
	@When("User fills the City Name in Alphabets only")
	public void user_fills_the_city_name_in_alphabets_only() {
		registrationPage.setRegFormControlValues(RegFormControls.City,"Portland");
	}
	
	@Then("The City Name will be displayed")
	public void the_city_name_will_be_displayed() {
		String cityDisplay = registrationPage.getRegFormControlValues(RegFormControls.City);
		 Assert.assertEquals(cityDisplay,"97229");
	}
	
	@When("User selects the respective State Name from the DropBox")
	public void user_selects_the_respective_state_name_from_the_drop_box() {
		registrationPage.setRegFormControlValues(RegFormControls.State,"Oregon");
	}
	
	@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed() {
		String stateDisplay = registrationPage.getRegFormControlValues(RegFormControls.State);
		 Assert.assertEquals(stateDisplay,"Oregon");
	}
	
	@When("User fills the valid {int} digit Mobile number in Numerics")
	public void user_fills_the_valid_digit_mobile_number_in_numerics(Integer int1) {
		registrationPage.setRegFormControlValues(RegFormControls.PhoneNumber,"5033334444");
	}
	
	@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed() {
		String phnoDisplay = registrationPage.getRegFormControlValues(RegFormControls.PhoneNumber);
		 Assert.assertEquals(phnoDisplay,"5033334444"); 
	}
	
	@When("User Selects the Date of Birth from the Calender")
	public void user_selects_the_date_of_birth_from_the_calender() {
		registrationPage.setRegFormControlValues(RegFormControls.Birthdate,"01-02-1999");
	}
	
	@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed() {
		String BDDisplay = registrationPage.getRegFormControlValues(RegFormControls.Birthdate);
		 Assert.assertEquals(BDDisplay,"01-02-1999");
	}
	
	@When("User fills the valid unique UserName")
	public void user_fills_the_valid_unique_user_name() {
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"TestOne");
	}
	
	@Then("UserName will be displayed")
	public void user_name_will_be_displayed() {
		String UNDisplay = registrationPage.getRegFormControlValues(RegFormControls.UserName);
		 Assert.assertEquals(UNDisplay,"TestOne");
	}
	
	@When("User fills the valid Password with {int} Upper case, {int} Numeric and {int} special charecter and {int} charecters")
	public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(Integer int1, Integer int2, Integer int3, Integer int4) {
		registrationPage.setRegFormControlValues(RegFormControls.Password,"Test@&111");
	}
	
	@Then("User Password will  be displayed")
	public void user_password_will_be_displayed() {
		String PWDDisplay = registrationPage.getRegFormControlValues(RegFormControls.Password);
		 Assert.assertEquals(PWDDisplay,"Test@&111");
	}
	
	@When("User fills the valid email ID")
	public void user_fills_the_valid_email_id() {
		registrationPage.setRegFormControlValues(RegFormControls.Email,"Test@gmail.com");
	}
	
	@Then("email ID will be Displayed")
	public void email_id_will_be_displayed() {
		String emailDisplay = registrationPage.getRegFormControlValues(RegFormControls.Email);
		 Assert.assertEquals(emailDisplay,"Test@gmail.com");
		 registrationPage.ClickBtnSignUp();
	}
	
	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
		registrationPage.ClickBtnSignUp();
	    
	}

	@Then("User should get a message\"Please fill all fields above\"")
	public void user_should_get_a_message_please_fill_all_fields_above() {
		String signUpErrorMsg =registrationPage.getErrMsgSignUp();
		Assert.assertEquals("Please fill all fields above",signUpErrorMsg);		
	}

	@When("User clicks Sign Up button with invalid First Name")
	public void user_clicks_sign_up_button_with_invalid_first_name() {
		registrationPage.setRegFormControlValues(RegFormControls.FirstName,"aaaaaaaaaaaaaa");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid First Name\"")
	public void user_should_get_a_message_please_fill_valid_first_name() {
		String FirstNameErrorMsg =registrationPage.getFNErrMsg();
		Assert.assertEquals("Please fill valid First Name",FirstNameErrorMsg);	
	}

	@When("User clicks Sign Up button with invalid Last Name")
	public void user_clicks_sign_up_button_with_invalid_last_name() {
		registrationPage.setRegFormControlValues(RegFormControls.LastName,"bbbbbbbbbbbbbbbb");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid Last Name\"")
	public void user_should_get_a_message_please_fill_valid_last_name() {
		String LastNameErrorMsg =registrationPage.getLNErrMsg();
		Assert.assertEquals("Please fill valid Last Name",LastNameErrorMsg);	
	}

	@When("User clicks Sign Up button with invalid Address")
	public void user_clicks_sign_up_button_with_invalid_address() {
		registrationPage.setRegFormControlValues(RegFormControls.Address,"####");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid Address\"")
	public void user_should_get_a_message_please_fill_valid_address() {
		String AddressErrorMsg =registrationPage.getAddrsErrMsg();
		Assert.assertEquals("Please fill valid Address",AddressErrorMsg);
	}

	@When("User clicks Sign Up button with invalid Street Name")
	public void user_clicks_sign_up_button_with_invalid_street_name() {
		registrationPage.setRegFormControlValues(RegFormControls.StreetName,"####");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid Street Name\"")
	public void user_should_get_a_message_please_fill_valid_street_name() {
		String streetErrorMsg =registrationPage.getStreetErrMsg();
		Assert.assertEquals("Please fill valid Street Name",streetErrorMsg);
	}

	
	@When("User clicks Sign Up button with invalid Zip")
	public void user_clicks_sign_up_button_with_invalid_zip() {
		registrationPage.setRegFormControlValues(RegFormControls.Zip,"####");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid Zip\"")
	public void user_should_get_a_message_please_fill_valid_zip() {
		String zipErrorMsg =registrationPage.getZipErrMsg();
		Assert.assertEquals("Please fill valid Zip",zipErrorMsg);
	}

	@When("User clicks Sign Up button with invalid  City")
	public void user_clicks_sign_up_button_with_invalid_city() {
		registrationPage.setRegFormControlValues(RegFormControls.City,"####");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid City\"")
	public void user_should_get_a_message_please_fill_valid_city() {
		String cityErrorMsg =registrationPage.getCityErrMsg();
		Assert.assertEquals("Please fill valid City",cityErrorMsg);
	}

	@When("User clicks Sign Up button without selecting  State")
	public void user_clicks_sign_up_button_without_selecting_state() {
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please select State\"")
	public void user_should_get_a_message_please_select_state() {
		String stateErrorMsg =registrationPage.getStateErrMsg();
		Assert.assertEquals("Please select State",stateErrorMsg);
	}

	@When("User clicks Sign Up button with invalid Phone Number")
	public void user_clicks_sign_up_button_with_invalid_phone_number() {
		registrationPage.setRegFormControlValues(RegFormControls.PhoneNumber,"####");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid Phone Number\"")
	public void user_should_get_a_message_please_fill_valid_phone_number() {
		String PhoneNoErrorMsg =registrationPage.getPhNoErrMsg();
		Assert.assertEquals("Please fill valid Phone Number",PhoneNoErrorMsg);
	}

	@When("User clicks Sign Up button without selecting BirthDate")
	public void user_clicks_sign_up_button_without_selecting_birth_date() {
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please select BirthDate\"")
	public void user_should_get_a_message_please_select_birth_date() {
		String birthDtErrorMsg =registrationPage.getBithDtErrMsg();
		Assert.assertEquals("Please select BirthDate",birthDtErrorMsg);
	}

	@When("User clicks Sign Up button with invalid UserName")
	public void user_clicks_sign_up_button_with_invalid_user_name() {
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"####");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid UserName\"")
	public void user_should_get_a_message_please_fill_valid_user_name() {
		String userNameErrorMsg =registrationPage.getUNErrMsg();
		Assert.assertEquals("Please fill valid UserName",userNameErrorMsg);
	}

	@When("User clicks Sign Up button with invalid Password")
	public void user_clicks_sign_up_button_with_invalid_password() {
		registrationPage.setRegFormControlValues(RegFormControls.Password,"#");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Please fill valid Password \"")
	public void user_should_get_a_message_please_fill_valid_password() {
		String passwordErrorMsg =registrationPage.getPwdErrMsg();
		Assert.assertEquals("Please fill valid Password",passwordErrorMsg);
	}

	@When("User clicks Sign Up button with existing User name")
	public void user_clicks_sign_up_button_with_existing_user_name() {
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"TestOne");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String string) {
		String UnAlreadyexistsErrorMsg =registrationPage.getUNExistsInfoErrMsg();
		Assert.assertEquals(string,UnAlreadyexistsErrorMsg);
	}

	@When("User enters all Field value and click Sign Up button.")
	public void user_enters_all_field_value_and_click_Sign_Up_button() {
		registrationPage.setRegFormControlValues(RegFormControls.FirstName,"LMSUI");
		registrationPage.setRegFormControlValues(RegFormControls.LastName,"Application");
		registrationPage.setRegFormControlValues(RegFormControls.Address,"12345");
		registrationPage.setRegFormControlValues(RegFormControls.StreetName,"NE West Ave");
		registrationPage.setRegFormControlValues(RegFormControls.City,"Beaverton");
		registrationPage.setRegFormControlValues(RegFormControls.State,"Portland");
		registrationPage.setRegFormControlValues(RegFormControls.Zip,"97229");
		registrationPage.setRegFormControlValues(RegFormControls.Birthdate,"01-01-1987");
		registrationPage.setRegFormControlValues(RegFormControls.PhoneNumber,"5033331234");
		registrationPage.setRegFormControlValues(RegFormControls.UserName,"LMSLMS");
		registrationPage.setRegFormControlValues(RegFormControls.Password,"Hello@123");
		registrationPage.setRegFormControlValues(RegFormControls.Email,"LMSLMS@gmail.com");
		registrationPage.ClickBtnSignUp();
	}

	@Then("User should get a message\"Registeration successful\"")
	public void user_should_get_a_message_registeration_successful() {
		String text = registrationPage.getSuccessfulSignUpMsg() ;
		Assert.assertEquals(text,"Registeration successful");
	}	
	}
