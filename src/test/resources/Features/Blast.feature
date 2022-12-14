@Blast
Feature: Blast Automation Testing
  Background: User is already at Team's Homepage Menu

  @BlastPositive1
  Scenario: User creates a new Blast
    Given User clicks Blast menu
    When User clicks Create Blast button
    And User inputs title "Blast Web Automation"
    And User inputs description "Web automation testing"
    And User clicks Publish button
    Then A new Blast will be created

  @BlastPositive2
  Scenario: User edits Blast title
    Given User clicks Blast menu
    When User clicks Blast Web Automation
    And User clicks three dots button
    And User clicks Edit button
    And User edits Blast title to "New Blast Title"
    And User clicks Save Changes button
    Then The Blast title is successfully edited

  @BlastPositive3
  Scenario: User edits Blast description
    Given User clicks Blast menu
    When User clicks Blast Web Automation
    And User clicks three dots button
    And User clicks Edit button
    And User edits Blast description to "New blast description"
    And User clicks Save Changes button
    Then The Blast description is successfully edited

  @BlastPositive4
  Scenario: User gives a cheer on the Blast post
    Given User clicks Blast menu
    When User clicks Blast Web Automation
    And User clicks Give Cheers button
    And User inputs "Cheers!"
    And User clicks Emoticon icon
    And User clicks a smiley emoticon
    And User clicks checklist icon
    Then a cheer is successfully given

  @BlastPositive5
  Scenario: User inserts a file on Blast comment section
    Given User clicks Blast menu
    When User clicks Blast Web Automation
    And User clicks Add new comment button
    And User clicks Insert Files button
    And User browses and picks a file
    And User checklists the file
    And User clicks Insert button
    And User clicks Post button
    Then A file is successfully inserted on Blast comment section

  @BlastNegative1
  Scenario: User creates a new Blast without title and description
    Given User clicks Blast menu
    When User clicks Create Blast button
    And User clicks Publish button
    Then User will fail to create a new Blast


