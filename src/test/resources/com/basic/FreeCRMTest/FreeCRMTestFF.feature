
Feature: Free CRM Test

  Scenario: CRMPage Log in Test
    Given freeCRM login page is ready
   	When user enters user name and passwod 
   	Then homepage is loaded 
   	Then close the webdriver