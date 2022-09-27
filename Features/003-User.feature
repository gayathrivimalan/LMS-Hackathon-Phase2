Feature: Manage user page
Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
   

  @tag
Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab User
    Then User should see the Manage user page