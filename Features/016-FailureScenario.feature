Feature: Title verification
Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
    
Scenario: Verify that the title of the Home page is "LMS"
	When Home Page title should be "LMS"
	But the user mentioned as "Numpy Ninja"