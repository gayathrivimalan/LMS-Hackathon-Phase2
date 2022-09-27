Feature: Home

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
Scenario: Verify that the title of the Home page is "LMS"
    Given  User landed on the Home page 
    When  check the title  
    Then  Verify the site header on the Home page
Scenario: Verify the Menu Bar-Buttons
     When User landed on the Home page
     Then User should be able to see all six menu bar button in the header
      