Feature: Home

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
Scenario: Verify that the title of the Home page is "LMS"
    When  User landed on the Home page 
    Then  check the title 
    Then  Verify the site header on the Home page
Scenario: Verify the Menu Bar-Buttons
     When  User landed on the Home page
     Then  User should see a button with text Program on the menu bar
     Then  User should see a button with text Batch on the menu bar
     Then  User should see a button with text User on the menu bar
     Then  User should see a button with text Assignment on the menu bar
     Then  User should see a button with text Attendance on the menu bar
     Then  User should see a button with text Logout on the menu bar 