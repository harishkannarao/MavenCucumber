Feature: CustomService features

  @sanity
  Scenario: should return greeting for a name
    Given I pass the name as "Harish" to getMessage method of customService
    Then I should see the message as "Hello Harish!!!" from getMessage method of customService
