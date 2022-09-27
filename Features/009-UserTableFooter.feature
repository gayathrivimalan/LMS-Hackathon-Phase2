Feature: Table Footer

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
  Scenario: Verify table footer
    Given User login in to the LMS website
    When User lands Manage user page
    Then User should see the table footer as "In total there are 4 users".
