Feature: Login

Background: Validating the login url
Given User is on the browser
When User opens the LMS Website "https://lms-frontend-phase2.herokuapp.com/"
Then User should see the Login page
Scenario Outline: Validating the Login functionality 
Given User is on the Login Page
Then User fills the form from the given sheetName"<SheetName>" 
Then User should see the LMS Home page


Examples:
|SheetName|
|Data|