Feature: CustomerService extended features

  Scenario: should return null for name as null
    Given I pass the name as null to getMessage method of customService
    Then I should see the message as null from getMessage method of customService