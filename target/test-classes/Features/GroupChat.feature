@GroupChat
Feature: Group Chat Automation Testing
  Background: User is already at Team's Homepage Menu

  @GCPositive1
  Scenario: User sends an alphabets only message
    Given User clicks Group Chat menu
    When User clicks new message text field
    And User types "asdfghj"
    And User clicks send message button
    Then A new alphabets only message will be sent

  @GCPositive2
  Scenario: User sends a numbers only message
    Given User clicks Group Chat menu
    When User clicks new message text field
    And User types "1234567"
    And User clicks send message button
    Then A new numbers only message will be sent

  @GCPositive3
  Scenario: User mentions a member
    Given User clicks Group Chat menu
    When User clicks new message text field
    And User types "@"
    And User chooses a member to be mentioned
    And User clicks send message button
    Then A new message mentioning a member will be sent

  @GCPositive4
  Scenario: User sends a file
    Given User clicks Group Chat menu
    When User chooses a file to be sent
    And User clicks send message button
    Then A file will be sent

  @GCPositive5
  Scenario: User deletes a message
    Given User clicks Group Chat menu
    When User clicks Menu Message on a selected chat
    And User clicks Delete Message option
    And User clicks Delete on the popup message
    Then The selected message will be deleted

  @GCNegative1
  Scenario: User mentions a non member
    Given User clicks Group Chat menu
    When User clicks new message text field
    And User types "@nisa"
    Then User will fail to mention a non member of the Group Chat

