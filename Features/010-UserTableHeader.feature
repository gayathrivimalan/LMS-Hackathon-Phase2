Feature: Table header
Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
  Scenario: Verify Table header
    Given User is on  Login page
    When User is on the Manage user page 
    Then User should see all the table headers
@tag6
  Scenario: Check box in table header
    Given User in manage user page
    When User checks empty checkbox in header
    Then Check box in all the rows of user table should be checked