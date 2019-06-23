#Author: syntax team   // john.smith@wellsfargo.com
@sprint3
Feature: Add Employee

  Background: 
    Given I logged into Orange HRM
    And I click PIM link
    And I click on Add Employee Link

  @smoke @addEmployee
  Scenario Outline: Add Employee
    When I provide "<FirstName>", "<MiddleName>", "<LastName>" and "<Location>"
    And I  click on Save Button
    Then Employee "<FirstName>", "<LastName>" successfully added

    Examples: 
      | FirstName | MiddleName | LastName | Location |
      | Jane      | B          | Smith    | HQ       |

  #     | Jack      | F          | Cruz     | BraRio001 |
  #     | John      | E          | Merro    | RusOms001 |
  #     | Jackson   | U          | Zubble   | BelBru001 |
 
@test
  Scenario Outline: Add Employee and Create Login Details
    When I provide "<FirstName>", "<MiddleName>", "<LastName>" and "<Location>"
    And I click on create login details
    And I provide "<username>","<password>"
    And I  click on Save Button
 #   Then Employee "<FirstName>", "<LastName>" successfully added

    Examples: 
      | FirstName | MiddleName | LastName | Location  | username | password      |
      | Jane      | B          | Smith    | HQ        | user112233    | SyntaxUser1!@ |
      | Jack      | F          | Cruz     | BraRio001 | user222233    | SyntaxUser2!@ |

  #     | John      | E          | Merro    | RusOms001 | user334455    | SyntaxUser3!@ |
  #     | Jackson   | U          | Zubble   | BelBru001 | user444455    | SyntaxUser4!@ |
 
 @temp
  Scenario: Add Employee Labels verification
    Then I see following labels
      | First Name  |
      | Middle Name |
      | Last Name   |
      | Employee Id |
      | Location    |
