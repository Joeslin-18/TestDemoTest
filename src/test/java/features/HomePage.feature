Feature: User hits search Engine
  Scenario: User hits search Engine for first time
    Given User opens browser
    When User sees browser address bar
    Then User types Search Engine URL
    And Close the browser