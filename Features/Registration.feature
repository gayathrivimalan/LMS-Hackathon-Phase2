Feature: Registration

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
Scenario: Validating Heading on the Registration form
	Given User landed on the LMS Website
	When  User clicks on Register button
	Then  User sees the heading on the form as "Registration Form"
Scenario: Validating the Login button visibility
    Given User is on the Registration page
    Then User sees a button with text "Log in" on the form
    Then User Clicks the Log in button
    Then User lands on Log in page
Scenario: Validating Sign Up button visibility
    When User clicks on Register button
    Then User lands on Registration page
    Then User see a button with text "Sign Up" on the form
Scenario: User fills the First Name field
	Given User is on the Registeration Page
    When User fills the First Name in Alphabets only
    Then The First Name will be displayed
Scenario: User Fills the Last Name Field
	Given User is on the Registeration Page
    When User fills the Last Name in Alphabets only
    Then The Last Name will be displayed 
Scenario: User fills the Address Field
    Given User is on the Registeration Page
    When User fills the Address(House number) Field using Alpha Numerics and or Symbols
    Then The Address will be displayed
Scenario: User fills the Street Name Field
	Given User is on the Registeration Page
    When User fills the Street name Field using Alpha Numerics and or Symbols
    Then The Street Name will be displayed
Scenario: User fills the Zip field
	Given User is on the Registeration Page   
    When User fills the 5 digit Zip code using Numbers only
    Then The Zip code will be displayed
Scenario: User fills the City Name field
	Given User is on the Registeration Page
    When User fills the City Name in Alphabets only
    Then The City Name will be displayed
Scenario: User selects the State field   
	Given User is on the Registeration Page
    When User selects the respective State Name from the DropBox
    Then The State Name will be displayed
Scenario: User fills the Phone Number
	Given User is on the Registeration Page
    When User fills the valid 10 digit Mobile number in Numerics
    Then The Mobile Number will be displayed
Scenario: User selects the Birth Date 
	Given User is on the Registeration Page
    When User Selects the Date of Birth from the Calender
    Then Birth Date will be Displayed
Scenario: User fills UserName
	Given User is on the Registeration Page
    When User fills the valid unique UserName
    Then UserName will be displayed
Scenario: User fills Password
	Given User is on the Registeration Page
    When User fills the valid Password with 1 Upper case, 1 Numeric and 1 special charecter and 8 charecters
    Then User Password will  be displayed
Scenario: User fills email ID  
	Given User is on the Registeration Page 
    When User fills the valid email ID 
    Then email ID will be Displayed
Scenario: Validating the Sign Up form with all fields empty
    Given User is on the Registeration Page
    When User enters submit button with all fields empty
    Then User should get a message"Please fill all fields above"
Scenario: Validating the First Name field on Registeration Page
	Given User is on the Registeration Page
	When User clicks Sign Up button with invalid First Name  
	Then User should get a message"Please fill valid First Name"
Scenario: Validating the Last Name field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid Last Name 	
	Then User should get a message"Please fill valid Last Name"
Scenario: Validating the Address field on Registeration Page
	Given	User is on the Registeration Page	
	When User clicks Sign Up button with invalid Address
	Then User should get a message"Please fill valid Address"
Scenario: Validating the Street Name field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid Street Name 	
	Then User should get a message"Please fill valid Street Name"
Scenario: Validating the Zip field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid Zip 	
	Then User should get a message"Please fill valid Zip"
Scenario: Validating the City field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid  City 	
	Then User should get a message"Please fill valid City"
Scenario: Validating the State field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button without selecting  State 	
	Then User should get a message"Please select State"
Scenario: Validating the Phone Number field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid Phone Number	
	Then User should get a message"Please fill valid Phone Number"
Scenario: Validating the BirthDate field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button without selecting BirthDate 	
	Then User should get a message"Please select BirthDate"
Scenario: Validating the UserName field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid UserName 	
	Then User should get a message"Please fill valid UserName"
Scenario: Validating the Password field on Registeration Page	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with invalid Password	
	Then User should get a message"Please fill valid Password "
Scenario: Validating the signup form with existing Username	
	Given User is on the Registeration Page	
	When User clicks Sign Up button with existing User name	
	Then User should see the message "Username already exist "
Scenario: Validating Sign Up form with valid data	
	Given User is on the Registeration Page	
	When User enters all Field value and click Sign Up button.	
	Then User should get a message"Registeration successful"
    
    
    
    
	



