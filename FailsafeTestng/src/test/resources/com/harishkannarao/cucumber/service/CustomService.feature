Feature: CustomService features

  Scenario: should return greeting for a name
    Given I pass the name as "Harish" to getMessage method of customService
    Then I should see the message as "Hello Harish!!!" from getMessage method of customService

  Scenario: should return null for name as null
    Given I pass the name as null to getMessage method of customService
    Then I should see the message as null from getMessage method of customService