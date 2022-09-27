Feature: Search

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"

   Scenario: Verify the presence of search icon and text in the search input filed
    Given User is on any page after Login
    When User is on the Manage user page after clicking User Tab
    Then User should see the search input field with search icon and text as" Search…"


  Scenario: Verify the functionality of search
    Given User is on Manage user page
    When User types random text in search field which has no matching entry
    Then No rows is displayed