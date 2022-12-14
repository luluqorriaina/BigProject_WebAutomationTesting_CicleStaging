@Schedule
Feature: Schedule Automation Testing
  Background: User is already at Team's Homepage Menu

  @SchedulePositive1
  Scenario: User creates a new Event with default date and time
    Given User clicks Schedule menu
    When User clicks Create Event button
    And User inputs Event title "Event Web Automation"
    And User inputs notes "Notes event web automation"
    And User clicks Post Event button
    Then A new Event will be created

  @ScheduleNegative1
  Scenario: User creates a new Event without title
    Given User clicks Schedule menu
    When User clicks Create Event button
    And User clicks Post Event button
    Then User will fail to create a new Event
