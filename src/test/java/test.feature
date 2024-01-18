Feature: Example cucumber Rest Assured

  Scenario: User call api to get users list
    Given I call the api service
    When I sent the get method to request the list of the user
    Then The response is ok
















