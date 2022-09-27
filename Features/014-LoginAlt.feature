Feature: LoginAlt

Background: The User opens login Page
	Given User Launches Chrome Browser
	When user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	Then User should see the Login page title "LMS"

Scenario Outline: Validating the Login functionality
    When User enters Username as "<username>" and Password as "<password>" 
    Then User clicks on Login button with expected status as "<status>"
    Then User should see the LMS Home page on successful login status "<status>"
    
 Examples:
    | username | password   | status      |
    |          |            | Both Fail   |
    | Valid    |            | Missing Password  |
    |          | Valid      | Please enter your user name                      |
    | Valid    | Invalid    | Invalid username and password Please try again   |
    | Invalid  | Valid      | Invalid username and password Please try again   |
    | Valid    | Valid      | Pass        |
 



