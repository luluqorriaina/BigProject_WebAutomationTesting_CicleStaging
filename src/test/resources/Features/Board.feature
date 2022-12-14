@Board
Feature: Board Automation Testing
  Background: User is already at Team's Homepage Menu

  @BoardPositive1
  Scenario: User creates a new list
    Given User clicks Board menu
    When User clicks Add List button
    And User inputs list name "List Web Automation"
    And User clicks Create button
    Then A new list will be created

  @BoardPositive2
  Scenario: User creates a new private card
    Given User clicks Board menu
    When User clicks Add Card on List Web Automation
    And User inputs Card name "Card Web Automation"
    And User clicks Private Card button
    And User clicks Add Card button
    Then A new private card will be created

  @BoardPositive3
  Scenario: User changes the private card to public
    Given User clicks Board menu
    When User clicks Edit Card Menu button
    And User clicks Public Card button
    Then the private card will be changed to public

  @BoardPositive4
  Scenario: User changes due date and time
    Given User clicks Board menu
    When User clicks Card Web Automation
    And User clicks Due Date button
    And User clicks calendar icon
    And User clicks date button
    And User changes the due time
    And User clicks Save button
    Then due date and time will successfully changed

  @BoardPositive5
  Scenario: User sets list as Complete
    Given User clicks Board menu
    When User clicks three dots button on List Web Automation
    And User clicks Set as a Complete List menu
    Then The list will be set as complete

  @BoardNegative1
  Scenario: User creates a new list without list name
    Given User clicks Board menu
    When User clicks Add List button
    And User clicks Create button
    Then User will fail to create a new list