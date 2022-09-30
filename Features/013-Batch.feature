Feature: Batch Heading   
Background: The User opens login Page
	Given User Launches Chrome Browser
	When  user opens LMS  portal link "https://lms-frontend-phase2.herokuapp.com/login"
	When  User enters Username and Password 
    Then  User clicks on Login button with expected status as "<status>"
  
 
    Scenario: Validate the heading
    Given  User is on the LMS Home program page
    When User clicks Batch button on top
    Then User should see a heading with text Manage Batch on the page
    
    Scenario: Validating the default state of Delete button 
    When User is on Batch page1
    Then Verify that the Delete button next to the search box is Disabled
#    
#    Scenario: Validate that number of records (rows of data in the table) displayed 
#    When User is on Batch pages
#    Then Verify that number of records (rows of data in the table) displayed on the page are 5
#
#    Scenario: Search by Batch Name
#    When user clicks on search box with "Batch Name" entered in it
#    Then records of that  "Batch Name" are displayed
#
#    Scenario: Edit Feature
#    When User clicks on Edit button1
#    Then User lands on Batch Details form.
#
#    Scenario: Edit Batch Name
#    When User "edits Name"
#    Then User can see edited Name
#
#    Scenario: Edit  Batch Description
#    When user edit "edits description"
#    Then User can see edited descricption
#
#Scenario: Edit program name
#    When user prog "edits program name"
#    Then user can see edited program name
#
#Scenario: change status
#      When user changes status
#    Then User can see updated Status
#
#    Scenario: Edit No of classes
#    When user edits "No of classes"
#    Then user can see updated No of classes
#
#    Scenario: Click Cancel1
#    When user clicks cancel button
#    Then User can see Batch Details are not updated
#
#    Scenario: click save
#    When user clicks save button in batch
#    Then User can see Successful Batch Updated alert
#
#    Scenario: Verify Edited BatcH details  
#    When User searches with newly updated "Batch Name"
#    Then User verifies that the details are correctly updated.
#
#    Scenario: Select Batch
#    When User selects more than one Batch using checkbox
#    Then Baches gets selected
# 
#    Scenario: Delete  multiple batches 
#    When User clicks on Delete button
#    Then User lands on Confirm Deletion form.
#
#    Scenario: Click Yes
#    When User clicks Yes buttona
#    Then User can see 'Successful BatchDeleted' message
#
#Scenario: Verify deleted batches
#    When User Searches for "Deleted Batch names"
#    Then There should be zero results.
#
#   Scenario: click no
#    When User clicks No buttona
#    Then User can see Batches are still selected and not deleted
#
#    Scenario: delete feature  
#    When user clicks delete  button for any batch
#    Then user will get confirm deletion popup
#
#Scenario: Click Yes    
#    When User clicks Yes buttoN
#    Then User can see 'Successful BatchDeleted' messagE
#
#    Scenario: Verify deleted batch    
#    When User Searches foR "Deleted Batch name"
#    Then There should be Xero results.
#
#    Scenario: click no  
#    When User clicks NO bUtton
#    Then User can see Batch is not deleted.
#
#    Scenario: Add Batch   
#    When User clicks A New Batch button
#    Then user can see Batch details form
#
#    Scenario: Empty form submission    
#    When User clicks Save button without entering data1
#    Then User gets message Name is requireda
#
#    Scenario: Click Cancel  
#    When User clicks Cancel button0
#    Then User can see Batch Details form disappears
#
#     Scenario: Enter Batch Name  
#    When user enters "name" in text box
#    Then User can see Name entereda
#
#    Scenario: Enter Program name   
#    When User selects "Program name"
#    Then User can see 'Program Name' selected
#
#    Scenario: Select Status  
#    When User selects Status using radiobutton
#    Then User can see 'Active/Inactive' status selected
#
#    Scenario: Enter No of classes  
#    When User enters 'No of classes' in text boxv
#    Then User can see 'No of classes' entered
#
#    Scenario: Click Save
#    When User clicks Save button
#    Then User gets message 'Successful batch created'
#
#    Scenario: Verify Added Batch is created   
#    When User searches with newly created "Batch Name"
#    Then records of the newly created  "Batch Name" is displayed
#
#    
#    Scenario: Verify previous link on the first page  
#    When User is on first page of Manage Batch 
#    Then Verify that previous link is disabled
#
#    Scenario: Verify next link  
#    When User clicks navigate > buttons
#    Then User navigated to page number '2'
#
#    Scenario: Verify previous link   
#    When User clicks navigate < buttonss
#    Then User navigated to page number '1'
#
#    Scenario: Verify next link on the last page
#    When User is on last page of Manage Batch
#    Then Verify that next link is disabled
#
#   
#    Scenario: Verify that the results are displayed in Ascending order of Batch name
#    When User clicks on the Ascending arrow (down ) near to the Batch name 
#    Then User can see the results in Ascending order of Batch name
#
#    Scenario: Verify that the results are displayed in Ascending order of batch Description
#    When User clicks on the Ascending arrow (down ) near to the Batch Description 
#    Then User can see the results in Ascending order of Batch Description
#
#    Scenario: Verify that the results are displayed in Ascending order of Batch Status
#    When User clicks on the Ascending arrow (down ) near to the Batch Status 
#    Then User can see the results in Ascending order of Batch Status
#
#    Scenario: Verify that the results are displayed in Ascending order No of Classes   
#    When User clicks on the Ascending arrow (down ) near to the No Of Classes
#    Then User can see the results in Ascending order of No of Classes
#
#    Scenario: Verify that the results are displayed in Ascending order of Program Name   
#    When User clicks on the Ascending arrow (down ) near to the Program Name
#    Then User can see the results in Ascending order of Program Name
#  
#   Scenario: Verify that the results are displayed in Descending order of Batch name  
#   When User clicks onthe Descending arrow (down ) near to the Batch name
#   Then User can see the results in Descending order of Batch name
#
#   Scenario: Verify that the results are displayed in Descending order of Batch Description  
#   When User clicks onthe Descending arrow (down ) near to the Batch Description
#   Then User can see the results in Descending order of Batch Description
#
#   Scenario: Verify that the results are displayed in Descending order of Batch Status  
#   When User clicks onthe Descending arrow (down ) near to the Batch Status
#   Then User can see the results in Descending order of Batch Status
#
#   Scenario: Verify that the results are displayed in Descending order No of Classes   
#   When User clicks on the Descending arrow (down ) near to the No Of Classes
#   Then User can see the results in Descending order of No of Classes
#
#   Scenario: Verify that the results are displayed in Descending order of Program Name  
#   When User clicks on the Descending arrow (down ) near to the Program Name
#   Then User can see the results in Descending order of Program Name