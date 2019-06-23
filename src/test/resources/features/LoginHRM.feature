#Author: syntax team   // john.smith@wellsfargo.com
@sprint3 @login
Feature: Login to HRM

  Background: 
    Given I see OrangeHRM logo

  @smoke @login 
  Scenario: valid login
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  @regression
  Scenario: invalid login
    When I enter invalid username and password
    And I click login button
    Then I see error message is displayed

  @regression
  Scenario: Error Message Validation
    When I enter invalid username and password I see errorMessage
      | UserName | Password   | ErrorMessage        |
      | Admin    | Test123    | Invalid Credentials |
      | Admin1   | Syntax123! | Invalid Credentials |
