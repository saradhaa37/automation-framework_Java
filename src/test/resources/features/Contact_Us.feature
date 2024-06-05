Feature: Webdriver - contact us page
  Scenario: Validate successful contact us page creation
    Given I access the contact us page
    When I fill the first name
    And I enter last name
    And I enter email address
    And I enter comments
    And I click submit button
    Then I should see successful message