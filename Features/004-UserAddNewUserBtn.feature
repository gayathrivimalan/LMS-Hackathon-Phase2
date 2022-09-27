Feature: Add New User button
Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
@tab4
  Scenario: Verify the presence of Add new user button
    Given User reached LoginPage
    When User is on Manage user page after clicking user 
    When  User clicks Add New User button
    Then User should see the button with text + icon and Add New User
    
    Then User should see the "User details" dialog box

