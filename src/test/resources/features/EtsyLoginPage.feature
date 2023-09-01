#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@etsyLoginPage
Feature: Go to etsy.com and verify login works and search function works
  As online shopping site, logging in and searching is very important

  @registerFunction
  Scenario Outline: Etsy Login Feature
    Given User went to etsy landing page
    And Clicked on sign in link
    And User should be directed to registration page and see "Create your account" on the page
    When User enters "<email>" and "<firstName>" and "<password>"
    And Clicked register button
    Then User should see an error message

    Examples: 
      | email                  | firstName | password  |
      | elysium306@hotmail.com | Elysium   | test@1234 |

  @loginFunction
  Scenario Outline: Login to Etsy.com with valid and invalid data
    Given User went to etsy landing page
    And Clicked on sign in link
    When Attempted to login with "<username>" and "<password>"
    And Unchecked stay signed in checkbox
    When User clicked on signin button
    Then User should be logged in and see welcome message

    Examples: 
      | username               | password   |
      | elysium306@hotmail.com | test@1234  |
      | john.doe@abc.com       | test@12345 |
