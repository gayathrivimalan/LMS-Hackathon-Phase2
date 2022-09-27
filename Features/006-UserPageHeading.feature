Feature: Page heading

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"

  @tag1
  Scenario: Verify the Manage user page heading
    Given User is on any page after Login
    When User is on the Manage user page after clicking User Tab
    Then User should see the page heading as "Manage User"
