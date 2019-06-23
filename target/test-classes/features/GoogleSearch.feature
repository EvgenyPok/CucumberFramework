#Author: your.email@your.domain.com
Feature: Google Search
  

 
  Scenario: Search in Google by typing
    Given I navigated to the google.com website
    When I type in a search string
    And I click on google search button
    Then I see the search results are displayed
    And I close browser
