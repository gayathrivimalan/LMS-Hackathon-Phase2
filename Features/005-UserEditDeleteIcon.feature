@tag5
Feature: Verify Edit/Delete icon in each row

Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
   @tag5
Scenario: Edit Delete presence
    Given User in Login page
    When User come to Manage user page after clicking User Tab
    Then User should see the buttons with edit/delete icon in each row of Edit/Delete coulmn
@tag5
  Scenario: Updating with Edit button
    Given User table is displayed in UserPage
    When User clicks Edit button
    Then "User Details" dialog box should be displayed for editing
    
    
@tag5
  Scenario: Fucntionality of delete button
    Given User table in manage user page
    When User clicks delete button
    Then Confirm dialog box should be displayed with Text Are you sure you want to delete (selected user name) ? , button with text No , the button with text yes and close(X) icon
