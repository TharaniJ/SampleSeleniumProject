Feature: karate script for get pet user info in the pet store.

  Scenario: get the pet user by name
    Given url 'https://petstore.swagger.io/v2/user/Ram'
    When method GET
    Then status 200
    Then print response