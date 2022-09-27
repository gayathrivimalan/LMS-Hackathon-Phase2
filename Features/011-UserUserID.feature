Feature: UserID
Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
  Scenario: Verify ID functionality
    Given User is on manage user page
    When User clicks ID in any row
    Then User details dialog box displayed with user information