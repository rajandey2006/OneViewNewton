@NewProjectCreation
Feature: FFDEV Project



Scenario: Creating a new Project
  Given user log in to FFDEV sandbox
  And User is on homepage
  When user clicks on createnew label
  And user clicks "Projectlable" from dropdown list
  Then user navigate to "SelectProjectRecordType" Page
  And user clicks on "Continue" button
  Then user navigate to "NewProjectEdit" Page

  Scenario:
  And user bring up the "NewProjectEdit" Page
  And user complete the form with
    |AccountName    | accountname   |
    |ProjectName    | projectname   |
    |ProjectType    | projecttype   |
    |Region         | region        |
    |Sector         | sector        |
    |ProjectFees    | projectfees   |
    |StartDate      |startdate      |
    |DurationInWeeks| durationinweeks   |
    |Probablity     | probablity        |
    |SalesLead      | saleslead   |
  And user clicks on "Save" button
  Then user navigate to "<string>" Page  




