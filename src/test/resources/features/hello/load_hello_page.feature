Feature: Show Hello page

  Try to load hello page and get a "hello" salute

  Scenario: one ask the hello page to be loaded
    Given I have loaded hello page
    Then I should see 'hello' world somewhere