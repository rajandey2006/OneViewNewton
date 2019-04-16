@AllocateRolestoProject
Feature: Opportunity

  Scenario: Creating a new Project
	Given user log in to FFUAT sandbox
	Then user clicks on createnew label
	Then user clicks 'Project' from dropdown list
	Then user move to 'Select Project Record Type' Page
	And user clicks on 'Continue' button
	Then user move to 'New project' Edit page
	And user complete the new project details
	  | AccountName | ProjectName | ProjectType | Region | Sector | ProjectFees | StartDate | DurationInWeeks | Probability | SalesLead   |
	  | ACA         | New         |             | UK     | Air    | 10000       |           | 4               | 50          | Adam Walker |
	And user clicks on 'Save' button
	Then user navigate to "<Project Detail>" Page
	Then user move the OpportunityStage from stage five to stage four
	Then user move the OpportunityStage from stage four to three
	Then user move the OpportunityStage from stage three to two
	



