#@NewProjectCreation
Feature: FFDEV Login

Scenario: Verify the Login functionality
  Given user opens browser
  And user is on FFDEV Sandbox login page
  And user enters username
  And user enters   password
  And user clicks on login to sandbox button
  Then FFDEV Sanbox home page displays




